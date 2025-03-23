/*
Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso
contrário, exiba "Número negativo".
*/
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean flag = true;

        System.out.println("Digite um numero e eu te direi se ele é positivo ou negativo. ");
        System.out.println("Para sair digite 'sair', aperte enter. ");

        while(flag) {
            System.out.println("Digite um numero: ");
            int numero = entrada.nextInt();

            if (numero >= 0) {
                System.out.println("Esse numero é positivo.");
            } else {
                System.out.println("Esse numero é negativo.");
            }

            String verificador = entrada.nextLine();
            if (verificador == "sair") {
                flag = false;
            }
        }
    }
}
