package Generic_Collection;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Box_����<T>{

	private  T t = null;	//�� ���� �����ϴ� ����
	private T [] arr;		//�迭����. �׷��� TŸ���� �迭������ �Ұ��ϹǷ�
	private ArrayList <T> ar ;	//ArrayList �� ����մϴ�.

	public Vector <T> vv = new Vector<T>(); //Collection�� (�ڷᱸ������ ����)Vector�� Map, Set�� �����մϴ�.


	private int i=0;
	private int size=10; //�⺻ 10.  �迭�ʱ� ũ�⶧���� �־��. ArrayList������ ���ʿ�. 


	public Box_����() {

		ar= new ArrayList<T>(); //ArrayList�� ����ϼ���.

		//arr = new T[10]; //ó��  �Ϲݹ迭 ��������� �Ұ��ϹǷ�, 
		arr = (T[]) new Object[size];  // 1. Object �迭�� ���� �� ����ȯ �ϰų�

	}

	public Box_����(Class<T> clazz) {
		this();
		arr= (T[])Array.newInstance(clazz, this.size);  //2. clazzŸ���� ũ�Ⱑ size�� Array�� ���� �� ������ Collection�� ������.		
		// �� ���� Ÿ���� �������� ���� ����ȯ�� �ʿ��մϴ�.
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}


	public  void add(T t) {		
		this.t=t;
		ar.add(t);		//ArrayList�� add��
		arr[i++] = t;	//�迭 arr�� �ε����� �߰�������, ArrayList������		
	}	

	public T get(int i) {
		
		//System.out.print("get(" + i +") : ");
		//System.out.print(arr[i] +" ,"); //�迭
		//System.out.println(ar.get(i));	//ArrayList
    
		//return�� �� ���� �����ϹǷ�		
		//return  arr[i];		//�迭�� i����Ҹ� �����ϰų�.  ArrayList������.
	  return ar.get(i);	//ArrayList�� i����Ҹ� �����մϴ�
    		
    }
    	
	public int size() {
    		
		//�Ϲݹ迭�� ArrayList�� ũ�Ⱑ ������ ����ϴ� �׽�Ʈ�ڵ�
		//System.out.println("�Ϲݹ迭 arr�� ����ũ�� : " + i);
		//System.out.println("ArrayList ar�� ����ũ�� : " + ar.size());
		return ar.size();	//ArrayList�� ���ϴ�.
	}
	//Ÿ���Ķ���͸�  ����Ÿ�Կ� ������ ���ϴ�. getAnimal()�� �����̰ų� ������ ����Ÿ�Ը� ������ �� �־��.
	public static <T extends ����> T getAnimal(){ //���� ���ϸ� 
		�ڵ��� a =new �ڵ���();
		������ b= new ������();
		�� c=new ��();
		���޸��� d=new ���޸���();

		return (T)c;  //b,c,d �� ����!  a�� ��������!
		//�ڵ����� ������ ���� �����ϱ�
	}


	//T �Ǵ� T�� ����Ŭ������ ����մϴ�.    T�� ���� ���,  ��� ������ �����ϰ�
	public  void put_super(ArrayList<? super T>t){//?�� T�̻�
		this.ar.addAll((ArrayList<T>) t);
	}
	//T �Ǵ� T�� ����Ŭ������ ����մϴ�. T�� ����  ���, ��� ���޸��츸 �����մϴ�.
	public  void put_sub(ArrayList<? extends T> t) {//?�� T����
		this.ar.addAll((ArrayList<T>) t);
	}	

	//from�� �ִ� ��� ���� to�� ī���Ѵ�. ��, TŸ���� ������ ������ �̿��Ͽ�  from�� to�� Ÿ�԰� ���ų� �����϶��� �����Ѵ�.
	public static <T> void copy(Box_���� <? extends T> from, Box_���� <? super T> to) {
		//to.t = from.getT();
		for(int i=0; i<from.size(); i++) 
			to.add(from.get(i)); // Box_������ ��� ��� ��Ҹ� to�� copy
	}

	public void show(){

		for(int i=0; i<this.size(); i++){
			System.out.print( i+1 + ":" + ar.get(i).toString() + ", ");
			System.out.println(ar.get(i).getClass().getTypeName());

		}
	}
}