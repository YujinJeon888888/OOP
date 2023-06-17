package 동물농장;
public class 동물테스트 {

	public static void main(String[] args) {
		
//		// TODO Auto-generated method stub
//
//		//자동차 a = new 자동차();
//
//		//로봇  b = new 로봇();
//
//		//강아지 c = new 강아지();
//
//		//
//
//		//Moveable []  m = {a,b,c};
//
//		//
//
//		//System.out.println("----");
//
//		//for(int i=0; i<m.length; i++)
//
//		//m[i].움직이기();
//
//		//System.out.println("----");
//
//		//for(Moveable q : m )
//
//		//q.움직이기();


		
		오리 a = new 오리("오리오리");

		a.놀기();  

		System.out.println("#######");

		강아지 b = new 강아지("댕댕이");

		b.놀기();

		System.out.println("#######");

		동물 c = new 오리("청둥오리");

		System.out.println("#######");

		동물 d = new 강아지("초코초코");

		//오리 2마리, 강아지 2마리가 만들어져 있고, 변수의 참조방법(관점)을 통해 접근할 수 있습니다.

		//이 동물들을 모두 배열에 넣어볼께요. 동물클래스를 상속받았으니 동물타입으로 사용할 수 있어요.

		동물 [] 동물농장 = {a,b,c,d, new 강아지("멍멍이1"),new 오리("뒤뚱뒤뚱오리")};//오리클래스인데 
		//클래스: 동물// 클래스: 강아지, 오리
		//자동 형변환?
		//동물농장[1].<-동물기능, 변수만뜸

		System.out.println("-----------------------------------------------");

		System.out.println("동물농장에 있는 모든 동물들이 어떻게 노는지 살펴봅니다!");

		//방법1(동물에서 구현되어 있으니까)
		for(동물 animal : 동물농장)  //count할 목적이 아니므로 for-each문장도 써봅니다.

		animal.놀기(); //animal.으로 볼 수 있는 것들을 확인해보세요
		//실체: 각 동물들-> 놀기 했을 때 오버라이딩 된 메소드 호출됨.
		
		//Playable [] 놀줄아는객체들  = {a,b,c,d, new 강아지("멍멍이1"),new 오리("뒤뚱뒤뚱오리")};

		
		
		//방법 2
		Playable [] 놀줄아는객체들 = (Playable []) 동물농장;  //playable: 위에 있음. -> playable의 시야에서 객체 바라봄-> 구현된 메소드 실행됨
		
		
		
		
		
		Playable qq=new 강아지("멍멍멍!");// 방법 3

		System.out.println("-----------------------------------------------");

		System.out.println("놀줄아는객체들이 어떻게 노는지 살펴봅니다!");

		for(Playable p : 놀줄아는객체들)//playable 참조변수에 놀줄아는 객체들 연결
		
		p.놀기();  //animal.으로 볼 수 있는 것들을 확인해보세요
		
		System.out.println(" ================================");
		오리 오리=new 오리();
		오리.움직이기();

		System.out.println("*******************************");
		동물 A=new 강아지();
		if(A instanceof 강아지)
			System.out.println("Yes");
		else
			System.out.println("nop");
		if(A instanceof 동물)
			System.out.println("Yes");
		else
			System.out.println("nop");
		}



		}

