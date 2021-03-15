package com.company;
import java.util.Random;
import java.util.Scanner;

public class CWH_20_RockScissorPaperGame {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int tie = 0, You_win = 0, You_Lose = 0, n = 5, invalid_choice = 0;
        System.out.println("Please Enter Your Choice");
        System.out.println("Press '0' for Rock\nPress '1' for Scissor\nPress '2' for Paper");
        while (n > 0) {
            int UserChoice = sc.nextInt();
            int ComputerChoice = r.nextInt(3);
            if (UserChoice == ComputerChoice) {
                System.out.println("This is a TIE\n");
                tie += 1;
            } else if (ComputerChoice == 0 && UserChoice == 1) {
                System.out.println("You Lose\n");
                You_Lose += 1;

            } else if (ComputerChoice == 1 && UserChoice == 0) {
                System.out.println("You Win\n");
                You_win += 1;
            } else if (ComputerChoice == 0 && UserChoice == 2) {
                System.out.println("You Win\n");
                You_win += 1;
            } else if (ComputerChoice == 2 && UserChoice == 0) {
                System.out.println("You Lose\n");
                You_Lose += 1;
            } else if (ComputerChoice == 1 && UserChoice == 2) {
                System.out.println("You Lose\n");
                You_Lose += 1;
            } else if (ComputerChoice == 2 && UserChoice == 1) {
                System.out.println("You Win\n");
                You_win += 1;

            } else {
                invalid_choice+=1;
                System.out.println("Invalid Choice");
                if (invalid_choice >=2){
                    System.out.println("You Choose Invalid option "+ invalid_choice+"times");
                    break;
                }
            }
            n-=1;

        }
        System.out.println("You Win " + You_win + " times");
        System.out.println("You Lose " + You_Lose + " times");
        System.out.println("Tie " + tie +" times");
    }



}


