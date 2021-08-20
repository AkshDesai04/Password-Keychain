package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int cv;
        System.out.println("Enter 1 if u r a new user.");
        System.out.println("Enter 2 if u r a current user.");

        Scanner in = new Scanner(System.in);

        cv = in.nextInt();

        switch(cv) {
            case 1:
                UserCreate();
            break;

            case 2:
                signIn();
            break;

            default:
                System.out.println("Please try again.");
            break;
        }
    }

    private static void signIn() {
    }

    private static void UserCreate() {
    }
}
