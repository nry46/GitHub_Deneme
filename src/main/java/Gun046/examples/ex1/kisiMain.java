package Gun046.examples.ex1;

public class kisiMain {
    public static void main(String[] args) {

        kisi kisi1=new kisi();

        kisi1.ad ="Mustafa";
        kisi1.soyad = "Gültekin";
        kisi1.setYas(-25);// - li girilince de + yaparak yazdiriyor.

        System.out.println("kisi1.getYas() = " + kisi1.getYas());
    }
}
