public class Main {
    public static <string> void main(String[] args) {
        System.out.println("Este é o Screen Match");
        System.out.println("Filme: Top'Gun: Maverick");

        int ano = 2025;
        System.out.println("Ano de lançamento: " + ano);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 6.4;
        //Media calculada.
        double media = (9.8 + 6.4 + 8.8) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura.
                Muito bom!
                ano de lancamento
                """ + ano;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) media / 2;
        System.out.println(classificacao);

    }
}