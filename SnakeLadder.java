package com.sankelad;

public class SnakeLadder {
	
	public static void main (String[] args) {
		System.out.println("Welcome to snake and Ladder Game");
		int playerPosition = 0;
		int winningPosition = 100;
		int dieCount = 0;
		while(winningPosition > playerPosition)
		{
		int die = (int) (Math.floor(Math.random() *10)%6+1);
		dieCount++;
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
			if(playerPosition > 100)
		          playerPosition  -= die;	   
		          System.out.println("player position is :" + playerPosition);
			  break;
		 case 2:
			 System.out.println("Snake") ;
			 playerPosition  -= die;
			 if (playerPosition < 0)
			   playerPosition = 0;
			   System.out.println("player position is :" + playerPosition);
				}
			}
		 System.out.println("Dice rolled is:" + dieCount+ "times");
		}
   }
