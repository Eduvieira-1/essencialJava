package javacore.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo o que nao for digito
        // \s = espaços em branco \t \n \f \r
        // \S = todos os caracteres excluindo os brancos
        // \w = a-Z,A-Z, dígitos, _
        // \W = tudo o que não for incluso no \w
        // [] rage
        // ? Zero ou uma
        // * zero ou mais ocorrenria
        // + uma ou mais
        // {n,m} de n até m
        //()
        // | o(V|C)o | oco
        // $
        // .

        String regex = "0[xX]([0-9a-fA-F])+\\s|$";
        String texto = "12 0x 0x 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:   "+ texto);
        System.out.println("indice:  0123456789");
        System.out.println("regex "+ regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
