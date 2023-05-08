package Gun038.nonAccessModifier.finalModifier.example;

public class ex1 {
    public static void main(String[] args) {
        // bir dairenin alani pi*r*r dir
        int yaricap=4;
        double alan=4*4*Constans.pi;

        // verilen saat,dakika, ve gün bilgisini
        // saniyeye çeviriniz.

        int gun = 23;
        int saat = 7;
        int dakika=25;

        int saniyeCinsinden = gun * Constans.hourInDay*Constans.minuteInHour+
                saat * Constans.minuteInHour+
                dakika * Constans.secondInMinute;

// eksik kod yazdim sonra tamamla

    }
}
