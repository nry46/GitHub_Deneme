package Gun042.DigerIslemler;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StringToLocaldateAndTime {
    public static void main(String[] args) {

        String strDate="01 25 2020";

        DateTimeFormatter format=DateTimeFormatter.ofPattern("MM dd yyyy");// string degeri tarihe cevirmek icin format belirledik.
        LocalDate tarih= LocalDate.parse(strDate,format);// stringin formati bu formata uygun olmali. parse ile cevirdik.
        System.out.println("tarih = " + tarih);
        
        String strTime="12:49";
        LocalTime time=LocalTime.parse(strTime);// parse ile string olan zaman bilgisi, LocalTime tipi gerçek zaman değişkenine
        System.out.println("time = " + time);
    }
}
