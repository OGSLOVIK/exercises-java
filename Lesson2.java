import java.util.Scanner;
public class Lesson2 {

        public static void main(String[] args) {
            System.out.println("Witam w programie");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę");
            int number = scanner.nextInt();

            final int CONDITION_NUMBER = 15;

            System.out.println("Podana liczba to: " +number );

            if (number < CONDITION_NUMBER) {
                System.out.println("Podana liczba jest mniejsza od " +CONDITION_NUMBER);
            } else if (number == CONDITION_NUMBER){
                System.out.println("Podana liczba jest równa " +CONDITION_NUMBER);}

                else {
                    System.out.println("Podana liczba jest większa od " +CONDITION_NUMBER);}





    }
}
