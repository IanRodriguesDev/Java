/*
*Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
* */

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println("Digite um numero para que eu te entregue o fatorial do mesmo");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int n2 = n - 1;
        int n3 = 0;
        int i;

        for (i = n2; i > 0; i--) {
            n3 = n * i;
            n = n3;
        }
        System.out.println(n3);
    }
}
