package ch02.stringLogs;

public class Cards {
	protected  int rank;
	protected int suit;
	protected String stringRank;
	protected String stringSuit;
	protected String summary;
	
	public Cards(int rank, int suit){
		this.rank = rank;
		this.suit = suit;
		
	}
	
	public int getSuit(){
		return suit;
	}
	
	public int getRank(){
		return rank;
	}
	
	public String toString(){
		
		switch(rank){
		
		case 1:
			stringRank = "Ace";
			break;
		case 2:
			stringRank = "Two";
			break;
		case 3:
			stringRank = "Three";
			break;
		case 4:
			stringRank = "four";
			break;
		case 5:
			stringRank = "five";
			break;
		case 6:
			stringRank = "six";
			break;
		case 7:
			stringRank = "seven";
			break;
		case 8:
			stringRank = "eight";
			break;
		case 9:
			stringRank = "nine";
			break;
		case 10:
			
			stringRank = "ten";
			break;
		case 11:
			stringRank = "Jack";
			break;
		case 12:
			stringRank = "Queen";
			break;
		case 13:
			stringRank = "King";
			break;
			
		default:
			stringRank = "invalid";
			break;
		}
		
		switch(suit){
		
		case 1: 
			stringSuit = "Clubs";
			break;
		case 2:
			stringSuit = "Diamonds";
			break;
		case 3:
			stringSuit = "Hearts";
			break;
		case 4:
			stringSuit = "Spades";
			break;
			
		default:
			stringSuit = "Invalid";
			break;
		}
		
		summary = stringRank + " of " + stringSuit;
		return summary;
		
	}

}
