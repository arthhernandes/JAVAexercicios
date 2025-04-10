import java.util.ArrayList;
import java.util.List;

public class PizzariaService {
    private List<Pizza> cardapio;
    private List<Pedido> pedidos;

    public PizzariaService() {
        this.cardapio = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        inicializarCardapio();
    }

    private void inicializarCardapio() {
        cardapio.add(new Pizza("Margherita", 35.00, List.of("Molho de tomate", "Mussarela", "Manjericão")));
        cardapio.add(new Pizza("Calabresa", 40.00, List.of("Molho de tomate", "Mussarela", "Calabresa", "Cebola")));
        cardapio.add(new Pizza("Quatro Queijos", 45.00, List.of("Molho de tomate", "Mussarela", "Provolone", "Gorgonzola", "Parmesão")));
        cardapio.add(new Pizza("Portuguesa", 42.00, List.of("Molho de tomate", "Mussarela", "Presunto", "Ovo", "Cebola", "Azeitona")));
        cardapio.add(new Pizza("Frango com Catupiry", 45.00, List.of("Molho de tomate", "Mussarela", "Frango desfiado", "Catupiry")));
    }

    public void fazerPedido() {
        System.out.println("\n=== Novo Pedido ===");
        verCardapio();

        int pizzaIndex = InputHelper.readInt("Escolha o número da pizza: ") - 1;

        if (pizzaIndex < 0 || pizzaIndex >= cardapio.size()) {
            System.out.println("Opção inválida!");
            return;
        }

        Pizza pizzaEscolhida = cardapio.get(pizzaIndex);
        String tamanho = InputHelper.readString("Digite o tamanho desejado (Pequena/Média/Grande/Família): ");
        String endereco = InputHelper.readString("Digite o endereço de entrega: ");

        Pedido novoPedido = new Pedido(pizzaEscolhida, tamanho, endereco);
        pedidos.add(novoPedido);

        System.out.println("\nPedido realizado com sucesso!");
        System.out.println(novoPedido);
    }

    public void cancelarPedido() {
        System.out.println("\n=== Cancelar Pedido ===");
        if (pedidos.isEmpty()) {
            System.out.println("Não há pedidos cadastrados.");
            return;
        }

        listarPedidos();
        int id = InputHelper.readInt("Digite o ID do pedido a ser cancelado: ");

        for (Pedido pedido : pedidos) {
            if (pedido.getId() == id) {
                pedido.cancelar();
                System.out.println("Pedido #" + id + " cancelado com sucesso.");
                return;
            }
        }

        System.out.println("Pedido não encontrado.");
    }

    public void listarPedidos() {
        System.out.println("\n=== Lista de Pedidos ===");
        if (pedidos.isEmpty()) {
            System.out.println("Não há pedidos cadastrados.");
            return;
        }

        pedidos.forEach(System.out::println);
    }

    public void verCardapio() {
        System.out.println("\n=== Cardápio ===");
        for (int i = 0; i < cardapio.size(); i++) {
            System.out.println((i + 1) + ". " + cardapio.get(i));
            System.out.println("----------------------");
        }
    }

    public void gerarRelatorio() {
        System.out.println("\n=== Relatório de Vendas ===");

        int totalPedidos = pedidos.size();
        int pedidosCancelados = (int) pedidos.stream().filter(Pedido::isCancelado).count();
        int pedidosAtivos = totalPedidos - pedidosCancelados;

        double valorTotal = pedidos.stream()
                .filter(p -> !p.isCancelado())
                .mapToDouble(Pedido::getValorTotal)
                .sum();

        double valorMedio = pedidosAtivos > 0 ? valorTotal / pedidosAtivos : 0;

        System.out.println("Total de pedidos: " + totalPedidos);
        System.out.println("Pedidos ativos: " + pedidosAtivos);
        System.out.println("Pedidos cancelados: " + pedidosCancelados);
        System.out.println("Valor total: R$" + String.format("%.2f", valorTotal));
        System.out.println("Valor médio por pedido: R$" + String.format("%.2f", valorMedio));
    }

    public void adicionarPizzaAoCardapio() {
        System.out.println("\n=== Adicionar Nova Pizza ===");

        String nome = InputHelper.readString("Nome da pizza: ");
        double valor = InputHelper.readDouble("Valor base (Média): ");
        String ingredientesStr = InputHelper.readString("Digite os ingredientes (separados por vírgula): ");

        Pizza novaPizza = new Pizza(nome, valor, List.of(ingredientesStr.split(",")));
        cardapio.add(novaPizza);

        System.out.println("Pizza adicionada ao cardápio com sucesso!");
    }
}