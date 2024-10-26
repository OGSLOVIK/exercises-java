import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Witam w konwerterze temperatury");
        System.out.println("Podaj temperaturę w *C : ");
        float value = userInput.nextFloat();
        double Fahrenheit = 1.8;

        double wynik = (Fahrenheit * value + 32.0 );

        System.out.println("Temperature w Fahrenheit to : " +wynik);

    }
}
