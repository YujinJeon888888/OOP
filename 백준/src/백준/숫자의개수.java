package ����;

import java.util.*;

public class �����ǰ��� {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
      
        int resault = a*b*c;
        int[] arr= new int[10];
        while (resault>0)//val�� 0�� �ɶ����� �ݺ��Ѵ�.
        { 
            arr[resault%10]++; //������� 10�� ���� �������� ���� �ڸ����ڰ� �ȴ�.
            //�� ������� ���� �迭�� ���� ++�� ���� 1 ������Ų��.
            //��) 0�� ������ arr[0]++�� �Ǹ鼭 arr[0] = 1�� �ȴ�.
            resault/= 10; //10�� ����� ���� �ڸ����� ���ش�.
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}