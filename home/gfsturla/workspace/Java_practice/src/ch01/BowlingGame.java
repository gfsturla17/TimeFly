package ch01;

public class BowlingGame {
	
	protected String name;
	protected int numberKnocked;
	protected boolean currFrame;
	protected int gameLength;
	protected int score;
	protected int strikes;
	protected int spares;
	protected int gutterBalls;
	protected int frame;
	protected boolean prevStrike;
	protected int currFrameScore;
	protected int ten = 10;

	public BowlingGame(String name){
		this.name = name;
		currFrame = false;
		currFrameScore = 0;
		score = 0;
		strikes = 0;
		spares = 0;
		gutterBalls = 0;
		prevStrike = false;
		frame = 0;
		
	}
	
	public boolean shot(int numberKnocked){
		this.numberKnocked = numberKnocked;
		currFrame = !currFrame;
		
		if (currFrame == true){
			if(numberKnocked != 10 && numberKnocked != 0){
				if(prevStrike){
					score= (2 * numberKnocked) + score;
					currFrameScore = numberKnocked;
					
					
					
					
	
				}else{
					score +=numberKnocked;
					currFrameScore = numberKnocked;
					prevStrike = false;
					
				}
			
			}else if (numberKnocked == 10){
				if(prevStrike){
					score+=20;
					strikes++;
					prevStrike =true;
					frame++;
					currFrameScore = 0;
					currFrame = !currFrame;
					
				}else{
					score+=10;
					strikes++;
					prevStrike =true;
					frame++;
					currFrameScore = 0;
					currFrame = !currFrame;
					
				}
			
				
			}else if (numberKnocked == 0){
				gutterBalls++;
				prevStrike = false;	
				
				
			}
		}else{
			if(numberKnocked != 0){
					if(ten == currFrameScore + numberKnocked){
						spares++;
						score+= numberKnocked;
						currFrameScore = 0;
						prevStrike = false;
						frame++;
						
					}
					else{
						score += numberKnocked;
						currFrameScore= 0;
						frame++;
						prevStrike = false;
					}
				}else{
					
				}
			
			}
		return currFrame;
			
			
			
		}
	
	public String toString(){
		String summary = new String("Frame: " + frame + " Score: " + score + " Strikes: " + strikes + " Spares: " + spares +
				" Gutterballs: " + gutterBalls);
		
		return summary;
	}
	
	public boolean getCurrFrame(){
		return currFrame;
	}
	
	public int getFrame(){
		return frame;
	}
		
		
	}
	
	


