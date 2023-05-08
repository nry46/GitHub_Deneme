package Gun007;

public class deneme {
    public static void main(String[] args) {
// contains
        String a="Seni cok ozledim anne";
        System.out.println("ne var mi = "  + a.contains("ne"));//true

        System.out.println("z varmi = " + a.contains("z")); //true

        System.out.println("s varmi = " + a.contains("s")); // false
        System.out.println("S varmi = " + a.contains("S")); //true


        System.out.println("w varmi = " + a.contains("w"));//false


        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        //charAt

        System.out.println(" 9. index hangi harfi verir = "+ a.charAt(9));

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
        // concat

        String b="sen bir tanesin,";

        System.out.println(a+ " "+b);
        System.out.println(a.concat(" " + b));

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        //equals
        String str1="guten tag";
        String str2="Guten tag";
        String str="Guten tag";

        System.out.println(str.equals(str2));//true
        System.out.println(str1.equals(str2)); //false

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<");
        //egualsIgnoreCase
        String str4="gutin morgen";

        System.out.println(str.equalsIgnoreCase(str2));//True
        System.out.println(str.equalsIgnoreCase(str1));// true
        System.out.println(str.equalsIgnoreCase(str4));// false

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<");

        // IndexOf
        //String a="Seni cok ozledim anne";

        System.out.println("or kacinci index = " +a.indexOf("or")); //-1
        System.out.println("l kacinci index = " +a.indexOf("l")); //11
        System.out.println("i kacinci index = " +a.indexOf("i")); //3

        System.out.println(" ilk bosluktan sonraki harf = " +b.indexOf(" "));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<");

        //lastIndexOf
        System.out.println("en sondaki -n- kacinci index = " + a.lastIndexOf("n"));
        System.out.println(" en sondaki -i- kacinci index = " + a.lastIndexOf("i"));



        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<");

        //length
        System.out.println(a.length());
        System.out.println(a.length()+ b.length());

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<");

        //substring

        System.out.println(a.substring(6,10));
        System.out.println(b.substring(2,7));
        System.out.println(a.substring(6,11));



        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<");
        //isEmpty

        System.out.println(a.isEmpty());// false

        String c= "";
        System.out.println(c.isEmpty());// true
        String  d="   ";
        System.out.println(d.isEmpty());// false













    }
}
