package javacore.formatacao.test;

import javacore.associacao.dominio.Local;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localUS = Locale.US;
        NumberFormat[] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getCurrencyInstance();
        nf[1] = NumberFormat.getCurrencyInstance(localeJP);
        nf[2] = NumberFormat.getCurrencyInstance(localeBR);
        nf[3] = NumberFormat.getCurrencyInstance(localUS);
        double valor = 10_000.2130;
        for (NumberFormat numberFormat : nf) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "$10,000.21";
        try {
            System.out.println(nf[3].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
