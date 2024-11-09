import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int number1 = scanner.nextInt();
        System.out.println("Podaj drugą liczbę większą od poprzedniej");
        int number2 = scanner.nextInt();
        scanner.close();

        if (number1 >= number2) {
            System.out.println("Warunek a < b nie jest spełniony. Program kończy działanie.");
        }

        // Suma za pomocą pętli while
        int sumaWhile = 0;
        int i = number1;
        while (i <= number2) {
            sumaWhile += i;
            i++;
        }
        System.out.println("Suma za pomocą pętli while: " + sumaWhile);


        int sumaDoWhile = 0;
        i = number1;
        do {
            sumaDoWhile += i;
            i++;
        } while (i <= number2);
        System.out.println("Suma za pomocą pętli do-while: " + sumaDoWhile);

        // Suma za pomocą pętli for
        int sumaFor = 0;
        for (i = number1; i <= number2; i++) {
            sumaFor += i;
        }
        System.out.println("Suma za pomocą pętli for: " + sumaFor);














    }
}
