package Week4;
import java.util.*;
public class 카페 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int order;
		int sum=0;
		int[] 가격=new int[2];
		가격[0]=3500;
		가격[1]=5000;
		while(true) {
			메뉴();
			order=in.nextInt();
			switch(order) {
			case 1:
			case 2:
			case 3:
				System.out.println("3500원");
				sum+=3500;
				break;
			case 4:
				System.out.println("5000원");
				sum+=5000;
				break;
			
			}
			System.out.println("총 가격: "+sum);
			if(order==0)
				break;
		}
		System.out.println("주문을 종료합니다.");

	}


	private static void 메뉴() {
		// TODO Auto-generated method stub
		System.out.println("==============================================");
		System.out.println("1. 에스프레소 2. 민트초코 3. 카페라떼 4. 밀크티 0.주문종료");
		System.out.println("==============================================");
	}

}
