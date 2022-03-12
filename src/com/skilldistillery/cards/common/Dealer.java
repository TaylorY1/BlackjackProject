package com.skilldistillery.cards.common;

public class Dealer extends Player {
	private Deck deck = new Deck();
	// what does a dealer have?

	// needs to have a deck
	public void shuffleDeck() {
		deck.shuffle();

	}

	public void dealCard(Player player) {

		Card card = deck.dealCard();
		player.addCardToHand(card);

	}
	
	// boolean 
	//
	// order of action !!!
  // do while loop with >= 17 && <= 21;
	// method is what dealer does

}
