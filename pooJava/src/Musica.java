//Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos
//para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int avaliacao;
    int numeroAvaliacoes;

    void fichaTecinica(){
        System.out.println("Titulo: " + titulo);
        System.out.println("\n Artista: " + artista);
        System.out.println("\n Ano lancamento: " + anoLancamento);
        System.out.println();
    }

    void avaliarMusica(int nota){
        avaliacao += nota;
        numeroAvaliacoes++;
        return;
    }

    void mediaAvaliacoes() {
        double media = (avaliacao / numeroAvaliacoes);
        System.out.println(media);
    }
}
