package 장소;

import java.util.Scanner;

import Animal.강아지;
import Animal.독수리;
import Animal.뱀;
import Animal.상어;
import Main.사냥꾼;

public class 동물보호협회 extends Place{
	Scanner in=new Scanner(System.in);
	private static 동물보호협회 instance=null;
	private int 감시성공확률=70;
	private 동물보호협회() {

	}

	public static 동물보호협회 getInstance() {
		if(instance==null)
			instance=new 동물보호협회();

		return instance;
	}
	public void set감시성공확률(int percent) {
		this.감시성공확률=percent;
	}
	public int get감시성공확률() {
		return this.감시성공확률;
	}

	public void 감시하기(사냥꾼 hunter,int num,숲속 forest) {
		//감시확률 70퍼
		감시성공확률-=hunter.get은신력();//은신력이 높을수록 감시성공확률이 떨어진다.
    	int r=(int)(Math.random()*1000)% 100;//0~99
    	
    	if(forest.getAnimal(0)==null)
			System.out.println("동물이 없습니다.");	
    	else {
    		if (num==1) {
    			if( r < 감시성공확률)
    			{
    				System.out.println("동물보호협회의 감시에 걸렸습니다! 사냥에 실패하였습니다!");
    				hunter.set돈주머니('-', 10000);
    				System.out.println("10000원의 벌금을 지불합니다! 현재 돈주머니 상태: "+hunter.get돈주머니());
    			}
    			else
    				hunter.사냥하기();
    		}
    			
    		if(num==2)
    			{
    			int n=in.nextInt();
    			if( r < 감시성공확률)
    			{
    				if(forest.getAnimal(n) instanceof 강아지)
    				{
    				System.out.println("동물보호협회의 감시에 걸렸습니다! 사냥에 실패하였습니다!");
    				hunter.set돈주머니('-', 10000);
    				System.out.println("10000원의 벌금을 지불합니다! 현재 돈주머니 상태: "+hunter.get돈주머니());
    				}
    				else
    					System.out.println("강아지가 아닙니다!");
    			}
    			else if(forest.getAnimal(n) instanceof 강아지)
    				hunter.사냥하기(n);
    			else
    				System.out.println("강아지가 아닙니다!");
    			}
    		if(num==3)
    		{
    			int n=in.nextInt();
    			if( r < 감시성공확률)
    			{
    				if(forest.getAnimal(n) instanceof 뱀)
    				{
    				System.out.println("동물보호협회의 감시에 걸렸습니다! 사냥에 실패하였습니다!");
    				hunter.set돈주머니('-', 10000);
    				System.out.println("10000원의 벌금을 지불합니다! 현재 돈주머니 상태: "+hunter.get돈주머니());
    				}
    				else
    					System.out.println("뱀이 아닙니다!");
    			}
    			else if(forest.getAnimal(n) instanceof 뱀)
    				hunter.사냥하기(n);
    			else
    				System.out.println("뱀이 아닙니다!");
    			}
    		if(num==4)
    		{
    			int n=in.nextInt();
    			if( r < 감시성공확률)
    			{
    				if(forest.getAnimal(n) instanceof 독수리)
    				{
    				System.out.println("동물보호협회의 감시에 걸렸습니다! 사냥에 실패하였습니다!");
    				hunter.set돈주머니('-', 10000);
    				System.out.println("10000원의 벌금을 지불합니다! 현재 돈주머니 상태: "+hunter.get돈주머니());
    				}
    				else
    					System.out.println("독수리가 아닙니다!");
    			}
    			else if(forest.getAnimal(n) instanceof 독수리)
    				hunter.사냥하기(n);
    			else
    				System.out.println("독수리가 아닙니다!");
    			}
    		if(num==5)
    		{
    			int n=in.nextInt();
    			if( r < 감시성공확률)
    			{
    				if(forest.getAnimal(n) instanceof 상어)
    				{
    				System.out.println("동물보호협회의 감시에 걸렸습니다! 사냥에 실패하였습니다!");
    				hunter.set돈주머니('-', 10000);
    				System.out.println("10000원의 벌금을 지불합니다! 현재 돈주머니 상태: "+hunter.get돈주머니());
    				}
    				else
    					System.out.println("상어가 아닙니다!");
    			}
    			else if(forest.getAnimal(n) instanceof 상어)
    				hunter.사냥하기(n);
    			else
    				System.out.println("상어가 아닙니다!");
    			}
    	}
	}
}
