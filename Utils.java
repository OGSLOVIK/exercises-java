import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    static int input(String message) {
        try {
            System.out.println(message);
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e);
        }
        return 0;
    }
}
