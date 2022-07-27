package com.company;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] Numbers = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String last = Numbers[0];
            for (int j = 0; j < Numbers.length - 1; j++) {
                Numbers[j] = Numbers[j+1];
            }
            Numbers[Numbers.length -1] = last;
        }
        System.out.print(String.join(" ", Numbers));
    }
}
//String[] Numbers = scanner.nextLine().split(" ");
//        int n = Integer.parseInt(scanner.nextLine());
//        for (int i = 0; i < n; i++) {
//            String last = Numbers[0];
//            for (int j = 0; j < Numbers.length - 1; j++) {
//                Numbers[j] = Numbers[j+1];
//            }
//            Numbers[Numbers.length-1] = last;
//        }
//        System.out.print(String.join(" ", Numbers));