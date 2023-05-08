package Gun007;

public class StringLastIndexOf {

    public static void main(String[] args) {
         // String icinde aranan karakterlerin sondan itibaren ilk indexini verir
        // indexOf un sondan olan hali fakat index numaralari degismez


        String text = " Good";
        System.out.println(" En sondaki o nun indexi = "+ text.lastIndexOf("o"));
        System.out.println(" Ilk basta  o nun indexi = " + text.indexOf("o"));



        String text2 =" Ankara";
        System.out.println(" En sondaki a nun indexi = " + text2.lastIndexOf("a"));

        System.out.println(" Ilk basta  a nun indexi = " + text2.indexOf("a"));




    }
}
