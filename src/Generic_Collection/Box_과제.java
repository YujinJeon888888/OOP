package Generic_Collection;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Box_과제<T>{

	private  T t = null;	//한 개를 저장하는 변수
	private T [] arr;		//배열변수. 그러나 T타입의 배열생성은 불가하므로
	private ArrayList <T> ar ;	//ArrayList 로 사용합니다.

	public Vector <T> vv = new Vector<T>(); //Collection중 (자료구조에서 배우는)Vector나 Map, Set도 가능합니다.


	private int i=0;
	private int size=10; //기본 10.  배열초기 크기때문에 넣어둠. ArrayList에서는 불필요. 


	public Box_과제() {

		ar= new ArrayList<T>(); //ArrayList를 사용하세요.

		//arr = new T[10]; //처럼  일반배열 생성방식은 불가하므로, 
		arr = (T[]) new Object[size];  // 1. Object 배열을 만든 후 형변환 하거나

	}

	public Box_과제(Class<T> clazz) {
		this();
		arr= (T[])Array.newInstance(clazz, this.size);  //2. clazz타입의 크기가 size인 Array를 만들 수 있으나 Collection을 쓰세요.		
		// 이 때도 타입의 안전성을 위한 형변환은 필요합니다.
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}


	public  void add(T t) {		
		this.t=t;
		ar.add(t);		//ArrayList는 add로
		arr[i++] = t;	//배열 arr은 인덱스로 추가하지만, ArrayList쓰세요		
	}	

	public T get(int i) {
		
		//System.out.print("get(" + i +") : ");
		//System.out.print(arr[i] +" ,"); //배열
		//System.out.println(ar.get(i));	//ArrayList
    
		//return은 한 번만 가능하므로		
		//return  arr[i];		//배열의 i번요소를 리턴하거나.  ArrayList쓰세요.
	  return ar.get(i);	//ArrayList의 i번요소를 리턴합니다
    		
    }
    	
	public int size() {
    		
		//일반배열과 ArrayList의 크기가 같은지 출력하는 테스트코드
		//System.out.println("일반배열 arr의 현재크기 : " + i);
		//System.out.println("ArrayList ar의 현재크기 : " + ar.size());
		return ar.size();	//ArrayList를 씁니다.
	}
	//타입파라미터를  리턴타입에 적용해 봅니다. getAnimal()은 동물이거나 동물의 하위타입만 리턴할 수 있어요.
	public static <T extends 동물> T getAnimal(){ //동물 이하만 
		자동차 a =new 자동차();
		강아지 b= new 강아지();
		뱀 c=new 뱀();
		방울달린뱀 d=new 방울달린뱀();

		return (T)c;  //b,c,d 만 가능!  a는 문법에러!
		//자동차는 동물과 관련 없으니까
	}


	//T 또는 T의 상위클래스만 허용합니다.    T가 뱀일 경우,  뱀과 동물만 가능하고
	public  void put_super(ArrayList<? super T>t){//?는 T이상
		this.ar.addAll((ArrayList<T>) t);
	}
	//T 또는 T의 하위클래스만 허용합니다. T가 뱀일  경우, 뱀과 방울달린뱀만 가능합니다.
	public  void put_sub(ArrayList<? extends T> t) {//?는 T이하
		this.ar.addAll((ArrayList<T>) t);
	}	

	//from에 있는 모든 것을 to에 카피한다. 단, T타입의 상하위 제한을 이용하여  from은 to의 타입과 같거나 하위일때로 제한한다.
	public static <T> void copy(Box_과제 <? extends T> from, Box_과제 <? super T> to) {
		//to.t = from.getT();
		for(int i=0; i<from.size(); i++) 
			to.add(from.get(i)); // Box_과제에 담긴 모든 요소를 to에 copy
	}

	public void show(){

		for(int i=0; i<this.size(); i++){
			System.out.print( i+1 + ":" + ar.get(i).toString() + ", ");
			System.out.println(ar.get(i).getClass().getTypeName());

		}
	}
}