package Chapter4;

public class Dog {
	private String breed;
	private int age;
	private String color;
	public void setDog(String ��, int ����, String ����) {
		breed=��;
		age=����;
		color=����;
	}
	public Dog() {
	
	}
	public void showDog() {
		System.out.println("��: "+breed+" ����: "+color+" ����: "+age);
	}
	public void barking() {
		System.out.println("����!");
	}
	public void hungry() {
		System.out.println("������ ��");
	}
	public void sleeping() {
		System.out.println("����~");
	}

}
