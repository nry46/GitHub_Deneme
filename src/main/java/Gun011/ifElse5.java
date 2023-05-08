package Gun011;

import java.util.Scanner;

public class ifElse5 {
    public static void main(String[] args) {
        // girilen bir stringin uzunlugu 10 dan buyukse ve string icinde "study" kelimesi geciyorsa ekrana evet, degilse hayir yazdirin.

        Scanner sc= new Scanner(System.in);
        System.out.print(" Bir cümle giriniz giriniz  = ");
         String text = sc.nextLine();

         if(text.length()>10 && text.contains("study"))
             System.out.println("evet");
         else
             System.out.println("hayir");




















    }

}
