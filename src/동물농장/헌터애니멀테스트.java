package 동물농장;

import java.util.Scanner;



public class 헌터애니멀테스트 {



	public static void show메뉴() {

		System.out.println("-----------------------------------------------------------------------");

		System.out.println("메뉴:  1.강아지    2.뱀   3.독수리    4. 상어     ......... 8.랜덤생성  9.종료  0.사냥하기");

		System.out.println("-----------------------------------------------------------------------");



	}





	public static void 사냥하기(동물 [] animals) {





		System.out.println("아무 동물이나 사냥을 해봅니다. 성공확률은 50% !");

		int 사냥감위치 = (int)(Math.random()*1000) % 동물.numOfAnimals;  //배열내의 동물 위치. 나머지로

		System.out.println("사냥감 위치의 동물은 " + animals[사냥감위치].이름 +"입니다. 잡을 수 있을까요? ");

		int r = (int)(Math.random()*1000) % 2;  // 50%를 주는 방법은 여러가지, 나머지는 0또는 1로 되니까. 2분의1

		동물 사냥한동물 = animals[사냥감위치];



		//1이면 사냥성공. 

		if (r==1) {

			animals[사냥감위치]=null;//없앰

			System.out.println(사냥한동물.이름 +"사냥에 성공했습니다!");



			animals[사냥감위치] = animals[동물.numOfAnimals-1]; //맨 뒤의 동물을 빈자리로 옮겨두기(안 그러면 에러나니까), 엄마가방에 보관하고 짱구거 null 짱구 핸드폰 생각하기
			animals[동물.numOfAnimals-1]=null;
			동물.numOfAnimals--; 



		}

		else System.out.println(사냥한동물.이름 +"사냥에 실패했습니다!");



	}



	public static void  showAnimals(String 장소,동물 [] animals) {



		System.out.printf("[%s]에 총 %d 마리의 동물이 있습니다. \n", 장소, 동물.numOfAnimals);//동물.num..으로 에러줄임
		//나머지는 0부터 동물수-1이니까.


		//for(동물 a:animals)

		//System.out.println("동물이름 :" + a.이름);

		//

		for(int i=0; i<동물.numOfAnimals; i++)

			System.out.println("동물이름 :" + animals[i].이름);//실체의 이름이 뽑힘



	}



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);

		동물 [] 숲속 = new 동물[10]; //10개정도.

		int menu;

		int i=1;

		int k=0;

		showAnimals("숲속",숲속);
		//생성을 위한 반복문
		while(true) {



			if(k==10) {

				System.out.println("동물농장이 꽉 찼습니다! ");

				break;

			}

			show메뉴();

			System.out.print("메뉴 : " );

			menu=input.nextInt();

			if (menu==9)
				break;
			//++이 뒤에 있음-> 0 넣고나서 플러스 함.
			if(menu==1) 숲속[k++]=new 강아지("댕댕이"+ i++);

			if(menu==2) 숲속[k++]=new 오리("오리"+ i++);

			if(menu==3) 숲속[k++]=new 독수리("수리수리"+ i++);

			if(menu==4) 숲속[k++]=new 상어("샤크샤크"+ i++);
			
			if(menu==0) 사냥하기(숲속);
	

			showAnimals("=숲속=",숲속);

		}

		//메뉴를 위한 반복문(종료하면 뜨는 메뉴)
		while(true)
		{
			System.out.println("1.숲속보기  2.사냥하기 9.종료");
			menu=input.nextInt();

			if (menu==9)//또 9누르면 종료.
				break;
			if(menu==1) showAnimals("=숲속=",숲속);
			if(menu==2) 사냥하기(숲속);
		}

	}



}

