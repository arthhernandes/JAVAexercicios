public class Main {
    public static void main(String[] args) {
        PizzariaService pizzariaService = new PizzariaService();

        int opcao;
        do {
            System.out.println("\n=== Sistema da Pizzaria ===");
            System.out.println("1. Fazer novo pedido");
            System.out.println("2. Cancelar pedido");
            System.out.println("3. Listar pedidos");
            System.out.println("4. Ver cardápio");
            System.out.println("5. Relatório de vendas");
            System.out.println("6. Adicionar nova pizza ao cardápio");
            System.out.println("0. Sair");

            opcao = InputHelper.readInt("Escolha uma opção: ");

            switch (opcao) {
                case 1 -> pizzariaService.fazerPedido();
                case 2 -> pizzariaService.cancelarPedido();
                case 3 -> pizzariaService.listarPedidos();
                case 4 -> pizzariaService.verCardapio();
                case 5 -> pizzariaService.gerarRelatorio();
                case 6 -> pizzariaService.adicionarPizzaAoCardapio();
                case 0 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}