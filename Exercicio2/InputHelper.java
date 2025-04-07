import java.util.Scanner;

public class InputHelper {

    private static Scanner scanner = new Scanner(System.in);

    public static String getInput(String texto){
        System.out.print(texto);
        return scanner.nextLine();
    }

    public static int getAno(String texto){
        System.out.print(texto);
        int anoInput = Integer.parseInt(scanner.nextLine());
        return Integer.parseInt(scanner.nextLine());
    }
}
