package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int animal = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Dog, 2 - Cat, 3 - Horse\n" +
                "4 - Sparrows, 5 - Crows, 6 - Owl\n" +
                "7 - Duck, 8 - Chicken, 9 - Rooster, 10 - Goose");
        while(animal < 1 || animal > 10) {
            System.out.print("Choose a animal voice : ");
            animal = scanner.nextInt();
            switch (animal) {
                case 1:
                    System.out.println("Dog: woof-woof");
                    break;
                case 2:
                    System.out.println("Cat: meow");
                    break;
                case 3:
                    System.out.println("Horse: neigh-neigh");
                    break;
                case 4:
                    System.out.println("Sparrows: cheep-cheep");
                    break;
                case 5:
                    System.out.println("Crows: caw-caw");
                    break;
                case 6:
                    System.out.println("Owl: hoot-hoot");
                    break;
                case 7:
                    System.out.println("Duck: quack-quack");
                    break;
                case 8:
                    System.out.println("Chicken: cluck-cluck");
                    break;
                case 9:
                    System.out.println("Roosters: cock-a-doodle-doo");
                    break;
                case 10:
                    System.out.println("Goose: hhonk-hhonk");
                    break;
                default:
                    System.out.println("Error : Enter a number of 1 to 10");
            }
        }
    }
}
