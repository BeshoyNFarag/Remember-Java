/*
1. ArrayList Task — Manual Search & Statistics
Task
Given a list of integers:
Add several numbers (including duplicates)
Find:
The maximum value
How many times a specific number appears
Check if a number exists (without using .contains())
*/


import java.util.ArrayList;


public class PracticeArrayList {
    ArrayList<Integer> numbers = new ArrayList<>();

    public void addNumber(int number) {
        numbers.add(number);
    }

    public int maxNumber(){
        int max = 0;
        for (int number : numbers) {
            if (number >= max) {
                max = number;
            }
        }

        return max;

    }

    public int appearance(int num){
        int arrListSize = numbers.size();
        int count = 0;
        for(int i = 0 ; i < arrListSize ; i++){
            if(numbers.get(i) == num){
                count ++;
            }
        }
        return count;
    }


    public static void main(String[] args) {

        PracticeArrayList practiceArrayList = new PracticeArrayList();
        practiceArrayList.addNumber(1);
        practiceArrayList.addNumber(2);
        practiceArrayList.addNumber(9);
        System.out.println(practiceArrayList.maxNumber());
        practiceArrayList.addNumber(6);
        practiceArrayList.addNumber(9);
        practiceArrayList.addNumber(81);
        practiceArrayList.addNumber(9);
        System.out.println(practiceArrayList.maxNumber());
        System.out.println(practiceArrayList.appearance(9));




    }




}
