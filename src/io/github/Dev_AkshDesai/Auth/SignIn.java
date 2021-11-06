package io.github.Dev_AkshDesai.Auth;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static io.github.Dev_AkshDesai.FileFunctions.FileStringReader.ReadFileData;
import static io.github.Dev_AkshDesai.PaswordStuff.PasswordOperations.PassFunc;

public class SignIn {
	public static void sign_in() throws IOException {
		System.out.println("Enter your password.");
		Scanner in = new Scanner(System.in);

		String PASS;

		PASS = in.nextLine();

		System.out.println("OK U IN");

		System.out.println("SubStringed: " + ReadFileData("C:\\Users\\" +
				System.getProperty("user.name") +
				"\\Documents\\" +
				"Password-Keychain\\"
				+ "ProjectFile.pass", 3));

		System.out.println("\n\n\n\n\nAkshStart");
		System.out.println("SubStringeddddddddddddddddd" + ReadFileData("C:\\Users\\" +
				System.getProperty("user.name") +
				"\\Documents\\" +
				"Password-Keychain\\"
				+ "ProjectFile.pass", 3).substring(10));
		System.out.println("\n\n\n\n\nAkshEnd");

		if(PASS.equals(ReadFileData("C:\\Users\\" +
											System.getProperty("user.name") +
											"\\Documents\\" +
											"Password-Keychain\\"
											+ "ProjectFile.pass", 3).substring(10))) {
			System.out.println("OK U IF");

			PassFunc();
			System.out.println("Good Job Signin");
			PassFunc();
		}

		else {
			System.out.println("OK U ELSE");
			System.out.println("Nope");

			System.out.println(ReadFileData("C:\\Users\\" +
					System.getProperty("user.name") +
					"\\Documents\\" +
					"Password-Keychain\\"
					+ "ProjectFile.pass", 1));

			System.out.println("Wrong Password");
			System.out.println("Please try again.");

			sign_in();

		}
	}
}
