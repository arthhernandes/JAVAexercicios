public class Livro {

    private String titulo;
    private String autor;
    private int ano;

    Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void exibirInfo(){
        System.out.println("\nTítulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + ano);
    }
}
