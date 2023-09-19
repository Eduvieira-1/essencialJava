package javacore.formatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale locale = new Locale("pt", "BR");
        Locale localeItaly = new Locale("it", "IT");

        Calendar calendar = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        System.out.println("Brasil: " + df.format(calendar.getTime()));
        System.out.println("Italia: " + df2.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeItaly.getDisplayLanguage());


    }
}
