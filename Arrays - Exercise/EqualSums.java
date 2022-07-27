package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();
        int leftSum=0;
        int rightSum =0;
        int equal = 0;
        boolean isEqual = false;
        for (int i = 0; i < Numbers.length; i++) {
             leftSum=0;
             rightSum =0;
            for (int j = 0; j <= i; j++) {
                leftSum += Numbers[j];
            }
            for (int j = Numbers.length-1 ; j >=i ; j--) {
                rightSum+=Numbers[j];
            }
            if(leftSum == rightSum){
                equal = i;
                isEqual=true;
            }
        }
        if(isEqual) {
            System.out.println(equal);
        }
        else if(Numbers.length == 1) {
            System.out.println("0");
        }
        else{
            System.out.println("no");
        }
    }
}
