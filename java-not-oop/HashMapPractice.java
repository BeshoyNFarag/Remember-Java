/*HashMap Task — Frequency Counter
Task

Given an array of integers:

Count how many times each number appears
Store results in a HashMap

Print results as:

number → count
*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapPractice {


    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    ArrayList<Integer> arrayList = new ArrayList<>();

    public void count(int [] arr){
        for(int num: arr){
            arrayList.add(num);
            map.put(num,0);
        }

        for (int num : arrayList) {
            int value = 0;
            for(int num2: arrayList){
                if(num == num2){
                    value++;
                }
            }
            map.put(num,value);

        }
    }

    public void printMap(){
        System.out.println(map);
    }

    public void printMapFormatted(){
        for (int key: map.keySet() ){
            System.out.printf("For the number %d it was found: %d time%n", key, map.get(key));

        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = 0 ;
        System.out.print("Please enter how many numbers you want to include: ");
        arrSize = scanner.nextInt();
        int [] arr = new int[arrSize];

        HashMapPractice hashMapPractice = new HashMapPractice();

        for(int i =0 ; i < arrSize ; i++){
            System.out.print("Please enter the number you want to include: ");
            arr[i] = scanner.nextInt();
            scanner.nextLine();
        }
        hashMapPractice.count(arr);

        hashMapPractice.printMap();
        hashMapPractice.printMapFormatted();




    }
}
