package io.github.Dev_AkshDesai;

import io.github.Dev_AkshDesai.Auth.SignIn;
import io.github.Dev_AkshDesai.Auth.SignUp;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

import static io.github.Dev_AkshDesai.FileFunctions.FileWriter.WriteStrToFile;
import static io.github.Dev_AkshDesai.res.ReturnString.Return;


public class Main {
    public static void main(String[] args) throws IOException {

        WriteStrToFile("C:\\Users\\" +
                        new com.sun.security.
                                auth.module.
                                NTSystem().
                                getName() +
                        "\\Documents\\Test.txt",
                        "HI", true);

        int CV;
        File PROJECT_FOLDER;
        String PROJECT_FOLDER_DIR;

        try (Scanner in = new Scanner(System.in)) {

            PROJECT_FOLDER_DIR = Return("PROJECT_FOLDER_DIR");

            PROJECT_FOLDER = new File(PROJECT_FOLDER_DIR);

            if (PROJECT_FOLDER.exists())            SignIn.sign_in();
            else                                    SignUp.InitSetup();
        }
    }
}