import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Witam w programie");

        System.out.println("Podaj 1 liczbę: ");
        int number1 = input.nextInt();

        System.out.println("Podaj 2 liczbę: ");
        int number2 = input.nextInt();

        System.out.println("Podaj 3 liczbę: ");
        int number3 = input.nextInt();

        int max = Math.max(Math.max(number1, number2), number3 );
        int min = Math.min(Math.min(number1, number2), number3);



        System.out.println("Największa liczba to: " +max);
        System.out.println("Najmniejsza liczba to: " +min);








    }
}