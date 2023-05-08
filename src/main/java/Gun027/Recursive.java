package Gun027;

public class Recursive {
    // 1 den 70  e kadar olan sayilarin toplamini bul.

    public static int topla(int a) {
        if (a == 1) return 1;
        return a+topla(a-1);

    }
    // faktöriyel hesaplama
    public static int faktoriyel( int fakt){
        if (fakt==1) return 1;
        return fakt*faktoriyel(fakt-1);
    }


    public static void main(String[] args) {

        System.out.println(topla(70));
        System.out.println(faktoriyel(5));




    }
}
