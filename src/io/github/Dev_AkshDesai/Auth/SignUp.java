package io.github.Dev_AkshDesai.Auth;

import io.github.Dev_AkshDesai.res.ReturnString;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static io.github.Dev_AkshDesai.res.ReturnString.Return;
import static io.github.Dev_AkshDesai.FileFunctions.FileWriter.WriteStrToFile;

public class SignUp {

	public static void makeUser() {
		String USER_NAME, USER_PASS, USER_PASS_C, USER_FOLDER_DIR, USER_FILE_DIR, REG_FILE_DIR, REG_FOLDER_DIR;

		File USER_FOLDER, USER_FILE, REG_FOLDER;

		Scanner in = new Scanner(System.in);



		REG_FOLDER_DIR = Return("REG_FOLDER_DIR");
		REG_FILE_DIR = Return("REG_FILE_DIR");

		System.out.println("Enter your name.");
		USER_NAME = in.nextLine();

		USER_FOLDER_DIR = Return("USER_FOLDER_DIR")
				+ USER_NAME + "\\";

		System.out.println("User Folder = " + USER_FOLDER_DIR);
		USER_FOLDER = new File(USER_FOLDER_DIR);
		if(USER_FOLDER.getParentFile().mkdirs()) {
			System.out.println("User folder made.");
		}

		if(USER_FOLDER.getParentFile().mkdirs()) {System.out.println("Success");}

		while(true) {
			System.out.println("Enter your new password.");
			USER_PASS = in.nextLine();

			System.out.println("Confirm your new password.");
			USER_PASS_C = in.nextLine();

			if (USER_PASS.equals(USER_PASS_C))
				break;

			System.out.println("The passwords do not match.");
			System.out.println("Please try again.");
		}

		USER_FILE_DIR = USER_FOLDER_DIR +
				USER_NAME + "\\" +
				USER_NAME + ".txt";

		USER_FILE = new File(USER_FILE_DIR);

		System.out.println("User File:- " + USER_FILE);

		REG_FOLDER = new File(REG_FOLDER_DIR);

		if(USER_FOLDER.getParentFile().mkdirs()) {
			System.out.println();
		}
		if(REG_FOLDER.getParentFile().mkdirs()) {
			System.out.println("REG Folder made.");
		}

		try {
			if(USER_FILE.createNewFile()) {
				System.out.println("File Created.");

				WriteStrToFile(USER_FILE_DIR, "user_name:" + USER_NAME, true);
				WriteStrToFile(USER_FILE_DIR, "pass:" + USER_PASS, true);
			}
		} catch (IOException e) {
			System.out.println("Out");
			e.printStackTrace();
			System.out.println("Out");
		}

		WriteStrToFile(REG_FILE_DIR, "user_name: " + USER_NAME, true);
	}
}
