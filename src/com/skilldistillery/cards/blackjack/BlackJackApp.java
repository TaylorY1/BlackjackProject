package com.skilldistillery.cards.blackjack;

import java.util.Iterator;
import java.util.Scanner;

import com.skilldistillery.cards.common.Dealer;
import com.skilldistillery.cards.common.Player;

public class BlackJackApp {
	private Dealer dealer = new Dealer();
	private Player player = new Player();

	public static void main(String[] args) {
		BlackJackApp blackJackApp = new BlackJackApp();
		blackJackApp.playBlackJack();
	}

	public void playBlackJack() {
		boolean enterLoop = true;
		while (enterLoop) {
			System.out.println("Welcome to BlackJack! Lets get ready to play. . . ");
			System.out.println("Shuffling cards and dealing now");
			dealer.shuffleDeck();
			for (int i = 0; i < 2; i++) {
				dealer.dealCard(player);
				dealer.dealCard(dealer);
			}
			player.cardsInHand();
			int valuePHand = player.valueOfPlayersCards();
		//	int valueDHand = dealer.valueOfDealersHand();

			System.out.println("The value of the cards in your hand is: " + valuePHand);

			System.out.println("How do you choose to proceed? ");
			
			System.out.println("1. To hit");
			System.out.println("2. To stay");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			sc.nextLine();
			/*
			 * ask the player, hit or stay? 
			 * if player hits, deal card to player
			 * if player stays:
			 * 	dealer actions are now -- if over 17, stay, if under 17, hit, if over 21, bust. 
			 */
			switch (input) {
			case 1:
				dealer.dealCard(player);
				if (dealer.valueOfDealersHand() > 17 && dealer.valueOfDealersHand() <=21) {
					System.out.println("Dealer stays.");
				}
				else if (dealer.valueOfDealersHand() < 17)
					dealer.dealCard(dealer);
				else 
					enterLoop = false;
					System.out.println("Dealer busts, you win!");
				
				break;
			case 2:
				System.out.println("The dealers cards are: ");
				dealer.cardsInHand();
				System.out.println("You have chosen to stay. The value of your hand is: ");
				player.valueOfPlayersCards();
				break;
			default:
				System.out.println("Invalid option -- please try again");
				break;
			}
			System.out.println("The value of the dealers hand is: ");
		//	dealer.valueMinusOne();
			dealer.cardsInHand();
			if (dealer.valueOfDealersHand() > player.valueOfPlayersCards() && dealer.valueOfDealersHand() < 21) {
				System.out.println("Dealer Wins!");
			} else {
				System.out.println("You win!");
			}
			System.out.println("Would you like to play again?");
			System.out.println("Press 1 for yes");
			System.out.println("Press 2 for no");
			input = sc.nextInt();
			sc.nextLine();
			switch (input) {
			case 1:
				System.out.println("You have chosen to continue to play. . . ");
				player.clearHand();
				dealer.clearHand();
				break;
			case 2:
				System.out.println("Thanks for playing!");
				enterLoop = false;
				break;
			default:
				System.out.println("Invalid option -- please try again");
				break;
			}

		}
	}

}
// menu lives here 
// casino class? 
//blackjack table? dealer and player

//what happens when I run main?

// mirror the real world with your classes
// what needs to happen when? 
//	add method to deal cards from dealer
// determine what the values are from the cards
// do / while loop?? 

// lots of HAS A logic in this app
//LOGIC OF THE GAME GOES HERE! 
//shuffle cards now
// 