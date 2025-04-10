public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        int opcao;

        do {
            System.out.println("\n--- Menu da Agenda ---");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Buscar contato por nome");
            System.out.println("3. Remover contato");
            System.out.println("4. Listar todos os contatos");
            System.out.println("0. Sair");
            opcao = InputHelper.lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    String nome = InputHelper.lerTexto("Nome do contato: ");
                    String telefone = InputHelper.lerTexto("Telefone do contato: ");
                    Contato novo = new Contato(nome, telefone);
                    agenda.adicionarContato(novo);
                    break;
                case 2:
                    String busca = InputHelper.lerTexto("Digite o nome para buscar: ");
                    agenda.buscarContato(busca);
                    break;
                case 3:
                    String remover = InputHelper.lerTexto("Digite o nome do contato para remover: ");
                    agenda.removerContato(remover);
                    break;
                case 4:
                    agenda.listarContatos();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
}
