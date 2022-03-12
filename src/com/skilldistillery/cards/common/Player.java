package com.skilldistillery.cards.common;

import com.skilldistillery.cards.blackjack.BlackJackHand;

public class Player {
	private BlackJackHand playersH = new BlackJackHand();
	
		// what does player have?
	
	// what does a player do?
	
	public void addCardToHand(Card card) {
		playersH.addCardToHand(card);
	}
	
}
