package javacore.formatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localIT = Locale.ITALY;
        NumberFormat[] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getInstance();
        nf[1] = NumberFormat.getInstance(localeJP);
        nf[2] = NumberFormat.getInstance(localeBR);
        nf[3] = NumberFormat.getInstance(localIT);
        double valor = 10_000.2130;
        for (NumberFormat numberFormat : nf) {
            System.out.println(numberFormat.getMaximumFractionDigits()); //digitos fracionarios
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "1000.2130";
        try {
            System.out.println(nf[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
