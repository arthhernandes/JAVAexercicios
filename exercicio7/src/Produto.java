public class Produto {
    private String nome;
    private String codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, String codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void atualizarPreco(double novoPreco) {
        if (novoPreco >= 0) {
            this.preco = novoPreco;
        }
    }

    public void atualizarQuantidade(int novaQuantidade) {
        if (novaQuantidade >= 0) {
            this.quantidade = novaQuantidade;
        }
    }

    public double getValorTotalEmEstoque() {
        return preco * quantidade;
    }

    public void exibirProduto() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("Valor total em estoque: R$" + getValorTotalEmEstoque());
        System.out.println("-------------------------------------");
    }
}
