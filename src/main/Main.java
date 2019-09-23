package main;

import user.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfEntries = Integer.parseInt(scanner.nextLine());
        if (numberOfEntries == 0) {
            System.out.println("N/A");
        } else {
            User[] users = new User[numberOfEntries];
            for (int i = 0; i < numberOfEntries; i++) {
                String name = scanner.next();
                String companyName = scanner.next();
                int age = Integer.parseInt(scanner.next());
                users[i] = new User(name, companyName, age);
            }


        }


        scanner.close();
    }
}
