package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SignUp {
	public static void makeUser() {
		String USER_NAME, USER_PASS, USER_PASS_C, USER_FOLDER_DIR;

		File USER_FOLDER, USER_FILE;

		Scanner in = new Scanner(System.in);



		System.out.println("Enter your name.");
		USER_NAME = in.nextLine();

		while(true) {
			USER_FOLDER_DIR = "C:\\Users\\" +
					new com.sun.security.
							auth.module.
							NTSystem().
							getName() +
					"\\Documents\\Password-Keychane\\"
					+ USER_NAME;
			System.out.println("USERFOLDER = " + USER_FOLDER_DIR);
			USER_FOLDER = new File(USER_FOLDER_DIR);
			if (!USER_FOLDER.exists())
				break;
			else {
				System.out.println("User Already Exists");
				System.out.println("Please choose a different name.\n\n\n");
				makeUser();
				break;
			}
		}
		USER_FOLDER.mkdir();

		while(true) {
			System.out.println("Enter your new password.");
			USER_PASS = in.nextLine();

			System.out.println("Confirm your new password.");
			USER_PASS_C = in.nextLine();

			if (USER_PASS.equals(USER_PASS_C)) {
				break;
			}

			System.out.println("The passwords do not match.");
			System.out.println("Please try again.");
		}

		USER_FILE = new File(USER_FOLDER_DIR+ "\\" + "Pass.pk");

		System.out.println(USER_FILE);

		try {
			if(USER_FILE.createNewFile()) {
				System.out.println("File Created.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}