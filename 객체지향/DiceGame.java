package 객체지향;

import java.util.Scanner;

public class DiceGame {
    private int diceFace;
    private int userGuess;

    private void RollDice(){
    	this.diceFace=(int)(Math.random()*6)+1;
    }

    private int getUserInput(String msg){
    	Scanner s=new Scanner(System.in);
    	System.out.print(msg);
        return s.nextInt();
    }

    private void checkUserGuess(){
    	if(this.diceFace==this.userGuess)
    		System.out.println("맞았습니다");
    	else
    		System.out.println("틀렸습니다");
    }

    public void startPlaying(){
    	this.userGuess=getUserInput("예상값을 입력하시오: ");
    	this.RollDice();
    	this.checkUserGuess();
    }

}
