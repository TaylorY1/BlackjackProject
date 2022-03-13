package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	protected List<Card> hand = new ArrayList<>();
	//

	public void addCardToHand(Card card) {
		hand.add(card);
	}

	public void cardsInHand() {
		for (Card card : hand) {
			System.out.println(card.toString());
		}
	}
	
	public abstract int valueOfHand();


	public List<Card> getHand() {
		return hand;
	}


	//public void setHand(List<Card> hand) {
	//	this.hand = hand;
	//}
	public void removeCardsFromHand() {
		hand.clear();
	}
}


