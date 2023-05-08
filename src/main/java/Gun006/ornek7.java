package Gun006;

import java.util.Scanner;

public class ornek7 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        // kullanicidan cadde,sok,pk, ve ülke seklinde adres bilgilisi yazdirin
        System.out.print("ülke ");
        String ul= sc.nextLine();

        System.out.print(" cadde ismi =");
        String cd= sc.nextLine();
        System.out.print("Sokak ismi ");;
        String sk = sc.nextLine();
        System.out.print("Posta kodu ");
        int pk = sc.nextInt();



        System.out.println(" Adres bilgisi = " + cd +" " +sk +" " + pk +" " +ul );








    }
}
