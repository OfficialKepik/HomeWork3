package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int x = 12, y = 12;
        Scanner scanner = new Scanner(System.in);
        while ((x < -10 | x > 10) & (y < -10 | y > 10)) {
            System.out.println(" Enter X : ");
            x = scanner.nextInt();
            System.out.println(" Enter Y : ");
            y = scanner.nextInt();
            if ((x > 0 & x < 11) & (y > 0 & y < 11)) {
                System.out.println(" Answer : In the 'I' square.");
                break;
            }
            else if ((x > -11 & x < 0) & (y > 0 & y < 11)) {
                System.out.println(" Answer : In the 'II' square.");
                break;
            }
            else if ((x > -11 & x < 0) & (y > -11 & y < 0)) {
                System.out.println(" Answer : In the 'III' square.");
                break;
            }
           else if ((x > 0 & x < 11) & (y > -11 & y < 0)) {
                System.out.println(" Answer : In the 'IV' square.");
                break;
            } else System.out.println(" Error : invalid range.");
        }
    }
}
