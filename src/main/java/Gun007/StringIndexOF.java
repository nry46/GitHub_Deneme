package Gun007;

public class StringIndexOF {
    public static <string> void main(String[] args) {

        //verilen karakterlerin string icerindeki baslangic indexini verir.


        String text = "Good";

        System.out.println(" G harfinin indexi = " + text.indexOf("G")); // indexler 0 dan baslar
        System.out.println(" d harfinin indexi = " + text.indexOf("d"));
        System.out.println(" H harfinin indexi = "+ text.indexOf("H"));  // -1 bulunamadi, yok
        System.out.println( "od nin indexi = " + text.indexOf("od"));  // var ise ilk harfinin indexini verir












    }
}
