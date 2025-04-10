public class Jogador {

    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome){
        this.nome = nome;
        this.pontuacao = 0;
        this.nivel = 1;
    }

    public void aumentaPontuacao(int pontos){
        if(pontos > 0) {
            pontos += pontos;
            System.out.println("Pontuação aumentada em " + pontos + " pontos.");
        }
    }
}
