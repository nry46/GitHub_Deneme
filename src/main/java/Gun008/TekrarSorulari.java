package Gun008;

public class TekrarSorulari {
    public static void main(String[] args) {



       /* String a= "Guten morgen";
        System.out.println("G ile basliyor mu? = " + a.startsWith("G"));
        System.out.println("mo ile basliyor mu? = " + a.startsWith("mo"));
        System.out.println("Gu ile basliyor mu? = " + a.startsWith("Gu"));
        System.out.println("g ile basliyor mu? = " + a.startsWith("g"));


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<");


        String b="guteN Morgen";
        System.out.println("Orjinal hali = "+ b);
        System.out.println("buyuk  hali = " + b.toUpperCase());

        System.out.println("orjinal hali = " + b);
        System.out.println("kücük hali hali = " + b.toLowerCase());

        System.out.println(">>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<");

        String c="         Guten morgen";
        System.out.println("orjinal hali = " + c);
        System.out.println("bosluksuz  hali = " + c.trim());

        String d="                                       Wie geht es";

        System.out.println("orjinal hali = " + d);
        System.out.println("bosluksuz  hali = " + d.trim());*/

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>");



        String x="Guten Morgen";
        System.out.println("orjinal hali = " + x);
        System.out.println("u harfini e harfi ile degistir = " + x.replace("u","e"));
        System.out.println("m harfini s ile degistir = " + x.replace("M","s"));
        System.out.println("Morgen kelimesini Abend ile degistir = " + x.replace("Morgen","Abend"));

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        // replaceFirst ile

        System.out.println("orjinal hali = " + x);
        System.out.println("ilk bulunan e harfini degistir  = " + x.replaceFirst("e","o"));
        System.out.println("ilk bulunan n harfini degistir  = " + x.replaceFirst("n","s"));
        System.out.println("ilk bulunan en harfini degistir  = " + x.replaceFirst("en","us"));

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>");
        //replaceAll

        System.out.println("orjinal hali = " + x);
        System.out.println("u,e,g  harfleri * hali = " + x.replaceAll("[ueg]","*"));
        System.out.println("buyuk   harfleri + hali = " + x.replaceAll("[A-Z]","+"));
        System.out.println("kucuk   harfleri _ hali = " + x.replaceAll("[a-z]","_"));
        System.out.println("bir bolumu   harfleri _ hali = " + x.replaceAll("[m-z]","#"));























    }
}

