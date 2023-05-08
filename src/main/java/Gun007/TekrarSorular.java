package Gun007;

import java.util.Scanner;

public class TekrarSorular {

    public static void main(String[] args) {
       /*
        String hava="Bugun hava kapali onun icin disari cikamadim";
        
        int karakter=hava.length();
        System.out.println("karakter = " + karakter);

        System.out.println("===============================");

        String a="Javayi ogreniyorum";
        int b=a.length();
        System.out.println("b = " + b);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        String ilk="javaya merhaba";
        char sira=ilk.charAt(8);

        System.out.println("sira = " + sira);
        
        
        String kelime="hava cok güzel";
        char kacsira=kelime.charAt(5);

        System.out.println("kacsira = " + kacsira);

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>");


        Scanner sc=new Scanner(System.in);
        System.out.println(" bir kelime giriniz");
        String x=sc.nextLine();
        
        int uz=x.length();
        char kac=x.charAt(x.length()-1);
        System.out.println("kac = " + kac);*/

      /*  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<");

        String s="ben";
        String s1="gidiyorum";
        System.out.println(s.concat(s1));
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        
        
        String s2= "benim aradigim";
        boolean varmi= s2.contains("digim");
        System.out.println("digim = " + varmi);
        System.out.println("c var mi = " +s2.contains("c"));
        System.out.println(" m varmi = " + s2.contains("m"));
        System.out.println(" j  varmi = " + s2.contains("j"));*/
/*
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>");

        String a=" Guten Morgen";
        boolean b=a.equals("Morgen");
        System.out.println("ayni mi = " + b);
        boolean c=a.equals(" Guten Morgen");
        System.out.println("birebir ayni mi  = " + c);

        boolean d=a.equalsIgnoreCase(" GuteN MoRgen");
        System.out.println("ignore  = " + d);

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");


        String text ="Guten morgen";

        System.out.println(" g harfinin indexi  = " + text.indexOf("g"));
        System.out.println(" G harfinin indexi  = " + text.indexOf("G"));
        System.out.println(" m harfinin indexi  = " + text.indexOf("m"));
        System.out.println(" n harfinin indexi  = " + text.indexOf("n"));
        System.out.println(" e harfinin indexi  = " + text.indexOf("e"));
        System.out.println(" t harfinin indexi  = " + text.indexOf("t"));
        System.out.println(" t harfinin indexi  = " + text.indexOf("t"));
        System.out.println(" z harfinin indexi  = " + text.indexOf("z"));


        System.out.println("  en sondaki  e harfinin indexi  = " + text.lastIndexOf("e"));
        System.out.println(" en bastaki e harfinin  indexi  = " + text.indexOf("e"));
        System.out.println(" en sondaki n  harfinin indexi  = " + text.indexOf("n"));
        System.out.println(" en bastaki  n  harfinin indexi  = " + text.lastIndexOf("n"));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<");

        System.out.println("ici bos mu  = " + text.isEmpty());

        String text2= " ";

        System.out.println("ici bos mu = " + text2.isEmpty());

        String text3="";
        System.out.println("ici bos mu  = " + text3.isEmpty());

        System.out.println("<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


        String str="bende bilgisayari anladim ya...";
        System.out.println("1.bölüm  = " + str.substring(5));
        System.out.println("2.bölüm  = " + str.substring(4,17));
        System.out.println("3.bölüm  = " + str.substring(1,12));
        System.out.println("4.bölüm  = " + str.substring(18,20));

        Scanner oku= new Scanner(System.in);
        System.out.println(" Adiniz ve Soyadiniz");
        String ad= oku.nextLine();

        char ilkharf= ad.charAt(0);
        int bosluk= ad.indexOf(" ");
        char soyadiIlk=ad.charAt(bosluk +1);


        System.out.print(ilkharf + " ."+soyadiIlk +".");*/

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        Scanner sc= new Scanner(System.in);

        System.out.print("Adiniz ve Soyadiniz");

        String ad=sc.nextLine();
        char ilkHarf=ad.charAt(0);
        int IlkBosluk=ad.indexOf(" ");
        char IkinciHarf=ad.charAt(IlkBosluk +1);
        int ikinciBosluk= ad.lastIndexOf(" ");
        char UcuncuHarf= ad.charAt(ikinciBosluk +1);
        System.out.println(ilkHarf +"."+IkinciHarf+"."+UcuncuHarf+ ".");

































    }




}
