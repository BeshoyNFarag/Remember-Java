/*
Task: Remove Odd Numbers Using Iterator
Objective

Write a Java program that:

Reads an integer n — the number of elements in a list.
Reads n integers and stores them in an ArrayList<Integer>.
Uses an Iterator to traverse the list.
Removes all odd numbers from the list using the iterator.
Prints the resulting list.
Example Input
6
10 15 23 8 42 17
Expected Output
10 8 42


*/


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class IteratorImplement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int inputSize = 0;
        System.out.print("enter how many elements you want to add: ");
        inputSize = scanner.nextInt();
        scanner.nextLine();



        for(int i = 0; i < inputSize; i++) {
            list.add(scanner.nextInt());
        }

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()) {
            int temp = it.next();
            if(temp % 3 == 0)
                it.remove();


        }

        for(int num : list){
            System.out.print(num + " ");
        }
        scanner.close();




    }
}
