/*
Crie um programa que solicite ao usuário um número e exiba a
tabuada desse número de 1 a 10.
*/

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("""
                Tabuada inteligente.
                Digite um numero de 1 a 10,
                e te falaremos a sua tabuada!
                """);
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " x " + numero + " = " + i * numero);
        }
    }
}
