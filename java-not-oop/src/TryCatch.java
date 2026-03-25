
import java.util.InputMismatchException;
import java.util.Scanner;


public class TryCatch {

    public static String operator;
    public static Scanner scanner = new Scanner(System.in);


    public void divide(){


        try{
            System.out.print("please enter your first number: ");
            double fNum = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Please enter your second number: ");
            double sNum = scanner.nextDouble();
            scanner.nextLine();

            if(sNum == 0){
                throw new ArithmeticException();
            }

            else
                System.out.println(fNum/sNum);
        }
        catch(ArithmeticException e){
            System.out.println(e + " you cannot choose the dinominator as 0");
        }
        catch(InputMismatchException e){
            System.out.println(e + " wrong choice of data type you should enter only numbers");
        }


    }

    public void multiply(){

        try{
            System.out.println("please enter your first number: ");
            double fNum = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Please enter your second number: ");
            double sNum = scanner.nextDouble();
            scanner.nextLine();


                System.out.println(fNum*sNum);
        }

        catch(InputMismatchException e){
            System.out.println(e);
        }


    }

    public void start(){

        System.out.println("please enter your desired operation / for divide and * for multiply: ");
        operator =  scanner.nextLine();
    }


    public static void main(String [] args){
        TryCatch tryCatch = new TryCatch();
        tryCatch.start();
        while(!(operator.equals("/")) && !(operator.equals("*"))){
            System.out.println("wrong operator please try again");
            tryCatch.start();
        }

        if(TryCatch.operator.equals("/")){
            tryCatch.divide();
        }
        else if (TryCatch.operator.equals("*")){
            tryCatch.multiply();
        }

        scanner.close();



    }
}
