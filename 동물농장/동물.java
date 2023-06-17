package 동물농장;
public  class 동물 implements Playable, Moveable {

    public String 이름;

    private int 나이;

    public int hp;

    public int power;

    private int money;

    

    static int numOfAnimals;  //전체 동물마다 한개 있는 속성

    

    public 동물(){

    System.out.println("동물생성");

    numOfAnimals++;

    }



    public 동물(String 이름){

    numOfAnimals++;

    this.이름 = 이름;

    System.out.println("동물생성 \n 이름 : " + this.이름);

    }



    public int get나이(){

        return this.나이;

    }



    public void set나이(int 나이){

    this.나이 = 나이;

    }



    public int getMoney(){

       return this.money;

    }



    public void setMoney(int money){

    this.money = money;

    }



    public  void 놀기() {

    System.out.println("동물이 숲속에서 뛰어놉니다~");

    }  



    public  void 먹기() {

    System.out.println("동물이 숲속에서 풀을 뜯어먹습니다~");

    }



    public  void 자기() {

    System.out.println("동물이 숲속에서 쿨쿨 잡니다~");

    }



    public  void 움직이기() {

    System.out.println("동물이 숲속에서 움직입니다~");

    }



    public void show(){

    System.out.println("== 동물 ==");

    System.out.printf("이름 : %s  나이 : %d \n",this.이름, this.나이);

    System.out.printf("hp : %d  power : %d  money: %d \n",this.hp, this.power, this.money);   

    }



}