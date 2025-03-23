import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int totalNotas = 0;
        while (nota != 1) {
            System.out.println("Digite a sua nota do filme ou digite '-1' para sair");
            nota = leitura.nextDouble();
            media += nota;
            if (totalNotas != -1) {
                totalNotas++;
            }
        }

        System.out.println("Media avaliação é: " + media / totalNotas);
    }
}
