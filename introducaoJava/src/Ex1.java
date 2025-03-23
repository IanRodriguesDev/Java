/*
Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que
o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado
pelo usuário é maior ou menor do que o número gerado.
*/

import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numero = random.nextInt(100) + 1;
        int contador = 1;
        boolean flag = true;
        int resposta = 0;

        System.out.println("O desafio é: chute um numero de 1 a 100, e tente acertar o numero que a maquina acertou! ");
        System.out.println("Você terá 5 tentativas, e daremos dicas sobre o numero");
        System.out.println("Após a falha ou acerto do desafio, a maquina ira gerar um novo numero! ");
        System.out.println("Boa Sorte!!! ");

        while (flag) {
            System.out.println("Tentativa numero: " + contador + " Qual seu chute?");
            resposta = scanner.nextInt();

            if (resposta == numero) {
                System.out.println("Parabens voce acertou!! Com " + contador + " tentativas!");
                break;
            } else {
                if (resposta > numero) {
                    System.out.println("Seu chute foi maior que o numero!");
                } else {
                    System.out.println("Seu chute foi menor que o numero!");
                }
            }

            if (contador == 5) {
                flag = false;
            }
            contador++;
        }
    }

}
