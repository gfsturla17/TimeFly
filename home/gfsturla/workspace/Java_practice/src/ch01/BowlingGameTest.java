package ch01;

import java.util.Scanner;

public class BowlingGameTest {
	
	public static void main(String[] args){
		String name;
		boolean currFrame;
		int shot;
		String summary;
		
		
		
		Scanner conIn = new Scanner(System.in);
		
		System.out.println("Enter Name for Bowling Game");
		name = conIn.next();
		
		BowlingGame bg = new BowlingGame(name);
		int frame = bg.getFrame();
		
		currFrame = bg.getCurrFrame();
		while(frame <= 10){
			System.out.println("Enter Shot");
			shot = conIn.nextInt();
			bg.shot(shot);
			currFrame = bg.getCurrFrame();
			
			if (!currFrame){
				System.out.println(bg.toString());
			}
			frame = bg.getFrame();
			
			
		}
		summary = bg.toString();
		System.out.println(summary);
		
	}

}
