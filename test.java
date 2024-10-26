import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Witam w programie");

        Scanner scaner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");

        int inputNumber = scaner.nextInt();
        scaner.close();

        // Sprawdź czy liczba jest parzysta czy nieparzysta
        if (inputNumber % 2 == 0) {
            System.out.println("Podana liczba to:" +inputNumber + " i jest parzysta");
            } else {
            System.out.println("Podana liczba to:" +inputNumber + " i jest nieparzysta");
        }
    }
}