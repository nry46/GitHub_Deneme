package Gun005;

public class ornek11 {

    public static void main(String[] args) {

// string olarak verilen gece gündüz hava sicakligi bilgisinin toplamini yazdirin.
        String gece ="2";
        String gunduz ="25";
         int gece1= Integer.parseInt(gece);
         int gunduz1= Integer.parseInt(gunduz);

        int  toplamSicaklik= gunduz1 + gece1;

        System.out.println("toplamSicaklik = " + toplamSicaklik);

        System.out.println("==================tekrar======================");
        
        String krefeldKoln="65";
        String krefeldDusel="33";
        
        int km1=Integer.parseInt(krefeldKoln);
        int km2=Integer.parseInt(krefeldDusel);
        
        int toplamKm= km1+km2;
        System.out.println("toplamKm = " + toplamKm);



        String uzunluk1="35";
        String uzunluk2="15";

        double a=Double.parseDouble(uzunluk1);
        double b=Double.parseDouble(uzunluk2);
        
        double top= a+b;

        System.out.println("top = " + top);














    }
}
