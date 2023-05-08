package Gun039.JavaEnum.Ex3;
// 1- Bir Kitap sınıfı yazınız, fields : name ve kategori(Enum)
// 2- KitapKategori adında bir enum oluşturunuz: Klasik, Roman, Fantezi, Tarih, Ekonomi
// 3- 2 kitap tanımlayınız bir ArrayList e atınız.
// 4- bir kategoriye listeletiniz.

import java.util.ArrayList;
public class ex3Main {

    public static void main(String[] args) {
        Books kit1 = new Books();
        kit1.name="Sefiller";
        kit1.kategori=BookKategori.roman;

        Books kit2=new Books();
        kit2.name = "Beyaz Zambaklar";
        kit2.kategori=BookKategori.roman;

        ArrayList<Books> kitaplar=new ArrayList<>();
        kitaplar.add(kit1);
        kitaplar.add(kit2);

        for(Books k : kitaplar)
        {
            if (k.kategori == BookKategori.roman)
            {
                System.out.println("k.name = " + k.name);
            }
        }

    }


}
