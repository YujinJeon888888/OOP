import java.util.Scanner;

public class Game_369 {

public static void main(String[]args) {

/*Scanner input=new Scanner(System.in);//������ ����. Ŭ����/ ���� /��ü

//�츮�� �Է��ϴ� ���ڿ��� �о ���ڷ� �ٲ۴ٴ� �� (nextInt)

String name="";

System.out.printf("�̸��� �Է��ϼ���: ");

//nextLine: �� ������� ����/ next: �� ������� ����.

while(true) {

name=input.nextLine();

System.out.printf(name+"!!");

*/

int num=1;

while(num<100) //num 99�� �� ������ �ݺ�

{

if(num%10==0)//10���� ������ ��������(10�� ����̸�)

{

	System.out.printf("\n");// printf("\n");

if(num/10==3||num/10==6||num/10==9)//10�� ����ε� 3.6.9

{

System.out.printf(" ¦!");

}

else//10�� ����ε� 3.6.9 �ƴ� ��

{

System.out.printf("%4d",num);

}

}

//�ѤѤѤѤѤѤѤѤѤ�

//(�����ڸ� 3.6.9+�����ڸ� 3.6.9�� �ƴѰ�)

else if((num%10==3||num%10==6||num%10==9)&&!(num/10==3||num/10==6||num/10==9))//���� �ڸ��� 3�� ����̸�.(�����ڸ� 3.6.9����)

{

System.out.printf(" ¦!");

}

//(�����ڸ� 3.6.9+�����ڸ� 3.6.9)

else if((num/10==3||num/10==6||num/10==9)&&(num%10==3||num%10==6||num%10==9))

{

System.out.printf(" ¦¦!");

}

//(�����ڸ� 3.6.9�� �ƴѰ�+�����ڸ� 3.6.9)

else if(!(num%10==3||num%10==6||num%10==9)&&(num/10==3||num/10==6||num/10==9))

{

System.out.printf(" ¦!");

}

else 

{

System.out.printf("%4d",num);

}

//�ѤѤѤѤѤѤѤѤѤѤѤ�

num++;//num 1�� ���ϱ�

}

}

}