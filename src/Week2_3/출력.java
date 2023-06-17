package Week2_3;

import java.util.Scanner;

public class 출력 {
 
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        String 이름="",학번="", 음식;
        int 나이=0,age=0;
        float 키=0, height=0;
        boolean b = true;  //논리값
        

        while(true) {
            //입력을 위한 출력메시지
            System.out.print("이름 : ");
            이름  = input.nextLine();
        
            System.out.print("학번 : ");
            학번  = input.nextLine();
            
            System.out.print("나이: ");
            나이  = input.nextInt();
                        
            System.out.print("키: ");
            키  = input.nextFloat();

            System.out.print("좋아하는 음식은  ");  //떡볶이 피자 콜라 사이드 치킨을 입력할 예정. 그러나 건너뛰는 현상이 발생함
            String temp = input.nextLine();  //엔터먹어가기 용 입력문을 추가하여 해결함. 이 문장이 없다면, 음식을 입력받을 수 없어요.
            음식  = input.nextLine();

            
            

            System.out.print("입력한 정보가 맞으면 true 틀리면 false : ");
            b= input.nextBoolean();         //여기서도 엔터는 남기도 읽어갑니다.
            input.nextLine();                     //으로  위에서 남겨진 엔터를 먹어갑니다.
            System.out.println("결과 : "  + b);        
            
            if(b==true) break;
        }
        
        //보기좋게 출력하기        
        System.out.println("#############################################");        
        System.out.println("안녕하세요! 저는 " + 학번 +"학번,"  + 나이 + "살 " + 이름 +"이라고 합니다.");
        System.out.println("좋아하는 음식은 " + 음식 +"입니다.~");        
        System.out.println("#############################################");
        System.out.println("입력한 정보는 모두 " + b +"입니다.~ ㅎㅎㅎ");        
        
        
        }
}
