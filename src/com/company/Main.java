package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int cv;
        String folder;
        File f;

        Scanner in = new Scanner(System.in);

        SignUp su = new SignUp();
        Setup sp = new Setup();



        folder = "C:\\Users\\" +
                new com.sun.security.
                        auth.module.
                        NTSystem().
                        getName() +
                "\\Documents\\Password-Keychain\\";

        f = new File(folder);



        if(!f.exists()) {
            System.out.println("Enter 1 if u r a new user.");
            System.out.println("Enter 2 if u r a current user.");

            cv = in.nextInt();

            switch(cv) {
                case 1: su.makeUser(); break;
                default:
                    System.out.println("Please try again.");
                    main(args);
                break;
            }
        }

        else {
            System.out.println("Welcome to password keychain.");
            System.out.println("Lets get you started.");
            sp.InitSetup();
            su.makeUser();
        }
    }
}
