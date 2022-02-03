package com.company;

import java.util.*;

public class RhombusOfStars {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int starCount = 1; starCount <= n; starCount++) {
            printRow(n, starCount);
        }

        for (int starCount = n - 1; starCount >= 1; starCount--) {
            printRow(n, starCount);
        }
    }

    public static void printRow(int size, int starCount) {
        for (int i = 0; i < size - starCount; i++) {
            System.out.print(" ");
        }
        for (int column = 1; column < starCount; column++) {
            System.out.print("* ");
        }

        System.out.println("*");
    }

}
