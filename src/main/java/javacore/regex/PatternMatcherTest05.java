package javacore.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@gamil.br, teste@gmail.br, teste@gmail.com.br, sakura@mail.com";
        System.out.println("Email valido");
        System.out.println("#@!zoro@gamil.br".matches(regex));
        System.out.println(texto.split(",")[1].trim());
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
