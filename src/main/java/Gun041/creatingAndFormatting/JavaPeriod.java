package Gun041.creatingAndFormatting;

import java.time.LocalDate;
import java.time.Period;

public class JavaPeriod {
    public static void main(String[] args) {

        // Period: 2 tarih arsinda gecen zamani yil ay gun olarak verir.
        LocalDate dt=LocalDate.of(1991,12,2);
        LocalDate bugun=LocalDate.now();

         Period fark=Period.between(dt,bugun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());

        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println("fark = "+fark.getYears()+ "yil , "+fark.getMonths()+"Ay ,"+fark.getDays()+ "gun ,");


    }



}
