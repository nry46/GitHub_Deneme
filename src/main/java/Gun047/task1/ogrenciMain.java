package Gun047.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class ogrenciMain {
    public static void main(String[] args) {
        okul okul1=new okul("Kabataş Lisesi", 3);
        ArrayList<ogrenci> okulunOgrenciler = okul1.getOgrenciler();
        // burada okul1 oluşturulurken oluşan ArrayList get metodu ile alındı.

        int ogrenciSayisi=1;
        Scanner oku=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        do{
            System.out.print(ogrenciSayisi +".Öğrencinin Adı=");
            String ogrAd=oku.nextLine();

            System.out.print(ogrenciSayisi +".Öğrencinin Soyadı=");
            String ogrSoyad=oku.nextLine();

            System.out.print(ogrenciSayisi +".Öğrencinin Yaşı=");
            int yas=okuInt.nextInt();

            try {
                ogrenci ogr = new ogrenci(ogrAd, ogrSoyad, yas);
                //okul1.getOgrenciler().add(ogr);
                okulunOgrenciler.add(ogr); // alınan ArrayListe ogrenci eklendi
                ogrenciSayisi++;
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
                System.out.println("Yeni Öğrenci giriniz");
            }

        }while (ogrenciSayisi <= okul1.getMaxOgrenciSayisi());

        for(ogrenci ogr: okul1.getOgrenciler())
        {
            System.out.println("ogr = " + ogr);
        }
    }
}
