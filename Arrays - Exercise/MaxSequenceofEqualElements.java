package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceofEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==arr[i+1]){
                System.out.print(arr[i] + " ");

            }
        }
    }
}
