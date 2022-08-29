package com.company;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String input;
        int offSet;
        int letterIndex = 0;
        int mainDigit;
        for(int i =1; i<=n; i++){
            input = scanner.nextLine();
            for(int j=0; j<input.length(); j++){
                char first = input.charAt(0);
                mainDigit = Integer.parseInt(String.valueOf(first));
                if(mainDigit == 8 || mainDigit ==9){
                    offSet = ((mainDigit - 2) * 3) + 1;
                }
                else {
                    offSet = ((mainDigit - 2) * 3);
                }
                letterIndex = (offSet + input.length() - 1);
            }
        }
        letterIndex +=97;
        char ch = (char)letterIndex;
        System.out.print(ch);
    }
}
