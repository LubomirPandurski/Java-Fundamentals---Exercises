package com.company;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentBallance = Double.parseDouble(scanner.nextLine());
        double startBallance = currentBallance;
        String game = "";
        while(!game.equals("Game Time")){
            game = scanner.nextLine();
            if(currentBallance==0){
                System.out.println("Out of money!");
                break;
            }
            else if(game.equals("Game Time")){
                double remain = startBallance - currentBallance;
                System.out.printf("Total spent: $%.2f. Remaining: $%.2f", remain, currentBallance);
            }
            else if(game.equals("OutFall 4")){
                if(currentBallance>=39.99){
                    System.out.println("Bought OutFall 4");
                    currentBallance -= 39.99;
                }
                else{
                    System.out.println("Too Expensive");
                }
            }
            else if(game.equals("CS: OG")){
                if(currentBallance>=15.99){
                    System.out.println("Bought CS: OG");
                    currentBallance -= 15.99;
                }
                else{
                    System.out.println("Too Expensive");
                }
            }
            else if(game.equals("Zplinter Zell")){
                if(currentBallance>=19.99){
                    System.out.println("Bought Zplinter Zell");
                    currentBallance -= 19.99;
                }
                else{
                    System.out.println("Too Expensive");
                }
            }
            else if(game.equals("Honored 2")){
                if(currentBallance>=59.99){
                    System.out.println("Bought Honored 2");
                    currentBallance -= 59.99;
                }
                else{
                    System.out.println("Too Expensive");
                }
            }
            else if(game.equals("RoverWatch")){
                if(currentBallance>=29.99){
                    System.out.println("Bought RoverWatch");
                    currentBallance -= 29.99;
                }
                else{
                    System.out.println("Too Expensive");
                }
            }
            else if(game.equals("RoverWatch Origins Edition")){
                if(currentBallance>=39.99){
                    System.out.println("Bought RoverWatch Origins Edition");
                    currentBallance -= 39.99;
                }
                else{
                    System.out.println("Too Expensive");
                }
            }
            else{
                System.out.println("Not Found");
            }
        }
    }
}
