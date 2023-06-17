package Main;
import Animal.������;
import Animal.������;
import Animal.����;
import Animal.��;
import Animal.���;
import ���.*;
import java.util.Scanner;
public class ��ɲ� {
	
	�������� farm = ��������.getInstance();//�ҷ�����
	���� forest = ����.getInstance();
	������ zoo = ������.getInstance();
	
	
	private int ���ŷ�=0;
	private int ����=0;
	private int ���ָӴ�=10000; //�⺻ 1����
	public String ����=null;
	public String ����=null;
	
	public void �Ǹ��ϱ�() {
		farm.showAnimals();
		int num=0;
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		this.���ָӴ�+=zoo.�����ϱ�(farm.getAnimals(),num);
		
		//���������ִ���ã�� �ݺ���(���� �ѱ� �����̶� ���� �������忡 �����ִ� ���� . �ѱ䵿���̶� �������ִ� �����̶� ������ ��������
		����[] animals=farm.getAnimals();
		for(int n=0;n<farm.numOfAnimals;n++) {
			if(animals[n]==farm.getAnimal(num))
				break;
		}
		//ã�Ƽ� �� ���忡�� �����
		farm.removeAnimal(farm.getAnimal(num));
	}
	
	public int get���ָӴ�(){//�߰�

		return this.���ָӴ�;
	}

	public void set���ָӴ�(int ��){//�߰�
		this.���ָӴ� = ��;
	} 
	public void set���ָӴ�(char plus_or_minus,int ��){//�߰�, ���ϰ� �����
		if(plus_or_minus=='+')
			this.���ָӴ� += ��;
		if(plus_or_minus=='-')
			this.���ָӴ� -= ��;
	} 
	public int get���ŷ�(){//�߰�

		return this.���ŷ�;
	}

	public void set���ŷ�(int ���ŷ�){//�߰�
		this.���ŷ� = ���ŷ�;
	} 
	public int get����(){//�߰�

		return this.����;
	}

	public void set����(int ����){//�߰�
		this.���� = ����;
	} 
	/////////////////
	public ��ɲ�() {
		
		System.out.println("########################################################");
		System.out.println(" �ε� ! ���ӿ� ��ɲ��� ��Ÿ�����ϴ�.! ��������� �����մϴ�.");
		System.out.println("########################################################");
	} 
	
    public ��ɲ�(int size){
    	this();
    	�������� farm = ��������.getInstance(size);
    }
    ///////////////
    public void showInfo() {
    	System.out.println("------------------------------------------------");
    	System.out.println("��ɲ��� �������� ũ�� : " + farm.getSize());
    	System.out.println("��ɲ��� money: " + this.���ָӴ� +"��");    	
    	System.out.println("��ɲ��� ����: " + this.���� + " ����: "+this.����);    
    	System.out.println("��ɲ��� ����: " + this.���� + " ���ŷ�: "+this.���ŷ�);  
    	System.out.println("�������忡 �ִ� ���� ��: " + farm.numOfAnimals);
    	System.out.println("------------------------------------------------");
    	
    	farm.showAnimals();
    }
 
	public void  show() {
		System.out.println("==========================================================================");
		System.out.print("##  ��ɲ��� �������� :");	
		farm.showAnimals();
	}
	
    public boolean ����ϱ�(���� ani){    	
    	System.out.println("������ ����! ������ ��� ����! " + ani.�̸�);    	
    	return  true;
    }
 
    public boolean ����ϱ�(������ dog){
   
    	boolean signal = doRandom(dog);
    	return signal;
    }
   
    public boolean ����ϱ�(�� snake){    	
    	boolean signal = doRandom(snake);
    	return signal;  
    }
    
    public boolean ����ϱ�(������ eagle){
    	boolean signal = doRandom(eagle);
    	return signal;  
    }
    public boolean ����ϱ�(��� shark){
    	boolean signal = doRandom(shark);
    	return signal;  
    }
    //�������� ���Ȯ���� ���� ��ɼ������� ��� ����
    public boolean doRandom(���� animal) {
    	int r=(int)(Math.random()*1000)% 100;//0~99
    	animal.�����ϱ�(this);//�߰�. ������ ���� �õ�
    	if( r < animal.get���Ȯ��()) {
    		System.out.println(animal.�̸�+"�� ������ ���ҽ��ϴ�!");//�߰�
    		System.out.println(animal.�̸� + "����ϱ� ����!");
    		return true;
    	}
    	else {
    		System.out.println(animal.�̸�+"�� ���� Ÿ���� Ů�ϴ�!");//�߰�
    		System.out.println(animal.�̸� + "����ϱ� ����!");    	
    	}
    	return false;
    }
    
    //��Һ��� �����ε� ����
    public void ����ϱ�(){
    	
    	//1. �����迭�߿��� �����ϰ� �ƹ��ų� ���� : getAnimal()
    
    	���� ani = forest.getAnimal();
    	boolean sig=false;    
    
    	if (ani instanceof ������) sig=����ϱ�((������)ani);
    	else if (ani instanceof ��) sig=����ϱ�((��)ani);
    	else if (ani instanceof ������) sig=����ϱ�((������)ani);
    	else if (ani instanceof ���) sig=����ϱ�((���)ani);
    	else sig = ����ϱ�(ani);  // ������ ���ڷ� �޴� ����ϱⰡ ȣ���.

    	//3. ������ removeAnimal(), �������忡 addAnimal() 
    	if(sig==true) {
    		forest.removeAnimal(ani);
    		farm.addAnimal(ani);
    	}    
    }
   
    //��󼭻���ϱ�
    public void ����ϱ�(int num){
    	
    	//1. �����迭�߿��� �����ϰ� �ƹ��ų� ���� : getAnimal()    
    	���� ani = forest.getAnimal(num);
    	boolean sig=false;    
    
    	if (ani instanceof ������) sig=����ϱ�((������)ani);
    	else if (ani instanceof ��) sig=����ϱ�((��)ani);
    	else if (ani instanceof ������) sig=����ϱ�((������)ani);
    	else if (ani instanceof ���) sig=����ϱ�((���)ani);
    	else sig = ����ϱ�(ani);  // ������ ���ڷ� �޴� ����ϱⰡ ȣ���.

    	//3. ������ removeAnimal(), �������忡 addAnimal() 
    	if(sig==true) {
    		forest.removeAnimal(ani);
    		farm.addAnimal(ani);
    	}    
    }
   
    
    public void ����ϱ�(���� [] animals){
    	//...
    	
    }
 

  
}
