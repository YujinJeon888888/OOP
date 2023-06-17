package 방어구;

public class 갑옷 {
    private double 방어력;
    private int 가격;
    public String name;

    public 갑옷(){
    }
    
	public double get방어력() {
		return 방어력;
	}

	public void set방어력(double d) {
		this.방어력 = d;
	}

	public int get가격() {
		return 가격;
	}

	public void set가격(int 가격) {
		this.가격 = 가격;
	}

	public 갑옷(int 방어력, int 가격, String name){
		this.방어력=방어력;
		this.가격=가격;
		this.name=name;
    }

}
