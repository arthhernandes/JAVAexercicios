public class Pedido {
    private static int proximoId = 1;
    private int id;
    private Pizza pizza;
    private String tamanho;
    private String enderecoEntrega;
    private boolean cancelado;

    public Pedido(Pizza pizza, String tamanho, String enderecoEntrega) {
        this.id = proximoId++;
        this.pizza = pizza;
        this.tamanho = tamanho;
        this.enderecoEntrega = enderecoEntrega;
        this.cancelado = false;
    }

    public int getId() {
        return id;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void cancelar() {
        this.cancelado = true;
    }

    public double getValorTotal() {
        double multiplicador = switch (tamanho.toLowerCase()) {
            case "pequena" -> 0.7;
            case "grande" -> 1.3;
            case "familia" -> 1.6;
            default -> 1.0; // média
        };
        return pizza.getValor() * multiplicador;
    }

    @Override
    public String toString() {
        return "Pedido #" + id +
                "\nPizza: " + pizza.getNome() +
                "\nTamanho: " + tamanho +
                "\nEndereço: " + enderecoEntrega +
                "\nValor: R$" + String.format("%.2f", getValorTotal()) +
                "\nStatus: " + (cancelado ? "CANCELADO" : "Ativo") +
                "\n----------------------";
    }
}
