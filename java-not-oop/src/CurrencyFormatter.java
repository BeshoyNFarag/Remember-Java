
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(amount);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount);
        System.out.println(us);
        System.out.println(france);

        System.out.println("please enter the percentage: ");
        float percentage = scanner.nextFloat();
        scanner.nextLine();

        String usPercentage = NumberFormat.getPercentInstance().format(percentage);
        String francePercentage = NumberFormat.getPercentInstance().format(percentage);

        System.out.println(usPercentage);
        System.out.println(francePercentage);



    }
}
