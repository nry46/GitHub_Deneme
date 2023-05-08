package Gun031;

public class JavaClassAndObject1 {

    public static void main(String[] args) {
        Araba araba1=new Araba();
        araba1.model="Opel Astra";
        araba1.yili=2010;
        araba1.motorHacmi=1600;

        System.out.println("araba1.model = " + araba1.model);
        System.out.println("araba1.yili = " + araba1.yili);

        System.out.println("araba1.motorHacmi = " + araba1.motorHacmi);



    }
}

// 1.yontem
// Araba sinifi
class Araba{

    //properties , Attributes, fields
    String model;
    int yili;
    double motorHacmi;
}