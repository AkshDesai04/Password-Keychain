package io.github.Dev_AkshDesai;

import io.github.Dev_AkshDesai.Auth.SignUp;
import io.github.Dev_AkshDesai.SetupFunctions.Setup;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        int CV;
        File PROJECT_FOLDER;
        String PROJECT_FOLDER_DIR;

        try (Scanner in = new Scanner(System.in)) {

            PROJECT_FOLDER_DIR = "C:\\Users\\" +
                    new com.sun.security.
                            auth.module.
                            NTSystem().
                            getName() +
                    "\\Documents\\Password-Keychain\\";

            PROJECT_FOLDER = new File(PROJECT_FOLDER_DIR);

            if (PROJECT_FOLDER.exists()) {
                System.out.println("Enter 1 for Sign In");
                System.out.println("Enter 2 for Sign Up");

                CV = in.nextInt();

                switch (CV) {
                    case 1:
                        SignIn.sign_in();
                        break;
                    case 2:
                        Setup.InitSetup();
                        SignUp.makeUser();
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + CV);
                }
            } else {
                SignUp.makeUser();
            }
        }
    }
}

