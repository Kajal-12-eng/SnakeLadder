package com.sankelad;

public class SnakeLadder {
	public static void main (String[] args) {
		System.out.println("Welcome to snake and Ladder Game");
		int playerPosition = 0;
		System.out.println("starting position of the player is:" + playerPosition);
		
		int die = (int) (Math.floor(Math.random() *10)%6+1);
		System.out.println("Die rolled is:" + die );
		
			
		int randomCheck = (int) (Math.floor(Math.random() *10)%3);
		  switch(randomCheck) {
		  case 0 :
		  	System.out.println("no play");
		  	playerPosition  += 0;
		        System.out.println("player position is :" + playerPosition);
			break;
		case 1:
			System.out.println("ladder");
			playerPosition  += die;
			System.out.println("player position is :" + playerPosition);	  
			break;
		default:
			System.out.println("Snake") ;
			playerPosition  -= die;
			System.out.println("player position is :" + playerPosition);	  
			break;
		  }
	}
}
