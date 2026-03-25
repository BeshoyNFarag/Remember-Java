/*
Challenge: Email Validator

Task: Write a Java program that validates email addresses based on the following rules:

Validation Rules
The email must contain exactly one @ symbol.
The local part (before @) must:
Start with a letter.
Contain only letters, digits, dots (.), hyphens (-), or underscores (_).
The domain part (after @) must:
Contain at least one dot (.).
Each segment between dots must start with a letter and contain only letters or digits.
The entire email length must be between 5 and 50 characters.
Input
First line: an integer N – the number of email addresses to check.
Next N lines: each line contains an email string.
Output
Print "Valid" if the email satisfies all the rules.
Print "Invalid" if it fails any rule.


4
john.doe@example.com  Valid
1user@domain.com      Invalid
user_name@my-site.com   Valid
user@domain             Invalid
Example Output




*/


import java.util.Scanner;
public class UserNameChecker {
    boolean valid = true;

    public boolean checkDotCount(String email){
        int countDot = 0;

        for(char d : email.toCharArray()){
            if(d == '.'){
                countDot +=1;
            }
        }
        return countDot >= 1;
    }

    public boolean checkAtCount(String email){
        int countAt = 0;
            for(char d : email.toCharArray()){
                if(d == '@'){
                    countAt +=1;
                }
            }

        return countAt == 1;

    }

    public boolean beforeTheAt(String email) {


        int indexOfAt = email.indexOf('@');
        return email.substring(0, 1).matches("[A-Za-z]") &&
                email.substring(0, indexOfAt).matches("[A-Za-z0-9._-]+");

    }

    public boolean afterTheAt(String email) {

        int indexOfAt = email.indexOf('@');
        return email.substring(indexOfAt + 1).matches("[A-Za-z0-9._-]+");

    }

    public boolean emailLength (String email) {

        return email.length() >= 5 && email.length() <= 50;

    }

    public static void main(String[] args) {
        UserNameChecker checker = new UserNameChecker();
        int emailNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of emails you would like to check: ");

        emailNumber = scanner.nextInt();
        scanner.nextLine();

        String[] emails = new String[emailNumber];

        for (int i = 0; i < emailNumber; i++) {
            System.out.print("please enter your email address: ");
            emails[i] = scanner.nextLine();
        }


        for (String email : emails) {
            if(checker.checkDotCount(email) && checker.checkAtCount(email) &&
                    checker.beforeTheAt(email) && checker.afterTheAt(email) &&
                    checker.emailLength(email))  {
                System.out.println(email + " is valid" );
            }
            else
                System.out.println(email + " is not valid");
        }


    }

}





