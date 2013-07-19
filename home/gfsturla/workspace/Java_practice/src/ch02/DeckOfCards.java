package ch02;

import java.util.Random;

import ch02.stringLogs.Cards;

public class DeckOfCards implements Deck{
	Cards[] deck;
	int cardsLeft=52;
	int max = 0;
	
	public DeckOfCards(){
		deck = new Cards[52];
		
		for(int i = 1; i<=4; i++){
			for(int j = 1; j<=13; j++){
				deck[max]= new Cards(j, i);
				max++;
			}
		}
		max = 0;
	}
	

	@Override
	public int cardsLeft() {
		// TODO Auto-generated method stub
		return cardsLeft;
	}

	@Override
	public Cards dealCard() {
		if(cardsLeft > 0){
			Cards dealt = deck[0];
			
			for(int i = 0; i<deck.length-1; i++){
				deck[i]=deck[i +1]; 
			}
			deck[deck.length-1] = dealt;
			cardsLeft--;
			return dealt;	
		}else{
			shuffle();
				
			Cards dealt = deck[0];
			for(int i = 0; i<deck.length-1; i++){
					deck[i]=deck[i +1];
			}
			deck[deck.length-1] = dealt;
			cardsLeft--;
			return dealt;
		}
		
	}



	@Override
	public void shuffle() {	
		Random generator = new Random();
		int random; 
		
		Cards temp;
		for(int i = 0; i < deck.length; i++){
			random = generator.nextInt(deck.length);
			temp = deck[i];
			deck[i] = deck[51 -random];
			deck[51-random] = temp;
		}
		cardsLeft = 52;	
	}
	
	public void show(){
		for(Cards card : deck){
			System.out.println(card.toString());
		}
	}
	
	
}

