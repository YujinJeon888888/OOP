package Week4;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class �˶��ð� {
	public static void main(String [] args) throws IOException{
		//���1
		Scanner input =new Scanner(System.in); //ȿ���� ������ ���� ���� Scanner�� �̿��Ѵ�.
		int H,M;        
		H=input.nextInt();
		M=input.nextInt();

		//���2 : BufferedReader + String�� split�� ����Ѵ�.
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String [] str= br.readLine().split(" ");
		//int H = Integer.parseInt(str[0]);
		//int M = Integer.parseInt(str[1]);

		//���3 : BufferedReader + StringTokenizer�� ����Ѵ�.
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine()," "); //������ �������� �и��Ǿ� �ִ�.
		//int H = Integer.parseInt(st.nextToken());
		//int M = Integer.parseInt(st.nextToken());       


		if(M>=45) M-=45; //M�� 45�̻��̸� �ܼ��� ���ְ�        
		else { 
			M =  M - 45 + 60;  // �׷��� �ʴٸ� 45�� ���ְ� 60���� ���Ѵ�.
			H -=1;             // �ð��� �ϳ� ���δ�.
		}                
		if(H<0) H=23;        //�ݷ�!  H�� 0�̾��ٸ�, �ð��� -1�� �ǹǷ�, 23�÷� �����Ѵ�
		System.out.print(H + " " + M);  //��Ĵ�� ���. ��ȣ!
	}   
}
