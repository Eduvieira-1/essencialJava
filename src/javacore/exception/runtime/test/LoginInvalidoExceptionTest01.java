package javacore.exception.runtime.test;

import javacore.exception.exceptioN.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);
        String usernameDB = "Goten";
        String senhaDB = "ssj";
        System.out.println("Usuário: ");
        String usernameDigitado = sc.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = sc.nextLine();
        if(!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
