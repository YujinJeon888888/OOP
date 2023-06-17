package ��ü����;

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
    		System.out.println("�¾ҽ��ϴ�");
    	else
    		System.out.println("Ʋ�Ƚ��ϴ�");
    }

    public void startPlaying(){
    	this.userGuess=getUserInput("������ �Է��Ͻÿ�: ");
    	this.RollDice();
    	this.checkUserGuess();
    }

}
