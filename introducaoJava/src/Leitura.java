import java.util.Scanner;

public class Leitura    {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.println("Digite a data de lancamento:");
        int data = leitura.nextInt();

        System.out.println("Digite a sua avaliação");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(data);
        System.out.println(avaliacao);
    }
}
