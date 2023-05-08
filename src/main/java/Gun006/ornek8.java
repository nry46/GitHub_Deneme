package Gun006;

import java.util.Scanner;

public class ornek8 {

    public static void main(String[] args) {

       // kullanicidan username, password, ve gizli soruyu alip ekrana yazin

        Scanner sc= new Scanner(System.in);

        System.out.print(" Username: ");
        String us = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.print(" Password ");
        int ps = sc2.nextInt();

        System.out.print("Gizli soru ");
        String gz= sc.nextLine();

        System.out.println(us +"\n" + ps + "\n " +gz);





    }
}
