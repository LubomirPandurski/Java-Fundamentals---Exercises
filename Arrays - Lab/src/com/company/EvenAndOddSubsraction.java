package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubsraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();
        int evensum = 0;
        int oddsum = 0;
        for(int number : numbers){
            if(number%2==0){
                evensum+=number;
            }
            else{
                oddsum+=number;
            }
        }
        int diff = evensum - oddsum;
        System.out.println(diff);
    }
}
