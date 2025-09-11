package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        User[] usersList = new User[2];
        int userNumber = 0;

        System.out.println("=== New User Registration ===");
        for (int i = 0; i < usersList.length; i++) {
            System.out.println("Insert your name: ");
            String nameEntered = scan.nextLine();
            System.out.println("Insert your age: ");
            int ageEntered = scan.nextInt();
            scan.nextLine();
            System.out.println("Insert your email: ");
            String emailEntered = scan.nextLine();
            User newUser = new User();
            newUser.name = nameEntered;
            newUser.age = ageEntered;
            newUser.email = emailEntered;
            usersList[userNumber] = newUser;
            userNumber++;
        }
        for (int i = 0; i < usersList.length; i++) {
            usersList[i].printInfo();
        }

    }
}