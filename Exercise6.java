import java.util.Scanner;

public class Exercise6 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dochód");
        double income = scanner.nextDouble();
        scanner.close();

        double tax= 0;
        if (income <= 85_528) {
           tax = (income * 0.18 - 556.02);
                   System.out.println("Podatek do zapłaty wynosi: " +tax +"zł");
        }
        if (income>=85528) {
            tax = ((income - 85_528) * 0.32 + 14839.82);
            System.out.println("Podatek do zapłaty wynosi: " + (tax < 0 ? 0 : tax) +"zł");
        }

    }
}











//napisac program obliczajacy nalezny podatek dochodowy od osob fizycznych. Program ma pobierac od
//uztkownika dochod i po obliczeniu wypisac na ekranie nalyzny podatek. podatek obliczany jest wg nastepujacych
//regul do 85528 podatek wynosi 18% podstawy minus 556,82
// od 85528 podatek wynosi 14.839.82 + 32% ponad 14.839.82
