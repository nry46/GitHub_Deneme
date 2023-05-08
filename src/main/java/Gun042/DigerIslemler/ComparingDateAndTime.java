package Gun042.DigerIslemler;

import java.time.LocalDate;
import java.time.LocalTime;

public class ComparingDateAndTime {
    public static void main(String[] args) {

        LocalDate bugun= LocalDate.now();
        LocalDate dun=bugun.minusDays(1);


        boolean after=bugun.isAfter(dun); //bugun dunden sonra mi? true
        System.out.println("after = " + after);
        
        boolean before=bugun.isBefore(dun);// bugun dünden önce mi? false
        System.out.println("before = " + before);
        
        boolean equal= bugun.isEqual(dun);// bugun düne esit mi? false
        System.out.println("equal = " + equal);
        
        boolean leapyear=bugun.isLeapYear();// artik yil mi? true
        System.out.println("leapyear = " + leapyear);

        int fark= bugun.compareTo(dun); // 2 tarih arsindaki farkin rn buyuk parcasi arasindaki farki verir
        System.out.println("fark compare= " + fark);



//        2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
//        2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
//        2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için


    }
}
