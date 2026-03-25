/*
Here’s a similar challenge, slightly harder than your Loops1 example, focusing on loops,
formatting, and some extra logic:

Task: Multiplication Table with Conditions

Write a Java program that:

Reads an integer n from the user.
Prints the multiplication table for n from 1 to 12.
For multiples that are even, print "EVEN" next to the result.
For multiples that are odd, print "ODD" next to the result.
Input Example
5
Expected Output
5 x 1 = 5 ODD
5 x 2 = 10 EVEN
5 x 3 = 15 ODD
5 x 4 = 20 EVEN
5 x 5 = 25 ODD
5 x 6 = 30 EVEN
5 x 7 = 35 ODD
5 x 8 = 40 EVEN
5 x 9 = 45 ODD
5 x 10 = 50 EVEN
5 x 11 = 55 ODD
5 x 12 = 60 EVEN


*/


import java.util.Scanner;

public class Loops1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        System.out.print("Enter the number to get the multiples of it: ");
        input = scanner.nextInt();
        scanner.nextLine();
        scanner.close();

        for(int i = 0; i <= 12; i++){
            int temp = i*input;
            if (temp  % 2 == 0 ){
                System.out.printf("%02d * %02d = %d is Even%n", input, i,temp );
            }
            else
                System.out.printf("%02d * %02d = %d is ODD%n", input, i,temp );


        }


    }
}
