package Gun006;

import java.util.Scanner;

public class ornek6 {

    public static void main(String[] args) {

        // kullanicidan kac bilet  istedigini (int) vr sigorta isteyip istemedigini (booelan olarak) alip ekrana yazin


        Scanner sc = new Scanner(System.in);

        System.out.print(" Kac bilet istiyorsunuz =");

        int bilet = sc.nextInt();

        System.out.print("Sigorta istiyormusunuz = ");

        boolean  sigorta = sc.nextBoolean();

        System.out.println("sigorta = " + sigorta);
        System.out.println("bilet = " + bilet);






    }




}
