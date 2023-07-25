package javacore.string.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "  Luffy  ";
        String numeros = "012345";
        System.out.println(nome.charAt(0)); // Trás a letra do indice informado
        System.out.println(nome.length());// faz a contagem de caracter da string
        System.out.println(nome.replace("f", "l")); // troca todas as letras que forem por ex: F para L
        System.out.println(nome.toLowerCase());// transforma a string em miniscula
        System.out.println(nome.toUpperCase());// transforma a string em maiuscula
        System.out.println(numeros.length()); //Contagem de todos os caracteres
        System.out.println(numeros.substring(0, 4)); //contagem de onde você quer começar e aonde você quer terminar
        System.out.println(numeros.substring(3, numeros.length()));
        System.out.println(nome.trim()); // remoção de espaços do inicio e fim da string
    }
}
