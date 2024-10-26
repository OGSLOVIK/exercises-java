import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Witaj w kalkulatorze");
        System.out.println("Wprowadź pierwszą liczbę: ");
        int input1 = input.nextInt();
        System.out.println("Wprowadź symbol(+ - * /) :");
        int symbol = input.nextInt();
        System.out.println("Wprowadź drugą liczbę: ");
        int input2 = input.nextInt();


        switch(symbol) {
            case '+' :
            int dodwanie = input1 + input2;
            System.out.println("Wynik dodawania wynosi: " + dodwanie);
            break;

            case '-' :
                int odejmowanie = input1 - input2;
                System.out.println("Wynik odejmowania wynosi: " +odejmowanie);
                break;

             case '*' :
             int mnożenie = input1 * input2;
             System.out.println("Wynik mnożenia wynosi: " +mnożenie);
             break;

            case '/' :
                 int dzielenie = input1/input2;
                 System.out.println("Wynik dzielenia wynosi: " +dzielenie);
                 break;
            default:
                System.out.println("Wprowadzono błędny znak");
        }

    }

}