import java.util.Scanner;

public class inputHelper {
    private  static Scanner scanner = new Scanner(System.in);

    public static String lerTexto(String mensagem){
        System.out.println(mensagem);
        return scanner.nextLine();
    }
    public static int lerInteito(String mensagem){
        while (true){
            try{
                System.out.println(mensagem);
                return Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Por favor, digite um Válido");
            }
        }
    }
}
