package Chapter5;

public class Pizza_2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza_2 obj1=new Pizza_2(14);
		Pizza_2 obj2=new Pizza_2(18);
		
		Pizza_2 largest=obj1.whosLargest(obj1, obj2);
		System.out.println(largest.radius+"인치 피자가 더 큼.");		
	}

}
