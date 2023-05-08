package Gun043.JavaExeption;

import java.time.LocalDate;
import java.time.Month;

public class JavaTryCatch4 {
    public static void main(String[] args) {

      //  LocalDate date=LocalDate.of(2018, Month.APRIL,40); // hata veriyor 40 yok diyor.


        try {// dene , hatanin basladigi yerin üstüne aliyoruz.
            LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
            System.out.println("islem tamam"); // hata olunca bunu yazmaz.. ama hata olmazsa sadece bunu ve son islemi yazar

        }// hatanin bittigi yerde parantez kapatilir.

        catch (Exception hata)// hata oldugunda yapilacak islemler burdan asagida parantez icinde yaziir.
        {

            // hata oldugunda  hatayi buraya yaziyor
            System.out.println("hata oldu");
            System.out.println(" hata " +" tarih dönüsüm hatasi");

            System.out.println("hata.getMessage() = " + hata.getMessage());// hatanin yerini belirtiyor.

            hata.printStackTrace();// hatanin gectigi asamalari yazar
        }


        System.out.println("programin sonuna kadar gelindi.");

// TODO ; hata yoksa try calisiyor, hata varsa catch calisiyor.
    }
}
