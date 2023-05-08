package Gun038.nonAccessModifier.staticModifier;

public class ogrenciler {

    public static void main(String[] args) {
        ogrenci ogr1=new ogrenci("ali","yilmaz");
        ogrenci ogr2=new ogrenci("ayse","demir");
//        ...
//        ...
//        ...
         ogrenci ogr500=new ogrenci("mehmet","kaya");

         ogr1.print();
         ogr2.print();
         ogr500.print();

        //1- Kural static field a sadece class dan erişilir
        //2- Kural diğer field lara sadece new ile oluşturulmuş nesnelerden
        //   ulaşılır.
        //3- Ancak oluşturulmuş bir nesnenin metodlarında
        //   static değişkene ulaşılabilir.



    }
}
