package javacore.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo o que nao for digito
        // \s = espaços em branco \t \n \f \r
        // \S = todos os caracteres excluindo os brancos
        // \w = a-Z,A-Z, dígitos, _
        // \W = tudo o que não for incluso no \w
        // []
       // String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
       // String texto2 = "cafeBABE";
        String texto2 = "12 0x 0xFFABC 0x109 0x1";
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
