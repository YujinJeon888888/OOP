package Week2_3;

import java.util.Scanner;

public class ��� {
 
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        String �̸�="",�й�="", ����;
        int ����=0,age=0;
        float Ű=0, height=0;
        boolean b = true;  //����
        

        while(true) {
            //�Է��� ���� ��¸޽���
            System.out.print("�̸� : ");
            �̸�  = input.nextLine();
        
            System.out.print("�й� : ");
            �й�  = input.nextLine();
            
            System.out.print("����: ");
            ����  = input.nextInt();
                        
            System.out.print("Ű: ");
            Ű  = input.nextFloat();

            System.out.print("�����ϴ� ������  ");  //������ ���� �ݶ� ���̵� ġŲ�� �Է��� ����. �׷��� �ǳʶٴ� ������ �߻���
            String temp = input.nextLine();  //���͸Ծ�� �� �Է¹��� �߰��Ͽ� �ذ���. �� ������ ���ٸ�, ������ �Է¹��� �� �����.
            ����  = input.nextLine();

            
            

            System.out.print("�Է��� ������ ������ true Ʋ���� false : ");
            b= input.nextBoolean();         //���⼭�� ���ʹ� ���⵵ �о�ϴ�.
            input.nextLine();                     //����  ������ ������ ���͸� �Ծ�ϴ�.
            System.out.println("��� : "  + b);        
            
            if(b==true) break;
        }
        
        //�������� ����ϱ�        
        System.out.println("#############################################");        
        System.out.println("�ȳ��ϼ���! ���� " + �й� +"�й�,"  + ���� + "�� " + �̸� +"�̶�� �մϴ�.");
        System.out.println("�����ϴ� ������ " + ���� +"�Դϴ�.~");        
        System.out.println("#############################################");
        System.out.println("�Է��� ������ ��� " + b +"�Դϴ�.~ ������");        
        
        
        }
}
