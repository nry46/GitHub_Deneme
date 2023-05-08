package Gun042.PeriodAndDuration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class JavaDuration2 {
    public static void main(String[] args) {
        LocalTime geceYarisi=LocalTime.of(0,0);
        
        LocalTime ogleVakti=LocalTime.of(13,10,7,18);

        Duration fark=Duration.between(geceYarisi,ogleVakti);
        System.out.println("fark = " + fark);


        System.out.println("fark.toMillis() = " + fark.toMillis());

        System.out.println("fark.toHours() = " + fark.toHours());// toplam saati verir
        System.out.println("fark.toMinutes() = " + fark.toMinutes());// saat dahil toplam dakikayi verir
        System.out.println("fark.toDays() = " + fark.toDays());// toplam günü verir

        System.out.println("fark.toHoursPart() = " + fark.toHoursPart());// bu bölüm sadece saati verir
        System.out.println("fark.toMinutesPart() = " + fark.toMinutesPart());// bu bölüm sadece bölümünü dakikayi verir, toplami vermez.
        System.out.println("fark.toSecondsPart() = " + fark.toSecondsPart());// bu bölüm sadece saniyeyi verir

        System.out.println("fark.toMillisPart() = " + fark.toMillisPart()); //bu bölüm sadece millisaniyeyi verir

        System.out.println("fark.toNanosPart() = " + fark.toNanosPart());//bu bölüm sadece Nanosaniyeyi verir
    }
}
