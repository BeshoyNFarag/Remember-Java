

import java.util.ArrayList;
import java.util.Scanner;

public class OneDArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = 0;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Please enter the size of your array: ");
        arraySize = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[arraySize];
        int sum = 0;


        for(int i =0; i < arraySize; i++){
            System.out.print("Enter a number: ");
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }

        for (int i = 0; i < arraySize; i++) {
            sum += array[i];
        }
        System.out.printf("sum = %d%n", sum);

        System.out.print("array in reverse: ");
        for (int i = arraySize -  1; i >= 0; i--) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();

        for (int number: array) {
            list.add(number);
        }
        System.out.println(list.stream().min(Integer::compareTo).get());
        System.out.println(list.stream().max(Integer::compareTo).get());



    }
}
