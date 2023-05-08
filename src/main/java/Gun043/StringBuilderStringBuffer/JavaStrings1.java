package Gun043.StringBuilderStringBuffer;

import java.util.Arrays;

public class JavaStrings1 {
    public static void main(String[] args) {
        String cumle="";
        cumle += "Bugün";
        cumle += " hava"; // String değişkeni çok fazla ekleme veya işlemlere göre perfomansı oldukça düşük.

        // Eğer çok fazla String işlemleri yapacaksak bunun için performansı oldukça iyi olanStringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.Fakat paralel çalışan uygulamalarda güvenli değildir.Ozaman StringBuffer kullanılır.


        
        StringBuilder s=new StringBuilder("Bu");
        s.append("gün");// add gibi, tekrar atamaya gerek yok.
        s.append(" hava");
        s.append(" cok sicak");

        System.out.println("s = " + s);

        System.out.println("s.length() = " + s.length());
        s.append(4);// string olarak yazdiriyor.

        s.reverse();// stringi tersine ceviriyor.
        System.out.println("s = " + s);

        s.delete(0,5);// 0 dahil 5 haric, 5 e kadar olan bölümü sildir.
        System.out.println("s = " + s);

        s.deleteCharAt(3);// sadece 3. indexi siler.
        System.out.println("s = " + s);



        System.out.println("s.length() = " + s.length());// degiskenin icindeki karakter sayisi

        System.out.println("s.capacity() = " + s.capacity());// hafiza genisleyebilmesi icin verilmis ön alan
        //ancak eklendikce artan bir alan, tampon genisleyebilme alani

        s.insert(5,"545");// insert: araya girme demek.. 5 nolu indexe inset yapti
        System.out.println("s = " + s);

        s.insert(4,3.45);// double bile eklenebilir. ama stringe cevirerek ekleyecektir
        System.out.println("s = " + s);


        int [] dizi={2,3,4,5,506};

        s.insert(6, Arrays.toString(dizi));
        System.out.println("s = " + s);


        s=new StringBuilder("Bugünhavaçoksıcak");
        System.out.println("s = " + s);
        s.replace(3,8,"bu");//baslangic ve son  verilen  stringi atar , eger verilenbuyuk ise
        // aradaki bölüm delete olur. üst sinir haric
        System.out.println("s = " + s);




    }
}
