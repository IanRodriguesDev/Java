public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderozo chefão.";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracao = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalAvaliacoes);
        System.out.println(meuFilme.obterMedia());

        //Pessoa
        Pessoa pessoa1= new Pessoa();
        System.out.println(pessoa1.exibeMensagem());

        //calculadora
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.aoQuadrado(4));

        //Musica
        Musica musical = new Musica();
        musical.avaliarMusica(6);
        musical.avaliarMusica(10);
        musical.avaliarMusica(6);
        musical.mediaAvaliacoes();
        musical.fichaTecinica();
    }
}
