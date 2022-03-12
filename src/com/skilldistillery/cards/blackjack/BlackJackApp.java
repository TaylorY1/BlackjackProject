package com.skilldistillery.cards.blackjack;

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
		//LOGIC OF THE GAME GOES HERE! 
		//shuffle cards now
		// 
	}
	}

}
// menu lives here 
// casino class? 
//blackjack table? dealer and player

//what happens when I run main?

// mirror the real world with your classes
// what needs to happen when? 