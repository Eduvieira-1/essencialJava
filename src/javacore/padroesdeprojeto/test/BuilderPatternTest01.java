package javacore.padroesdeprojeto.test;

import javacore.padroesdeprojeto.dominio.Person;
import org.w3c.dom.ls.LSOutput;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = Person.PessoaBuilder
                .builder()
                .withFirstName("Eduardo")
                .withLastName("César")
                .withUserName("miranhaCortella")
                .withEmail("edu@icloud.com")
                .build();
        System.out.println(build);
    }
}
