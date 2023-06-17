package 백준;

import java.util.*;

public class 숫자의개수 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
      
        int resault = a*b*c;
        int[] arr= new int[10];
        while (resault>0)//val이 0이 될때까지 반복한다.
        { 
            arr[resault%10]++; //결과값에 10을 나눈 나머지는 일의 자리숫자가 된다.
            //그 결과값이 나온 배열의 값을 ++를 통해 1 증가시킨다.
            //예) 0이 나오면 arr[0]++가 되면서 arr[0] = 1이 된다.
            resault/= 10; //10을 나누어서 일의 자릿수를 없앤다.
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}