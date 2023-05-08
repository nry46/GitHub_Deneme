package Gun011;

import java.util.Scanner;

public class ifElse6 {
    public static void main(String[] args) {
// girilen yeni bir paswordun kurallara uyugunlugunu kontrol edin
        // kurallar :1) en az 8 karakter olmali
        // 2.. icinde pass kelimesi olmamali
        //3.. en fazla 12 karakter olmali.

        Scanner sc= new Scanner(System.in);
        System.out.print(" Bir password giriniz giriniz  = ");
        String text = sc.nextLine();

        if(text.length()>7 && !text.contains("pass") && text.length()<13)
            System.out.println("True");
        else
            System.out.println("false");









    }
}
