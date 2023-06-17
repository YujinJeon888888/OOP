package Weeks9;

public class Sky {
	private static Sky instance=null;//static->하나만 있음. 공유되는 속성.->Sky.으로 접근.
	
	static int fog=3;//static변수
	int cloud;
	
	private Sky() {
		System.out.println("하늘 객체를 생성합니다.");
	}
	public static Sky getInstance() {
		if(instance==null)
			instance=new Sky();//하늘 객체 없으면 만듬
		else
			System.out.println("이미 생성되었습니다.");//더 생성 못 하게
		return instance;//하늘객체 리턴(리턴타입: Sky)
	}
	public void makeCloud(int num) {
		cloud=num;//구름갯수
	}
	public void drawSky() {
		String s="@@@";//구름모양
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		for(int i=0;i<this.cloud;i++) {//구름 갯수만큼 구름모양 그리기 반복
			System.out.printf("%7s",s);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
	}
}
