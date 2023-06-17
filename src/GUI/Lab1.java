package GUI;

import javax.swing.JFrame;

public class Lab1 extends JFrame{
	//Swing프레임 작성-JFrame을 상속한다.
	public Lab1() {
		setTitle("300x300 스윙 프레임 만들기");
		setSize(300,300);
		setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab1 frame=new Lab1();
	}

}
