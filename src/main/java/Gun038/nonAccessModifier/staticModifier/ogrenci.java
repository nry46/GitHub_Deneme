package Gun038.nonAccessModifier.staticModifier;

public class ogrenci {

    String  ad;
    String soyad;
    String  okulAd="Yildirim";
    // static kullanim sebebi hafizayi gereksiz tekrarlardan kurtarmak


    public ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        //this.okulAd = okulAd;
    }
    void print(){

        System.out.println(ad+ " "+soyad+" "+okulAd);
    }
}
