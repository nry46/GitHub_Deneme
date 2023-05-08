package Gun049.task3;

public class ABMain {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("a olusturuldugunda = " + A.mesaj);

        B b=new B();
        System.out.println("b olusturuldugunda = " + B.mesaj);

        System.out.println("b den sonra a nin durumu = " + A.mesaj);
    }
}
