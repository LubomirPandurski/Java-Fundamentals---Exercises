package com.company;

import java.util.Scanner;

public class EnglishNameoftheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        char ch;
        String reverse = "";
        for(int i = 0; i<name.length(); i++){
            ch = name.charAt(i);
            reverse = ch + reverse;
        }
        ch = reverse.charAt(0);
        int digit = Integer.parseInt(String.valueOf(ch));
        if(digit == 1){
            System.out.println("one");
        }
        if(digit == 2){
            System.out.println("two");
        }
        if(digit == 3){
            System.out.println("three");
        }
        if(digit == 4){
            System.out.println("four");
        }
        if(digit == 5){
            System.out.println("five");
        }
        if(digit == 6){
            System.out.println("six");
        }
        if(digit == 7){
            System.out.println("seven");
        }
        if(digit == 8){
            System.out.println("eight");
        }
        if(digit == 9){
            System.out.println("nine");
        }
        if(digit == 0){
            System.out.println("zero");
        }
    }
}
