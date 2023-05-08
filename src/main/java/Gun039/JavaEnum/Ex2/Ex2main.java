package Gun039.JavaEnum.Ex2;

public class Ex2main {

    public static void main(String[] args) {

        //       User kullanici=new User();
//        kullanici.name="Alperen";
//        kullanici.Role=1;
//        kullanici.Status=2;
//
//        User kullanici2=new User();
//        kullanici.name="Çiğdem";
//        kullanici.Role=1;
//        kullanici.Status=1;

        User kul1=new User();
        kul1.name="Alperen";
        kul1.yetkisi = Role.admin;
        kul1.durum = Status.Active;

        User kul2 = new User();
        kul2.yetkisi = Role.customer;
        kul2.durum = Status.Inaktive;

        // Önceden belli olan sabit verilerin
        // atanmasındaki anlama zorluğu yerine
        // bu değerlerin karşılıkları ENUM ile
        // tanımlanarak , atama değeri için kullanılrlar.
        // Bu durum yazma ve anlama kolaylığı sağlar.

    }
}
