package com.company;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagonCount = Integer.parseInt(scanner.nextLine());
        int[] passangers = new int[wagonCount];
        int total = 0;
        for (int i = 0; i < passangers.length; i++) {
            passangers[i] = Integer.parseInt(scanner.nextLine());
            total +=passangers[i];
        }
        for (int i = 0; i < passangers.length; i++) {
            System.out.print(passangers[i] + " ");
        }
        System.out.println();
        System.out.println(total);
    }
}
