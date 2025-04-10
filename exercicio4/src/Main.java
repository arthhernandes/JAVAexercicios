public class Main {
    public static void main(String[] args) {
        System.out.println("=== Criar Perfil de Jogador ===");
        String nome = InputHelper.lerTexto("Nome do jogador: ");
        Jogador jogador = new Jogador(nome);

        int opcao;

        do {
            System.out.println("\n--- Menu do Jogador ---");
            System.out.println("1. Exibir informações");
            System.out.println("2. Aumentar pontuação");
            System.out.println("3. Subir de nível");
            System.out.println("0. Sair");
            opcao = InputHelper.lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    jogador.exibirInformacoes();
                    break;
                case 2:
                    int pontos = InputHelper.lerInteiro("Quantos pontos deseja adicionar? ");
                    jogador.aumentarPontuacao(pontos);
                    break;
                case 3:
                    jogador.subirNivel();
                    break;
                case 0:
                    System.out.println("Saindo do sistema.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
}
