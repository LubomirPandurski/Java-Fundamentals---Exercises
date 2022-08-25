package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();
        int[] secondNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();
        boolean equal;
        int sum = 0;
        int diffIndex = 0;
        if(firstNumbers.length != secondNumbers.length){
            equal=false;
        }else{
            equal = true;
            for (int i = 0; i<firstNumbers.length; i++){
                if(firstNumbers [i] != secondNumbers[i]){
                    diffIndex = i;
                    equal = false;
                    break;
                }else{
                    sum+=firstNumbers[i];
                }
            }
        }
        if(equal){
            System.out.println("Arrays are identical. Sum: " + sum);
        }else{
            System.out.printf("Arrays are not identical. Found difference at %d index.", diffIndex);
        }
    }
}
