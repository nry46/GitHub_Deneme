package Gun012;

import java.util.Scanner;

public class
soru5 {

    public static void main(String[] args) {

        // Kullanicidan alt ve üst degeri isteyerek random ayi uretiniz ve yazdirin

        Scanner sc = new Scanner(System.in);
        System.out.print(" alt deger ");
        int min =sc.nextInt();

        System.out.print(" üst deger ");
        int max =sc.nextInt();

        int numberinRange= (int) (Math.random()* ((max - min) +1)) +min;


        System.out.println("numberinRange = " + numberinRange);











    }
}
