package Gun038.nonAccessModifier.finalModifier.example3;

public class ex3 {
    final String name;

    public ex3(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        ex3 ornek1=new ex3("ali");
        ex3 ornek2=new ex3("ahmet");
//        ornek1.name="ali";   final oldugu icin, ilk deger atama sonrasi degistirilemez.
//        ornek2.name="ahmet"; final oldugu icin, ilk deger atama sonrasi degistirilemez.

        System.out.println("ornek1.name = " + ornek1.name);
        System.out.println("ornek2.name = " + ornek2.name);

    }
}
