import java.util.Scanner;

public class Game_369 {

public static void main(String[]args) {

/*Scanner input=new Scanner(System.in);//포인터 생각. 클래스/ 변수 /객체

//우리가 입력하는 문자열을 읽어서 숫자로 바꾼다는 뜻 (nextInt)

String name="";

System.out.printf("이름을 입력하세요: ");

//nextLine: 앞 빈공간도 읽음/ next: 앞 빈공간은 버림.

while(true) {

name=input.nextLine();

System.out.printf(name+"!!");

*/

int num=1;

while(num<100) //num 99일 때 까지만 반복

{

if(num%10==0)//10으로 나누어 떨어지면(10의 배수이면)

{

	System.out.printf("\n");// printf("\n");

if(num/10==3||num/10==6||num/10==9)//10의 배수인데 3.6.9

{

System.out.printf(" 짝!");

}

else//10의 배수인데 3.6.9 아닌 것

{

System.out.printf("%4d",num);

}

}

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

//(일의자리 3.6.9+십의자리 3.6.9는 아닌거)

else if((num%10==3||num%10==6||num%10==9)&&!(num/10==3||num/10==6||num/10==9))//일의 자리가 3의 배수이면.(십의자리 3.6.9제외)

{

System.out.printf(" 짝!");

}

//(일의자리 3.6.9+십의자리 3.6.9)

else if((num/10==3||num/10==6||num/10==9)&&(num%10==3||num%10==6||num%10==9))

{

System.out.printf(" 짝짝!");

}

//(일의자리 3.6.9는 아닌거+십의자리 3.6.9)

else if(!(num%10==3||num%10==6||num%10==9)&&(num/10==3||num/10==6||num/10==9))

{

System.out.printf(" 짝!");

}

else 

{

System.out.printf("%4d",num);

}

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

num++;//num 1씩 더하기

}

}

}