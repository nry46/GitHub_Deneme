package Gun048.Extends3;

public class Firma {
    public static void main(String[] args) {
        calisan calisan1=new calisan("Mehmet", 2000, 2);
        System.out.println("calisan1.toString() = " + calisan1.toString());
        System.out.println("calisan1.maasHesapla() = " + calisan1.maasHesapla());

        genelMudur gm=new genelMudur("Ayşe",6000, 2, 3);
        System.out.println("gm.toString() = " + gm.toString());
        System.out.println("gm.maasHesapla() = " + gm.maasHesapla());


    }
}
