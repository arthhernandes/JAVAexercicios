import java.util.Scanner;

public class InputHelper {
        private static Scanner scanner = new Scanner(System.in);

        public static double getInput(String texto) {
            System.out.print(texto);
            return scanner.nextDouble();
        }

        public static char getOp(String texto) {
            System.out.print(texto);
            return scanner.next().charAt(0);
        }

}
