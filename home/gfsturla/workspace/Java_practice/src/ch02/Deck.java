package ch02;

import ch02.stringLogs.Cards;

public interface Deck {
	public void shuffle();
	
	public int cardsLeft();
	
	public Cards dealCard();
	
	public String toString();
	

}


