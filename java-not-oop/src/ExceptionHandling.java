import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionHandling {
    public static Scanner scanner = new Scanner(System.in);
    ArrayList<Double> numbers = new ArrayList<>();
    public String input;

    public void squareRoot(){

        try{

            while(true){
                System.out.print("Please enter a number to calculate numbers and write exit to see the results: ");
                input = scanner.nextLine();

                if (input.equalsIgnoreCase("exit")){
                    for (double number : numbers) {
                        System.out.println(Math.sqrt(number));
                    }
                    break;
                }
                if(Double.parseDouble(input) >= 0){
                    numbers.add(Double.parseDouble(input));

                }
                else if (Double.parseDouble(input) < 0){
                    throw new ArithmeticException();
                }
                else
                    throw new NumberFormatException();


            }



        }
        catch (NumberFormatException e){
            System.out.println(e + " Invalid input type cannot be non-double ");
        }

        catch (ArithmeticException e){
            System.out.println(e + " Invalid input type cannot be less than zero ");
        }





    }


    public static void main(String [] args){
        ExceptionHandling ex = new ExceptionHandling();
        ex.squareRoot();

        scanner.close();


    }
}
