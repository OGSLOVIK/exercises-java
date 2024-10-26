import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Witam w programie");

        boolean running = true;
        System.out.println("Podaj cenę towaru: ");
        double cenaTow = input.nextDouble();
        if (cenaTow <= 100 || cenaTow >= 10000) {
            System.out.println("Podałeś złą cenę towaru: ");
        }

        System.out.println("Podaj ilość rat: ");
        double rat = input.nextDouble();
        if (rat <=6 || rat >= 48) {
            System.out.println("Podałeś złą ilość rat");
        }

        input.close();
        double multiplier;
        if (rat >= 6 && rat <= 12 ){
            multiplier = 0.025;
        } else if (rat > 12 && rat <= 24){
            multiplier = 0.05;
        }else {
            multiplier = 0.1;
        }




        double interest = cenaTow+multiplier;
        double total = interest + cenaTow;
        double rateValue = total/rat ;


        System.out.println("Kwota produktu: " +cenaTow + "zł");
        System.out.println("Liczba rat: " +rat);
        System.out.println("-----------------");
        System.out.println("Odsetki: " + interest);
        System.out.println("Łączny koszt: " +total);
        System.out.println("Wysokość raty " +rateValue);






    }
}
