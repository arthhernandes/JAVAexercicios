public class Main {
    public static void main(String[] args) {

        Livro[] biblioteca = new Livro[5];


        for (int i = 0; i < 5; i++){
            String titulo = InputHelper.getInput("\nDigite o título do livro: ");
            String autor = InputHelper.getInput("Digite o nome do Autor: ");
            int ano = InputHelper.getAno("Digite o ano de publicação: ");

            biblioteca[i] = new Livro(titulo, autor, ano);
        }

        for (int i = 0; i < 5; i++){
            biblioteca[i].exibirInfo();
        }

    }
}