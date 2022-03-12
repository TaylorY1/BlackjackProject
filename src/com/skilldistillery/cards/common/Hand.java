package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
 	private List<Card> hand = new ArrayList<>();
	// 
		
 		public void addCardToHand(Card card) {
 			hand.add(card);
 			//ENGLISH First
 		}
 	
		public void cardsInHand() {
			
			
			// display cards
		}

}
// LOOP THROUGH CARDS AND DETERMINE NEXT ACTION 