package Weeks10;
import java.util.*;
public class ��ū {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="��/��/��/��/��/��/��=��=��=��=ī=Ÿ";
		String[] t=s.split("/");
		for(String p:t)
			System.out.println(p);
		///////////////////////////////////////////
		StringTokenizer st=new StringTokenizer(s,"/=");
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}

}
