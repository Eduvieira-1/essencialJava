package javacore.date.test;

import java.util.Scanner;

public class ExercicioJava {
    public static void main(String[] args) {

        int opcao;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("----------------------------");
            System.out.print("1-Soma      ||");
            System.out.println(" 2-Subtracao ");
            System.out.print("3-Divisão  ||");
            System.out.println(" 4-Multiplicacao");
            System.out.print("5-Resto da Divisão ||");
            System.out.println(" 6-Dobro");
            System.out.print("7-Quadrado  ||");
            System.out.println(" 8-Cubo");
            System.out.print("9-Raiz Quadrada ||");
            System.out.println(" 0-Sair");
            System.out.println("----------------------------");
            System.out.print("Selecione a operacao: ");
            opcao = sc.nextInt();
            System.out.println();

            switch (opcao) {

                case 1:
                    System.out.println("----SOMA----");
                    System.out.print("Informe o primeiro valor: ");
                    int v1 = sc.nextInt();
                    System.out.print("Informe o segundo valor: ");
                    int v2 = sc.nextInt();

                    int soma;
                    soma = v1 + v2;
                    System.out.println("A soma de " + v1 + " mais " + v2 + " é " + soma);
                    break;
                case 2:
                    System.out.println("----Subtracao----");
                    System.out.print("Informe o primeiro valor: ");
                    int s1 = sc.nextInt();
                    System.out.print("Informe o segundo valor: ");
                    int s2 = sc.nextInt();

                    int sub;
                    sub = s1 - s2;
                    System.out.println("A subtração de " + s1 + " menos " + s2 + " é " + sub);
                    break;
                case 3:
                    System.out.println("----Divisao----");
                    System.out.print("Informe o primeiro valor: ");
                    int d1 = sc.nextInt();
                    System.out.print("Informe o segundo valor: ");
                    int d2 = sc.nextInt();

                    int divisao;
                    divisao = d1 / d2;
                    System.out.println("A divisao de " + d1 + " por " + d2 + " é " + divisao);
                    break;
                case 4:
                    System.out.println("----Multiplicacao----");
                    System.out.print("Informe o primeiro valor: ");
                    int m1 = sc.nextInt();
                    System.out.print("Informe o segundo valor: ");
                    int m2 = sc.nextInt();

                    int mult;
                    mult = m1 + m2;
                    System.out.println("A multiplicacao de " + m1 + " vezes " + m2 + " é " + mult);
                    break;
                case 5:
                    System.out.println("----Resto da divisao----");
                    System.out.print("Informe o primeiro valor: ");
                    int r1 = sc.nextInt();
                    System.out.print("Informe o segundo valor: ");
                    int r2 = sc.nextInt();

                    int rest;
                    rest = r1 % r2;
                    System.out.println("O resto da divisão de " + r1 + " dividido " + r2 + " é " + rest);
                    break;
                case 6:
                    System.out.println("----Dobro----");
                    System.out.print("Informe o valor: ");
                    int dr1 = sc.nextInt();

                    int dobro;
                    dobro = dr1 * 2;
                    System.out.println("O dobro de " + dr1 + " é " + dobro);
                    break;
                case 7:
                    System.out.println("----Quadrado----");
                    System.out.print("Informe o valor: ");
                    double q1 = sc.nextInt();

                    double quadrado;
                    quadrado = Math.pow(q1, 2);
                    System.out.println("O quadrado de " + q1 + " é " + quadrado);
                    break;
                case 8:
                    System.out.println("----Cubo----");
                    System.out.print("Informe o valor: ");
                    double c1 = sc.nextInt();

                    double cubo;
                    cubo = Math.pow(c1, 3);
                    System.out.println("O cubo de " + c1 + " é " + cubo);
                    break;
                case 9:
                    System.out.println("----Raiz Quadrada----");
                    System.out.print("Informe o primeiro valor: ");
                    double rq1 = sc.nextInt();

                    double raizQuadrada;
                    raizQuadrada = Math.sqrt(rq1);
                    System.out.println("A raiz quadrade de " + rq1 + " é " + raizQuadrada);
                    break;

                default:
                    System.out.println("Saindo do programa.....");
            }
        } while (opcao != 0);

    }
}
