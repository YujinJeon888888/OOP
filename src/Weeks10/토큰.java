package Weeks10;
import java.util.*;
public class 토큰 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="가/나/다/라/마/바/사=아=자=차=카=타";
		String[] t=s.split("/");
		for(String p:t)
			System.out.println(p);
		///////////////////////////////////////////
		StringTokenizer st=new StringTokenizer(s,"/=");
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}

}
