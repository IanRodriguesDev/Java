/*
* Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
* Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
* */

import java.util.Scanner;

public class Ex4 {
        public static void main(String[] args) {
            var opcoes = """
                    Escolha uma opção de calculo:\s
                    1 - Calcular área do quadrado
                    2 - Calcular área do círculo.""";
            System.out.println(opcoes);

            Scanner scanner = null;
            scanner = new Scanner(System.in);
            int escolha = scanner.nextInt();

            if (escolha == 1){
                System.out.println("Digite o lado do quadrado que deseja calcular: ");
                float area = scanner.nextFloat();
                area = area * area;
                System.out.println("Essa é a area do quadrado: " + area);

            }   else if (escolha == 2){
                System.out.println("Digite o raio que deseja calcular: ");
                float raio = scanner.nextFloat();
                float pi = 3.14162F;
                raio = pi * (raio * raio);

                System.out.println("A area do circulo é: " + raio);
            }

        }
}
