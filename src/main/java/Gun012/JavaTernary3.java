package Gun012;

import java.util.Scanner;

public class JavaTernary3 {
    public static void main(String[] args) {

        // kullanicinin girecegi sayi cift ise Stringe cift atayiniz. tek ise tek atayiniz, ekrana stringi yazdir.

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi =");
        int sayi= oku.nextInt();

        String text="";

//        if (sayi % 2 == 0)
//            text = "çift";
//        else
//            text = "tek";

        // ternary şekli (üçlü operatör şekli)
        text = (sayi % 2 == 0) ? "çift" : "tek";

        System.out.println(text);





















    }
}

