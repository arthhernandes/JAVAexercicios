public class Main {
    public static void main(String[] args) {

        double num1 = InputHelper.getInput("Digite um número: ");
        char op = InputHelper.getOp("Digite o operador: ");
        double num2 = InputHelper.getInput("Digite outro número: ");

        switch (op){
            case '+':
                System.out.printf("O resultado de %.2f + %.2f = %.2f", num1, num2, Calculadora.somar(num1, num2));
                break;
            case '-':
                System.out.printf("O resultado de %.2f - %.2f = %.2f", num1, num2, Calculadora.subtrair(num1, num2));
                break;
            case '*':
                System.out.printf("O resultado de %.2f * %.2f = %.2f", num1, num2, Calculadora.multiplicar(num1, num2));
                break;
            case '/':
                System.out.printf("O resultado de %.2f / %.2f = %.2f", num1, num2, Calculadora.dividir(num1, num2));
                break;
            default:
                System.out.println("Inválido");
        }
    }
}