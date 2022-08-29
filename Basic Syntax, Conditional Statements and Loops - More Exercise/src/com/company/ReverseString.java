package com.company;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      char ch;
      String reversed = "";
      for(int i = 0; i<input.length(); i++){
          ch = input.charAt(i);
          reversed = ch + reversed;
      }
        System.out.println(reversed);
    }
}
