package Gun032.example;

public class ex1 {
    //1.adim : person isimli  bir class yaziniz, name, surname,age ; olsun
    // 2.adim :  main de 2 tane bu siniftan nesne olusturup deger atayiniz.
    // 3.adim : getBirthYear isminde persona ait bir metod yaziniz calistiginda kisinin dogum yolunu versin.
    // 4. Adim : getInitials isminde kisinizin adinin ilk harfi , soyadinin ilk harfi seklinde (Buyuk Harf)  veren  metodu yazin.
    // örnek: A.D.

    public static void main(String[] args) {
        Person kisi1=new Person();
        kisi1.name = "Yusuf";
        kisi1.surname = "Yılmaz";
        kisi1.age = 35;

        //1.Yöntem oldukça uğraştırıcı
        System.out.println("kisi1.name = " + kisi1.name);
        System.out.println("kisi1.surname = " + kisi1.surname);
        System.out.println("kisi1.age = " + kisi1.age);

        Person kisi2=new Person();
        kisi2.name = "Ayşe";
        kisi2.surname = "Demir";
        kisi2.age = 30;

        //1.Yöntem oldukça uğraştırıcı
        System.out.println("kisi2.name = " + kisi2.name);
        System.out.println("kisi2.surname = " + kisi2.surname);
        System.out.println("kisi2.age = " + kisi2.age);

        //2.Yöntemin kullanılması : kendi başına yazdır, fakat her nesne için böyle yazarsak oldukça karışır
        BilgiYadir(kisi1); // BU YÖNTEMDE PARAMETRE GÖNDERMEK ZORUNDA kaliyorum, ugrastirici
        BilgiYadir(kisi2);

        //3.Yöntemin main de kullanılması
        kisi1.BilgiYadir();
        kisi2.BilgiYadir();

        System.out.println("kisi2.getBirthYear() = " + kisi2.getBirthYear());
        System.out.println("kisi1 getBirthYear()= " + kisi1.getBirthYear());

        System.out.println("kisi1 = " + kisi1.getInitials());
        System.out.println("kisi2 = " + kisi2.getInitials());
    }

    //2.Yöntem iyi metod kullandık, fakat
    public static void BilgiYadir(Person kisi)
    {
        System.out.println("metod.name = " + kisi.name);
        System.out.println("metod.surname = " + kisi.surname);
        System.out.println("metod.age = " + kisi.age);
    }


}

class Person
{
    // fields, attributes, properties
    String name;
    String surname;
    int age;

    // methods
    void BilgiYadir()  //3.Yöntem ait olduğu class a ekleniyor ve en iyi yöntemi bulmuş oluyoruz
    {
        System.out.println("kisi.name = " + name);
        System.out.println("kisi.surname = " + surname);
        System.out.println("kisi.age = " + age);
    }
    int getBirthYear(){

        return 2020-age;
    }
    // 4. Adim : getInitials isminde kisinizin adinin ilk harfi , soyadinin ilk harfi seklinde (Buyuk Harf)  veren  metodu yazin.
    // örnek: A.D.
    String getInitials(){

        return name.toUpperCase().charAt(0)+"."+surname.toUpperCase().charAt(0)+".";
    }

}