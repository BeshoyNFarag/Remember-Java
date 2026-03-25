import java.util.ArrayList;
import java.util.Scanner;

public class OutputFromatting {

    public static void main(String[] args) {

        int numberTries = 0;
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter how many inputs you will add: ");
        numberTries = scanner.nextInt();

        for(int i = 1; i <= numberTries; i++) {
            names.add(scanner.next());
            grades.add(scanner.nextInt());
            scanner.nextLine();

        }

        for(String name : names) {
            for(Integer grade : grades) {
                System.out.printf("%-15s%03d%n", name, grade);
                break;
            }

        }

    }
}
