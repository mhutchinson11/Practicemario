package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Mario = new Scanner(System.in);
        int height;
        do {
            System.out.println("Enter a number between 1 and 8");
            while (!Mario.hasNextInt()) {
                System.out.println("Invalid response, input a number between 1 and 8");
                Mario.next();
            }
            height = Mario.nextInt();
        }
        while (height <= 1 || height > 9);
        System.out.println("Height:" + height);
        System.out.println("Height:" + height);

        for (int row = 0; row < height; row++) {
            {
                System.out.print(" ");


                    for (int col = 0; col <= row; col++) {
                        System.out.print("");

                    }
                    for (int hash = 0; hash <= row; hash++) {
                        System.out.print("#");
                    }
                    System.out.println(" ");
                }
            }
        }
     }