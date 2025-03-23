/*
*Crie um programa que solicite ao usuário a entrada de um número inteiro.
*Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
* */

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println("Digite um numero inteiro, que te falarei se ele é par ou impar");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        int calculo = numero % 2;

        if (calculo != 0) {
            System.out.println("O numero digitado é ímpar");
        } else {
            System.out.println("Seu numero é par");
        }
    }
}
