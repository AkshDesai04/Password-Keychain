package io.github.DevAkshDesai.Auth;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SignUp {
	public static void makeUser() {
		String USER_NAME, USER_PASS, USER_PASS_C, USER_FOLDER_DIR, USER_FILE_DIR, REG_FILE;

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
					"\\Documents\\Password-Keychain\\Users\\"
					+ USER_NAME + "\\";


			System.out.println("User Folder = " + USER_FOLDER_DIR);
			USER_FOLDER = new File(USER_FOLDER_DIR);
			if (USER_FOLDER.exists()) {
				System.out.println("User Already Exists");
				System.out.println("Please choose a different name.\n\n\n");
				makeUser();
			}
			break;
		}
		if(USER_FOLDER.mkdir()) {System.out.println("Success");}

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

		USER_FILE_DIR = USER_FOLDER_DIR + "\\" + "Pass.pk";

		USER_FILE = new File(USER_FILE_DIR);

		System.out.println("File:- " + USER_FILE);

		try {
//			if(USER_FILE.createNewFile())
			if(USER_FILE.createNewFile()) {
				System.out.println("File Created.");

				appendStrToFile(USER_FILE_DIR, "user_name:" + USER_NAME);
				appendStrToFile(USER_FILE_DIR, "pass:" + USER_PASS);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		REG_FILE = "C:\\Users\\" +
				new com.sun.security.
						auth.module.
						NTSystem().
						getName() +
				"\\Documents\\Password-Keychain\\Register\\Register.reg";
		appendStrToFile(REG_FILE, "user_name: " + USER_NAME);
	}

	public static void appendStrToFile(String fileName, String str) {
		str += "\n";
		try {
			BufferedWriter out = new BufferedWriter
					(new FileWriter(fileName, true));
			out.write(str);
			out.close();
		}
		catch (IOException e) {
			System.out.println("exception occurred" + e);
		}
	}
}
