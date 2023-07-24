package io.zipcoder.polymorphism;

import java.sql.SQLOutput;
import java.util.Scanner;


public class PetInformation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pets do you have?");
        int numPets = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numPets; i++) {
            System.out.println("Enter the kind of pet " + i);
            String kind = scanner.nextLine();
            System.out.println("Enter the name of pet " + i);
            String name = scanner.nextLine();
            System.out.println("Pet " +i+ " is a "+ kind +" named "+ name+".");
        }
        scanner.close();

    }
}
