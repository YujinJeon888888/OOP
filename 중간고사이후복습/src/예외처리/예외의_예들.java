package 예외처리;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class 예외의_예들 {

	public static void main(String[] args) throws EOFException, FileNotFoundException, java.lang.ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		//예외클래스의 
		//폴더 이름
		//java.lang.		

		try {
			//java.lang.NullPointerException
			//null값 갖는 참조변수로 객체 접근 연산자인 도트(.)사용했을 때 발생
			//String data=null;//레퍼런스x
			//System.out.println(data.toString());
			
			//ArrayIndexOutOfBoundsException
			//배열에서 인덱스 범위 초과하여 사용할 경우 발생
			//int[] ar=new int[10];
			//ar[10]=1;
			
			//java.lang.ClassCastException
			//타입 변환이 되지 않을 경우 발생(캐스팅 불가능)
			상속_다형성_인터페이스_랩.동물 animal=new 상속_다형성_인터페이스_랩.강아지();
			상속_다형성_인터페이스_랩.사람 human=(상속_다형성_인터페이스_랩.사람) animal;
			
			//점진적으로 큰 개념으로 잡기. 큰 예외는 제일 아래에(다 잡게)
		}catch(java.lang.NullPointerException e) {
			System.out.println("null값 갖는 참조변수로 객체 접근 연산자인 도트(.)사용했을 때 발생");
		}catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("배열에서 인덱스 범위 초과하여 사용할 경우 발생");
		}catch(ClassCastException e) {
			System.out.println("타입 변환이 되지 않을 경우 발생(캐스팅 불가능)");
		}catch(java.lang.ArithmeticException|java.lang.IllegalThreadStateException e) {//또는 연산자 가능!  
			System.out.println("산술연산 예외");
		}catch(java.lang.Exception e) {
			System.out.println("아무튼 예외가 발생했네요");
		}finally {
			System.out.println("여기까지 실행되면 정상실행~");
		}
		
	}

}
