package javacore.date.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingão e o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        c.add(Calendar.DAY_OF_MONTH, 2); // Para adicionar com a consequencia de talvez virar o dia conforme o que acrescentar
        c.roll(Calendar.HOUR, 12); // Para adicionar mas sem dar virada de dia
        Date date = c.getTime();
        System.out.println(date);
    }
}
