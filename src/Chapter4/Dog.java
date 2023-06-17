package Chapter4;

public class Dog {
	private String breed;
	private int age;
	private String color;
	public void setDog(String Á¾, int ³ªÀÌ, String »ö±ò) {
		breed=Á¾;
		age=³ªÀÌ;
		color=»ö±ò;
	}
	public Dog() {
	
	}
	public void showDog() {
		System.out.println("Á¾: "+breed+" »ö±ò: "+color+" ³ªÀÌ: "+age);
	}
	public void barking() {
		System.out.println("¿ù¿ù!");
	}
	public void hungry() {
		System.out.println("²¿¸£¸¤ ¤Ð");
	}
	public void sleeping() {
		System.out.println("ÄðÄð~");
	}

}
