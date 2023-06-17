package Chapter4;

public class Student {
	private int 나이;
	private String 이름;
	private int 학번;
	public Student() {
		
	}
	public void setStudent(int 나이,String 이름,int 학번){
		this.나이=나이;
		this.이름=이름;
		this.학번=학번;
	}
	public int get나이(){
		return 나이;
	}
	public String get이름(){
		return 이름;
	}
	public int get학번(){
		return 학번;
	}

}
