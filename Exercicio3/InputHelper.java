import java.util.ArrayList;
import java.util.Scanner;

public class InputHelper {

    private static Scanner scanner = new Scanner(System.in);

    public static int getOp(String texto){
        System.out.print(texto);
        int op = Integer.parseInt(scanner.nextLine());
        if (op < 0 && op > 4){
            System.out.print("1- Depósito");
            System.out.print("2- Saque");
            System.out.print("3- Ver saldo");
            System.out.print("4- Sair");
            System.out.print("Operação inválida! Digite novamente: ");
            int op1 = Integer.parseInt(scanner.nextLine());
            op = op1;
        }
        return op;
    }

    public static ContaBancaria getConta(String texto, ArrayList<ContaBancaria> usuarios) {
        System.out.print(texto);
        String numeroConta = scanner.nextLine();
        for (ContaBancaria conta : usuarios){
            if (conta.getNumeroConta().equals(numeroConta)){
                return conta;
            }
        }
        System.out.println("Conta não encontrada.");
        return null;
    }

    public static double getValor(String texto){
        System.out.print(texto);
        return Double.parseDouble(scanner.nextLine());
    }


}
