package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfEntries = Integer.parseInt(scanner.nextLine());
        if (numberOfEntries == 0) {
            System.out.println("N/A");
        }


        scanner.close();
    }
}
