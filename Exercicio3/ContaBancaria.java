import java.util.Scanner;

public class ContaBancaria {

    private String numeroConta;
    private String nomeTitular;
    private double saldo;

    ContaBancaria(String numeroConta, String nomeTitular, double saldo){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public String getNomeTitular(){
        return nomeTitular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void Depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else{
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void Sacar(double valor){
        if (valor > 0 || valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else{
            System.out.println("Saque inválido. Verifique o saldo disponível.");
        }
    }

    public static ContaBancaria criarConta(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta para cadastrar: ");
        String numeroConta = scanner.nextLine();
        System.out.print("Digite o nome do titular para cadastrar: ");
        String nomeTitular = scanner.nextLine();
        System.out.print("Digite o saldo inicial para cadastrar: ");
        double saldoInicial = Double.parseDouble(scanner.nextLine());

        return new ContaBancaria(numeroConta, nomeTitular, saldoInicial);
    }
}
