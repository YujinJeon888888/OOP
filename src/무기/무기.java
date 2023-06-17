package 무기;
public class 무기 {
    private int 공격력;
    public String name;

    public 무기(){
    }
    public 무기(String name, int power) {
		this.name=name;
		this.공격력=power;
	}
    public int get공격력() {
		return 공격력;
	}
	public void set공격력(int 공격력) {
		this.공격력 = 공격력;
	}

  

}
