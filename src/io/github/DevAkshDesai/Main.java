package io.github.DevAkshDesai;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int CV;
        File PROJECT_FOLDER;
        String PROJECT_FOLDER_DIR;

        Scanner in = new Scanner(System.in);

        Setup SETUP = new Setup();
        SignIn SIGNIN = new SignIn();
        SignUp SIGNUP = new SignUp();

        PROJECT_FOLDER_DIR = "C:\\Users\\" +
                new com.sun.security.
                        auth.module.
                        NTSystem().
                        getName() +
                "\\Documents\\Password-Keychain\\";

        PROJECT_FOLDER = new File(PROJECT_FOLDER_DIR);

        if(PROJECT_FOLDER.exists()) {
            System.out.println("Enter 1 for Sign In");
            System.out.println("Enter 2 for Sign Up");

            CV = in.nextInt();

            switch(CV) {
                case 1:
                    SIGNIN.sign_in();
                break;
                case 2:
                    SETUP.InitSetup();
                    SIGNUP.makeUser();
                break;
            }
        }
		else {
		    SIGNUP.makeUser();
        }
    }
}