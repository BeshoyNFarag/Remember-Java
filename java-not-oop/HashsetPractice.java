/*HashSet Task — Duplicate Removal
Task

Given a list of strings:

Add duplicates
Use a HashSet to:
Remove duplicates
Check if a value exists
Print only unique values
*/

import java.util.HashSet;
import java.util.Scanner;

public class HashsetPractice {
    public static Scanner scanner = new Scanner(System.in);
    HashSet<String> set = new HashSet<>();
    static int arrSize = 0;


    public void createHashSet(String [] arr){
        for(String str : arr){
            set.add(str);
        }
    }
    public void addToSet(String str){
        set.add(str);

    }

    public void remove(String str){
        set.remove(str);
    }

    public void printSet(){
        System.out.println(set);
    }

    public static void main(String[] args) {
        HashsetPractice hp = new HashsetPractice();
        System.out.print("Please enter the size of your array: ");
        arrSize = scanner.nextInt();
        scanner.nextLine();
        String [] arr = new String[arrSize];

        for(int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextLine();
        }


        hp.createHashSet(arr);
        hp.printSet();
        hp.addToSet("a");
        hp.addToSet("b");
        hp.printSet();
        hp.remove("a");
        hp.printSet();





    }


}
