package 상속_다형성_인터페이스_랩;

public class Main {
	//익명클래스 사용 예
	//굳이 클래스 하나하나 만들 필요 없이 
	//같은 강아지인데 동작이 좀 다르면 익명클래스로 오버라이딩 하면 됨
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 강아지 흰둥이=new 강아지();//일반적인 강아지 흰둥이
		 //1회성 강아지 만들고 싶어도 클래스 따로 만들까? 
		 //no
		 //익명클래스 사용하기
		 //사용법: 생성할 때!!! 중괄호!!!!
		 강아지 퉁퉁이=new 강아지() {//퉁퉁이에게만 적용되는 코드. 기존 강아지 클래스에는 적용되지 않음!
			 public void 예쁘게짖기() {
				  for(int i=0;i<5;i++) {
					  System.out.println("오라와로아ㅘ롸왈");
				  }
			 }
			 public void 기다리기(){
			    	System.out.println("시러 -_-^");
			    }
		 };//세미콜론 붙여야함!! 이건 함수가 아니라 문장이니까. 
		 
		 강아지 옆집요롱이=new 강아지() {
			 public void 예쁘게짖기() {
				 System.out.println("헥헥 난 못 짖어요");
			 }
			 public void 기다리기(){
			    	System.out.println("넹");
			    }
			 public void 실험용() {
				 System.out.println("테스트되나");
			 }			 
			 };
		 System.out.println("짖기 메소드");
		 흰둥이.예쁘게짖기();
		 퉁퉁이.예쁘게짖기();
		 옆집요롱이.예쁘게짖기();
		 System.out.println("기다리기메소드");
		 흰둥이.기다리기();
		 퉁퉁이.기다리기();
		 옆집요롱이.기다리기();
		 System.out.println("테스트 . 실행되면 익명클래스 내에서 메소드 만들 수 있는 것 ");
		 //옆집요롱이.
		 //안뜨네
		 //새로 메소드 만드는건 안되고 있는 메소드를 오버라이딩하는게 가능
		 
	}	

}
