package Generic_Collection;

import java.util.ArrayList;
import java.util.List;

class ����{}
class ������ extends ����{}
class �� extends ����{}
class ���޸��� extends ��{}
class �ڵ��� {}

//Ÿ�԰� Ÿ�������Ķ���͸� �����غ��ϴ�.

class Main_���� {
  public static void main(String[] args) {
        
    //List�������̽��� upcasting�Ͽ� ����� �� �ֽ��ϴ�.
	//�þ� ���� ���°� ���ϴϱ�
    List <String> list1 = new ArrayList<String>();
    List <Integer> list2 = new ArrayList<Integer>();
    
    list1.add("abc");
    list1.add("bcd");  
    list1.add("ddd");  //list1�� String�̿��� ��Ҹ� �߰��ϸ� �����Ͽ���!
    list2.add(123);
    list2.add(456);
    list2.add(789);    //list1�� Integer �̿��� ��Ҹ� �߰��ϸ� �����Ͽ���!
    
    Object [] or;   //list�� toArray()�� ����ϱ� ���� ��ü�迭�� �����մϴ�.
    
    //�����ð����� toArray()�� ����Ÿ���� Object [] ��� ���� �����ϰ� String [] ���� �޾Ƽ� ���ܰ� �߻��ߴ� ���� �Ʒ��� ���� �����մϴ�.
        
    or = list1.toArray();   //1. String�� ��ҷ� �ϴ� list�� Object�迭�� ��ȯ�մϴ�.    
    for(Object  o : or)
      System.out.println(o.toString());  //����� Ȯ���մϴ�.
    //ObjectŸ���� String����
      
    //2. type�� �̿��ϴ� toArray(T[]) �� �̿��Ͽ� String [] �� ��ȯ�մϴ�.  ���� java 8�̶�,
    String [] arrayBeforeJDK11 = list1.toArray(new String[list1.size()]);
		//String[] arrayAfterJDK11 = list1.toArray(String[]::new);
		for(String s : arrayBeforeJDK11) 
			System.out.println(s);
    
        
  ////////////
    or = list2.toArray();  //Integer�� ��ҷ� �ϴ� list�� �迭�� ��ȯ�մϴ�.
    for(Object  o : or)
      System.out.println(o.toString());  //����� Ȯ���մϴ�.
      
    Integer [] intarrayBeforeJDK11 = list2.toArray(new Integer[list2.size()]);
		//Integer [] intarrayAfterJDK11 = list2.toArray(Integer[]::new);
		for(Integer a : intarrayBeforeJDK11) 
			System.out.println(a);
      
          
    ///////////////////////////////////////////////////////////////////
    Box_���� <String> Box_����1= new Box_����<String>();
    Box_���� <������>Box_����2 = new Box_����<������>();
    Box_���� <��>Box_����3 = new Box_����<��>();
    Box_���� <���޸���>Box_����4 = new Box_����<���޸���>();
    Box_���� <�ڵ���> Box_����5 = new Box_����<�ڵ���>();
    Box_���� <����> �������� = new Box_����<����>();
    
    Box_����2.add(new ������());
    Box_����3.add(new ��());
    Box_����3.add(new ���޸���());     
    Box_����4.add(new ���޸���());
    
    ArrayList <��> s1=new ArrayList<��>();
    s1.add(new ��());
    
    ArrayList <���޸���> s2=new ArrayList<���޸���>();
    s1.add(new ���޸���());
        
    //�� �̻�
    Box_����3.put_super(s1); //put_super�̹Ƿ�, ��,������ ���� �� ������ new���޸���, new������, new �ڵ����� �Ұ�
    //���޸� �� ����
    Box_����3.put_sub(s2); //put_sub�̹Ƿ�, ���޸����� ���� �� ������ new����, new������, new �ڵ����� �Ұ�
        
    Box_����.copy(Box_����2, ��������);//���������� ���� Ŭ������ ���� �� ����. 
    Box_����.copy(Box_����3, ��������);
    Box_����.copy(Box_����4, ��������);
    //Box_����.copy(Box_����1, ��������);  //�Ұ���
    
    System.out.println("==Box_����2 ");  Box_����2.show();
    System.out.println("==Box_����3 ");  Box_����3.show();
    System.out.println("==Box_����4 ");  Box_����4.show();
    System.out.println("==�������� ");��������.show();
  }
  
}
