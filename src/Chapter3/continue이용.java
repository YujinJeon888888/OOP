package Chapter3;

public class continue이용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;++i)
		{
			if(i%3==0)
				continue;//3의 배수만 건너띔.
			System.out.println(i);
		}
	}

}
