package com.skilldistillery.cards.common;

import com.skilldistillery.cards.blackjack.BlackJackHand;

public class Player {
	private BlackJackHand playersH = new BlackJackHand();

	public void addCardToHand(Card card) {
		playersH.addCardToHand(card);
	}
	
	public int valueOfPlayersCards() {
		return playersH.valueOfHand();
	}
	public void cardsInHand() {
		playersH.cardsInHand();
	}
	
	public void clearHand() {
		playersH.removeCardsFromHand();
	}

}
