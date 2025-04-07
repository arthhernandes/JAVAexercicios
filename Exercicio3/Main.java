import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<ContaBancaria> usuarios = new ArrayList<>();

        boolean continuar = true;
        String cadastrarMais;

        do {
            Scanner scanner = new Scanner(System.in);
            usuarios.add(ContaBancaria.criarConta());
            System.out.print("Deseja cadastrar mais contas? S ou N ");
            cadastrarMais = scanner.nextLine();
        }while (cadastrarMais.equalsIgnoreCase("S"));

        while (continuar){

            ContaBancaria conta = InputHelper.getConta("\nDigite a conta bancária que deseja acessar as informações: ", usuarios);

            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Sair");
            int opcao = InputHelper.getOp("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    double valorDeposito = InputHelper.getValor("\nDigite o valor a ser depositado: ");
                    conta.Depositar(valorDeposito);
                    System.out.println("\nSaldo atual: R$ " + conta.getSaldo());
                    break;
                case 2:
                    double valorSaque = InputHelper.getValor("\nDigite o valor a ser sacado: ");
                    conta.Sacar(valorSaque);
                    System.out.println("\nSaldo atual: R$ " + conta.getSaldo());
                    break;
                case 3:
                    System.out.println("\nSaldo atual: R$ " + conta.getSaldo());
                    break;
                case 4:
                    continuar = false;
                    System.out.println("\nSaindo do sistema bancário. Até mais!");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        }
    }
}