package javacore.threads.test;

import javacore.threads.dominio.Account;

public class ThreadAccountTest01 implements Runnable {
    private final Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "dudu");
        Thread t2 = new Thread(threadAccountTest01, "edu");
        t1.start();
        t2.start();
    }

    private void withdrawl(int amount) {
        System.out.println(getThreadName() + " ### fora do synchronized");
        synchronized (account) {
            System.out.println(getThreadName() + " *** dentro do synchronized");
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " está indo sacar dinheiro");
                account.withdrawal(amount);
                System.out.println(getThreadName() + " Completou o saque, valor atual da conta " + account.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque " + account.getBalance());
            }
        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawl(10);
            if (account.getBalance() < 0) {
                System.out.println("FODEO MEU PARCEIRO");
            }
        }
    }
}
