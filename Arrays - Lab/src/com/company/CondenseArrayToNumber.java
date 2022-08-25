package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();
        int counter = Numbers.length;
        while(counter>1){
            for (int i = 0; i < Numbers.length - 1; i++) {
                Numbers[i] = Numbers[i] + Numbers[i+1];
            }
            counter--;
        }
        System.out.println(Numbers[0]);
    }
}
//int[] Numbers = Arrays.stream(scanner.nextLine().split(" "))
//               .mapToInt(e->Integer.parseInt(e))
//               .toArray();
//        int counter = Numbers.length;
//        while(counter>1){
//            for (int i = 0; i < Numbers.length - 1; i++) {
//                Numbers[i] = Numbers[i] + Numbers[i+1];
//            }
//            counter--;
//        }
//        System.out.println(Numbers[0]);