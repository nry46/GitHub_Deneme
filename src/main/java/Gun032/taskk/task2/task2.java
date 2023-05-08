package Gun032.taskk.task2;

public class task2 {
    // 1. Adim : ayri dosyada olmak üzerecustomer isimli  (fields: name) isimli bir class olusturun
    // 2.Adimayri bir dosyada ElektricityAcount isimli (fields. totalKw,rate(double), bill)
    // 3. Adim : customer a bir ElektricityAcount ekleyiniz
    // 4.Adim: 1 tane musteri olusturunuz, Account u dahil
    //5. Adim: musteriye ait her ay tüketilen enerjiyi toplayacak metod yazin
    // 6. adim : ödenecek rakami toplam tuketim ile rate ile carparak hesaplayin


    public static void main(String[] args) {
        Customer musteri1=new Customer();
        musteri1.name= "kaya";
        musteri1.elektrikAbonesi= new ElectricityAccount();
        musteri1.elektrikAbonesi.tuketimEkle(100); // ocak ayi
        musteri1.elektrikAbonesi.tuketimEkle(150);// subat ayi

        System.out.println("musteri1.elektrikAbonesi.totalKv = " + musteri1.elektrikAbonesi.totalKv);
        System.out.println("musteri1.elektrikAbonesi.totalBill() = " + musteri1.elektrikAbonesi.totalBill());


    }
}

