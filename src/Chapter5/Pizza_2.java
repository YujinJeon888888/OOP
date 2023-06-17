package Chapter5;

public class Pizza_2 {
	int radius;
	
	Pizza_2(int r){
		radius=r;
	}
	
	Pizza_2 whosLargest(Pizza_2 p1, Pizza_2 p2) {
		if(p1.radius>p2.radius)
			return p1;
		else
			return p2;
	}
	
	
}
