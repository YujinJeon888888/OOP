package Weeks9;

public class SkyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sky s1=Sky.getInstance();
		Sky s2=Sky.getInstance();
		Sky s3=Sky.getInstance();
		if(s1==s2&&s2==s3)//같은 객체 연결
			System.out.println("같은 객체입니다.");
		
		System.out.println("안개: "+Sky.fog);//static변수.
		s1.makeCloud(10);
		s1.drawSky();
	
	}

}
