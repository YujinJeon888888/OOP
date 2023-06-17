package 상속_다형성_인터페이스_랩;

public class 학생 extends 사람 implements Learn_able {
    private String 학번;

	@Override
	public void 공부하기() {
		// TODO Auto-generated method stub
		System.out.println("공부중..");
	}

	@Override
	public void 질문하기() {
		// TODO Auto-generated method stub
		System.out.println("질문중..");
	}

}
