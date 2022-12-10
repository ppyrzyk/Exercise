package NestedLoops;

import java.util.Scanner;

public class PatternCreator {

    public static void printPattern() {
        System.out.println("how many stars?");
        Scanner scan = new Scanner(System.in);
        int numOfStars = scan.nextInt();

        for (int i = 1; i <= numOfStars; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=numOfStars-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
