public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalAvaliacoes;
    int duracao;

    void exibeFichaTecnica(){
        System.out.println("Nome do Filme " + nome);
        System.out.println("Ano de lancamento " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double obterMedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}