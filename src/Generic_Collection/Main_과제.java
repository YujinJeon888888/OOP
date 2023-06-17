package Generic_Collection;

import java.util.ArrayList;
import java.util.List;

class 동물{}
class 강아지 extends 동물{}
class 뱀 extends 동물{}
class 방울달린뱀 extends 뱀{}
class 자동차 {}

//타입과 타입제한파라미터를 연습해봅니다.

class Main_과제 {
  public static void main(String[] args) {
        
    //List인터페이스로 upcasting하여 사용할 수 있습니다.
	//시야 좁게 보는게 편하니까
    List <String> list1 = new ArrayList<String>();
    List <Integer> list2 = new ArrayList<Integer>();
    
    list1.add("abc");
    list1.add("bcd");  
    list1.add("ddd");  //list1에 String이외의 요소를 추가하면 컴파일에러!
    list2.add(123);
    list2.add(456);
    list2.add(789);    //list1에 Integer 이외의 요소를 추가하면 컴파일에러!
    
    Object [] or;   //list의 toArray()를 사용하기 위해 객체배열을 선언합니다.
    
    //수업시간에는 toArray()의 리턴타입이 Object [] 라는 것을 간과하고 String [] 으로 받아서 예외가 발생했던 점을 아래와 같이 수정합니다.
        
    or = list1.toArray();   //1. String을 요소로 하는 list를 Object배열로 변환합니다.    
    for(Object  o : or)
      System.out.println(o.toString());  //결과를 확인합니다.
    //Object타입을 String으로
      
    //2. type을 이용하는 toArray(T[]) 를 이용하여 String [] 로 변환합니다.  저는 java 8이라서,
    String [] arrayBeforeJDK11 = list1.toArray(new String[list1.size()]);
		//String[] arrayAfterJDK11 = list1.toArray(String[]::new);
		for(String s : arrayBeforeJDK11) 
			System.out.println(s);
    
        
  ////////////
    or = list2.toArray();  //Integer을 요소로 하는 list를 배열로 변환합니다.
    for(Object  o : or)
      System.out.println(o.toString());  //결과를 확인합니다.
      
    Integer [] intarrayBeforeJDK11 = list2.toArray(new Integer[list2.size()]);
		//Integer [] intarrayAfterJDK11 = list2.toArray(Integer[]::new);
		for(Integer a : intarrayBeforeJDK11) 
			System.out.println(a);
      
          
    ///////////////////////////////////////////////////////////////////
    Box_과제 <String> Box_과제1= new Box_과제<String>();
    Box_과제 <강아지>Box_과제2 = new Box_과제<강아지>();
    Box_과제 <뱀>Box_과제3 = new Box_과제<뱀>();
    Box_과제 <방울달린뱀>Box_과제4 = new Box_과제<방울달린뱀>();
    Box_과제 <자동차> Box_과제5 = new Box_과제<자동차>();
    Box_과제 <동물> 동물농장 = new Box_과제<동물>();
    
    Box_과제2.add(new 강아지());
    Box_과제3.add(new 뱀());
    Box_과제3.add(new 방울달린뱀());     
    Box_과제4.add(new 방울달린뱀());
    
    ArrayList <뱀> s1=new ArrayList<뱀>();
    s1.add(new 뱀());
    
    ArrayList <방울달린뱀> s2=new ArrayList<방울달린뱀>();
    s1.add(new 방울달린뱀());
        
    //뱀 이상
    Box_과제3.put_super(s1); //put_super이므로, 뱀,동물은 넣을 수 있지만 new방울달린잼, new강아지, new 자동차는 불가
    //방울달린 뱀 이하
    Box_과제3.put_sub(s2); //put_sub이므로, 방울달린뱀은 넣을 수 있지만 new동물, new강아지, new 자동차는 불가
        
    Box_과제.copy(Box_과제2, 동물농장);//동물농장의 이하 클래스만 넣을 수 있음. 
    Box_과제.copy(Box_과제3, 동물농장);
    Box_과제.copy(Box_과제4, 동물농장);
    //Box_과제.copy(Box_과제1, 동물농장);  //불가능
    
    System.out.println("==Box_과제2 ");  Box_과제2.show();
    System.out.println("==Box_과제3 ");  Box_과제3.show();
    System.out.println("==Box_과제4 ");  Box_과제4.show();
    System.out.println("==동물농장 ");동물농장.show();
  }
  
}
