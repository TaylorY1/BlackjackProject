package com.skilldistillery.cards.common;

import com.skilldistillery.cards.blackjack.BlackJackHand;

public class Dealer extends Player {
	private BlackJackHand dealersH1 = new BlackJackHand();
	private Deck deck = new Deck();
	// needs to have a deck
	public void shuffleDeck() {
		deck.shuffle();

	}

	public void dealCard(Player player) {

		Card card = deck.dealCard();
		player.addCardToHand(card);
		
	}
	
	public int valueOfDealersHand() {
		
		return valueOfPlayersCards();
		
		// need to find out how to hide one card
	}
	
	public void cardsInHand() {
			super.cardsInHand();
	}
	

	//	  public int valueMinusOne() { 
	//	  super.cardsInHand();
		//  int dealersMinusOne = 0;
	  
	//  for (int i = 1; i < dealersH1.getHand().size() ; i++) {		  
	 // dealersMinusOne += dealersH1.hand.valueOf(i);
	  
	//  return  dealersH1.hand.get(i);
	  
	//  		} 
	  
	  		
//		  }
	
	  
	  }
 
	  



