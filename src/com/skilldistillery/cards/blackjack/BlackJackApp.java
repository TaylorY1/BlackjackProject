package com.skilldistillery.cards.blackjack;

import java.util.Iterator;
import java.util.Scanner;

import com.skilldistillery.cards.common.Dealer;
import com.skilldistillery.cards.common.Deck;
import com.skilldistillery.cards.common.Player;

public class BlackJackApp {
	private Dealer dealer = new Dealer();
	private Player player = new Player();
	private Deck deck = new Deck();
	Scanner sc = new Scanner(System.in);
	boolean enterLoop = true;

	public static void main(String[] args) {
		BlackJackApp blackJackApp = new BlackJackApp();
		blackJackApp.playBlackJack();
	}

	public void playBlackJack() {
		System.out.println("Welcome to BlackJack! Lets get ready to play. . . ");
		System.out.println("Shuffling cards and dealing now");
		 while (enterLoop) {
		dealer.shuffleDeck();
		for (int i = 0; i < 2; i++) {
			dealer.dealCard(player);
			dealer.dealCard(dealer);
		}
		playersTurn();
		dealersTurn();
		results();
	}
	}

	public void playersTurn() {

		System.out.println("The cards you've been dealt are: ");
		player.cardsInHand();
		if (player.valueOfPlayersCards() == 21) {
			System.out.println("BLACKJACK! You win!");
			// move this to before you hit or stay
		}
		System.out.println("The value of your hand is: " + player.valueOfPlayersCards()); 
		System.out.println("The value of the Dealers hand is: " + dealer.valueOfDealersHand());
		System.out.println("and his card is: "); 
		dealer.cardsInHand();// display dealers card
		if (player.valueOfPlayersCards() > 21) {
			System.out.println("You've busted! You lost");

		}
		if (player.valueOfPlayersCards() == dealer.valueOfDealersHand() && player.valueOfPlayersCards() == 21) {
			System.out.println("Its a Draw!");
		}
		while (player.valueOfPlayersCards() < 21) {
			System.out.println("Would you like to hit?");
			System.out.println("Enter 1 for Yes and 2 for No");
			int input = sc.nextInt();
			sc.nextLine();
			if (input == 1) {
				dealer.dealCard(player);
				System.out.println(
						"You have chosen to hit. The value of your hand is now: " + player.valueOfPlayersCards());
				System.out.println("The value of the Dealers hand is: " + dealer.valueOfDealersHand());
				dealersTurn();
			}
			if (player.valueOfPlayersCards() > 21) {
				System.out.println("Busted. You lose. ");
				results();
			}
			if (input == 2) {
				System.out.println("The dealers cards are: ");
				dealer.cardsInHand();
				System.out.println("The value of the dealers hand is: " + dealer.valueOfDealersHand());
				System.out.println("You have chosen to stay. The value of your hand is: " + player.valueOfPlayersCards());
				player.cardsInHand();
				 dealersTurn();
				break;
			}
		}
	}

	public void dealersTurn() {
		while (dealer.valueOfDealersHand() < 17) {
			dealer.dealCard(dealer);
			if (dealer.valueOfDealersHand() > 21) {
				System.out.println("Dealer has drawn a new card and Dealer has busted, player wins!");
			}
			if (dealer.valueOfDealersHand() == 21) {
				System.out.println("Dealer has BlackJack!");
			}

		}

	}
		public void results() {
			if (player.valueOfPlayersCards() > dealer.valueOfDealersHand() && player.valueOfPlayersCards() < 22) {
				System.out.println("You Win!");
			}
				else if (player.valueOfPlayersCards() == dealer.valueOfDealersHand()) {
					System.out.println("Its a draw.");
				}else {
					System.out.println("Dealer Wins!");
				}
			System.out.println("Would you like to play again?");
			System.out.println("Enter 1 for yes or Enter 2 for no.");
			int input = sc.nextInt();
			sc.nextLine();
			if (input == 1) {
				System.out.println("You have chosen to continue to play. . . ");
				player.clearHand();
				dealer.clearHand();
				playBlackJack();
			} else if (input == 2) {
			
				endGame();
			}else {
				System.out.println("Invalid input, please enter a valid input.");
				results();
			}
			//results();
		}
		
		public void endGame() {
			 enterLoop = false;
			System.out.println("You've chosen to quit, have a great day!");
		}
}

