package Gun008;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen Adinizi Soyadinizi yazin");
        String adAd2Soyad = sc.nextLine();
          int ilkBoslukIndex = adAd2Soyad.indexOf(" ");
          int sonboslukindex = adAd2Soyad.lastIndexOf(" ");
          String ad = adAd2Soyad.substring(0, ilkBoslukIndex);
          String ad2 =adAd2Soyad.substring(ilkBoslukIndex+1, sonboslukindex);
          String soyad = adAd2Soyad.substring(sonboslukindex+1);


        System.out.println("ad = " + ad);
        System.out.println("ad2 = " + ad2);
        System.out.println("soyad = " + soyad);
                  





















    }
}
