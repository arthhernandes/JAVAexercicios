import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> estoque = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n--- MENU DO ESTOQUE ---");
            System.out.println("1. Adicionar novo produto");
            System.out.println("2. Atualizar produto");
            System.out.println("3. Remover produto");
            System.out.println("4. Gerar relatório de estoque");
            System.out.println("0. Sair");
            opcao = InputHelper.lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    String nome = InputHelper.lerTexto("Nome do produto: ");
                    String codigo = InputHelper.lerTexto("Código do produto: ");
                    double preco = InputHelper.lerDouble("Preço: R$");
                    int quantidade = InputHelper.lerInteiro("Quantidade: ");
                    Produto novo = new Produto(nome, codigo, preco, quantidade);
                    estoque.add(novo);
                    System.out.println("Produto adicionado com sucesso.");
                    break;
                case 2:
                    String codigoBusca = InputHelper.lerTexto("Digite o código do produto para atualizar: ");
                    Produto encontrado = buscarProdutoPorCodigo(estoque, codigoBusca);
                    if (encontrado != null) {
                        double novoPreco = InputHelper.lerDouble("Novo preço: R$");
                        int novaQtd = InputHelper.lerInteiro("Nova quantidade: ");
                        encontrado.atualizarPreco(novoPreco);
                        encontrado.atualizarQuantidade(novaQtd);
                        System.out.println("Produto atualizado com sucesso.");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 3:
                    String codRemover = InputHelper.lerTexto("Digite o código do produto para remover: ");
                    Produto remover = buscarProdutoPorCodigo(estoque, codRemover);
                    if (remover != null) {
                        estoque.remove(remover);
                        System.out.println("Produto removido com sucesso.");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("\n=== RELATÓRIO DE ESTOQUE ===");
                    double valorTotal = 0;
                    for (Produto p : estoque) {
                        p.exibirProduto();
                        valorTotal += p.getValorTotalEmEstoque();
                    }
                    System.out.println("Valor total em estoque: R$" + valorTotal);
                    break;
                case 0:
                    System.out.println("Encerrando o sistema.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    public static Produto buscarProdutoPorCodigo(ArrayList<Produto> lista, String codigo) {
        for (Produto p : lista) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }
}
