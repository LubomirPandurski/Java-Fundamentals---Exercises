package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e-> Integer.parseInt(e))
                .toArray();
        for (int i = 0; i < Numbers.length; i++) {
            boolean isTop = true;
                for (int j = i+1; j < Numbers.length; j++) {
                    if(Numbers[i]<=Numbers[j]){
                        isTop=false;
                        break;
                    }
                }
                if(isTop) {
                    System.out.print(Numbers[i] + " ");
                }
            }
        }
    }

