package Gun014;

import java.util.Scanner;

public class  DoWhile2 {
    public static void main(String[] args) {
        //kullanicidan x harfi girilene kadar ekrana "program calisiyor " yazan ve x girildiginde ise "program bitti"
        // yazan programi yaziniz.


//
        // Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        Scanner oku=new Scanner(System.in);
        String okunan="";

        do {
            okunan = oku.nextLine();
            if (okunan.equalsIgnoreCase("x")) break; // break : döngü kırıcı

            System.out.println("Program çalışıyor");
        }while(!okunan.equalsIgnoreCase("x"));

        System.out.println("Program bitti.");
    }










    }

