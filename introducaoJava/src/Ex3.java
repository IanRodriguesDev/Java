/*
Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais,
diferentes, o primeiro é maior ou o segundo é maior.
*/

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
    System.out.println("Digite dois numeros para analise");
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o primeiro numero: ");
    int numero1 = entrada.nextInt();
    System.out.println("Digite o segundo numero: ");
    int numero2 = entrada.nextInt();;

    if (numero1 > numero2) {
        System.out.println("O primeiro numero é maior");
    } else if (numero1 < numero2) {
        System.out.println("O segundo numero é maior");
    } else if(numero1 == numero2){
        System.out.println("Os numeros são iguais");
    }

    }
}
