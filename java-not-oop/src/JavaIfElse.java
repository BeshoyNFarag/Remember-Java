/*Here’s a similar challenge to your JavaIfElse example,
but a bit harder and involving multiple conditions for practice:

Task: Grade Categorizer

Write a Java program that:

Reads an integer score (0–100) from the user.
Prints a category based on these rules:
Condition	Output
score < 0 or score > 100	Invalid Score
score < 50	Fail
score >= 50 and score < 65	Pass
score >= 65 and score < 80	Merit
score >= 80 and score <= 100	Distinction*/


import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter you grade: ");
        int input = scanner.nextInt();
        scanner.nextLine();
        scanner.close();

        if(input < 0 || input > 100)
            System.out.println("invalid input");
        else if (input < 50)
            System.out.println("fail");
        else if (input >= 50 && input < 65)
            System.out.println("pass");
        else if (input >= 65 && input < 80)
            System.out.println("good");
        else if(input >= 80 && input <= 100)
            System.out.println("excellent");

    }
}
