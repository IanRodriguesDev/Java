public class Condicional {
    public static void main(String[] args) {
        int ano = 2025;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 6.4;
        String tipoPlano= "plus";

        if (ano >= 2022) {
            System.out.println("Lançamento que os cliente estão curtindo");
        } else {
            System.out.println("Filme retro que vale a pena assistir");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Filme não liberado");
        }
    }
}
