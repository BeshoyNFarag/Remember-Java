/*
Problem: Calculate Average of Numbers

Task: Write a Java method calculateAverage that takes any number of integer inputs using varargs,
calculates their average, and prints it.

Requirements:

Use varargs (int... numbers).
If no numbers are provided, print "No numbers provided.".
Otherwise, print the average with two decimal places.
*/


import java.util.ArrayList;
import java.util.Scanner;

public class VarArg {
    public double calculateAverage(int ... numbers ){
        double sum = 0;

        for (int number : numbers){
            sum += (double) number;
        }

        return sum / numbers.length;

    }

    public static void main(String[] args) {
        String input;
        VarArg varArg = new VarArg();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while(true){
            System.out.print("enter a number or quit for quitting: ");
            input = scanner.nextLine().toLowerCase();
            if(input.equals("quit")){
                int[] finalArray = new int[numbers.size()];
                for(int i = 0; i < numbers.size(); i++){
                    finalArray[i] = numbers.get(i);
                }
                System.out.println(varArg.calculateAverage(finalArray));
                break;
            }
            else {
                numbers.add(Integer.parseInt(input));
            }
        }


    }
}


