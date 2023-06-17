
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weapon obj1=new Gun();
		Weapon obj2=new Laser();
		Weapon obj3=new Mini_Gun();
		Weapon obj4=new Mini_Gun();
		
		obj1.shoot();
		obj2.shoot();
		obj3.shoot();
		obj4.shoot();
		((Laser)obj4).shoot();
	}

}
