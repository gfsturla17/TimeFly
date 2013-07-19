package ch02;

import java.util.Scanner;

import ch02.stringLogs.Cards;

public class DeckDriver {
	public static final void main(String[] args){
		DeckOfCards deck2 = new DeckOfCards();
		
		//deck2.shuffle();
		Scanner conIn = new Scanner(System.in);
		boolean deal = true;
		String answer;
		
		while(deal){
			System.out.println(deck2.dealCard());
			System.out.println(deck2.cardsLeft());
			System.out.println();
			System.out.println("deal again? y/n");
			answer = conIn.next();
			
			if(answer.equals("n")){
				deal = false;
			}
		}
		

		
		
		
		
	}

}
	
