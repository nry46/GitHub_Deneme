package Gun041.creatingAndFormatting;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class javaZonedDateTime {
    public static void main(String[] args) {
        // Baska bölgelerin veya Ülkelerin saat dilimine  göre zaman alma
        ZonedDateTime zdt=ZonedDateTime.now();   // zone bölge demek
       Set<String > Bolgeler =ZoneId.getAvailableZoneIds();

        for (String s:Bolgeler) {
            System.out.println("s = " + s);

        }
        ZonedDateTime zdtABD=ZonedDateTime.now(ZoneId.of("America/New_York")); // ABD deki saat

        ZonedDateTime zdtLocal=ZonedDateTime.now(); //Burda ki saat dilimi

        System.out.println("zdtABD = " + zdtABD);
        System.out.println("zdtLocal = " + zdtLocal);


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        // formatli hali
        DateTimeFormatter format1= DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        System.out.println("zdtLocal = " + zdtLocal.format(format1));
        System.out.println("zdtABD = " + zdtABD.format(format1));
    }
}
