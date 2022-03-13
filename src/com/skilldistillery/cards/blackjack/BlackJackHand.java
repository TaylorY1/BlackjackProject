package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackJackHand extends Hand {

	public boolean isBust() {
		int value = this.valueOfHand();

		if (value > 21) {
			return true;
		}
		return false;

	}

	@Override
	public int valueOfHand() {
		int handValue = 0;

		for (Card card : hand) {
			handValue += card.getValue();

		} 

		return handValue;
	}

	public boolean isBlackJack() {
		if (this.valueOfHand() == 21) {
			return true;
		}
		return false;
	}

	public void stay() {
		System.out.println("I choose to stay.");

	}
	
	public void valueOfDHand() {
		int dealersHandValue = 0;
		for (int i = 1; i < hand.size(); i++) {
			for (int j = 1; j < hand.size(); j++) {
				dealersHandValue = j;
				
				System.out.println(dealersHandValue);
			}
		}
	}
	


}
