package javacore.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo o que nao for digito
        // \s = espaços em branco \t \n \f \r
        // \S = todos os caracteres excluindo os brancos
        // \w = a-Z,A-Z, dígitos, _
        // \W = tudo o que não for incluso no \w
        String regex = "\\W";
        String texto2 = "@#hhj2 12gv\th21kh2";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:   "+ texto2);
        System.out.println("indice:  0123456789");
        System.out.println("regex "+ regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
