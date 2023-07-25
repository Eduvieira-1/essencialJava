package javacore.formatacao.test;

import javacore.associacao.dominio.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        LocalDate parse1 = LocalDate.parse("20230322", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2023-03-22", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2023-03-22", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2023-03-22T14:10:35.5859842", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

//        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        String formatBR = LocalDate.now().format(formatterBR);
//        System.out.println(formatBR);
//        LocalDate parseBR = LocalDate.parse("22/03/2023", formatterBR);
//        System.out.println(parseBR);

  //

    }
}
