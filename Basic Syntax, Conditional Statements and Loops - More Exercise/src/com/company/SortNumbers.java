package com.company;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt();
       int b = scanner.nextInt();
       int c = scanner.nextInt();
       if (a>b && a>c && b>c || (b==0 && c==0)){
           System.out.printf("%d%n%d%n%d%n", a,b,c);
       }
       else if (a>b && a>c && c>b){
            System.out.printf("%d%n%d%n%d%n", a,c,b);
        }
       else if (b>a && b>c && a>c || (a==0 && c==0)){
           System.out.printf("%d%n%d%n%d%n", b,a,c);
       }
       else if (b>a && b>c && c>a){
           System.out.printf("%d%n%d%n%d%n", b,c,a);
       }
       else if (c>a && c>b && a>b || (a==0 && b==0)){
           System.out.printf("%d%n%d%n%d%n", c,a,b);
       }
       else if (c>a && c>b && b>a){
           System.out.printf("%d%n%d%n%d%n", c,b,a);
       }
    }
}
