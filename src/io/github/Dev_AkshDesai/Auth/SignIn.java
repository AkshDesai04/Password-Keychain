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

		if(PASS.equals(ReadFileData("C:\\Users\\" +
											new com.sun.security.
											auth.module.
											NTSystem().
											getName() +
											"\\Documents\\" +
											"Password-Keychain\\"
											+ "ProjectFile.pass", 3).substring(10))) {

			PassFunc();
		}

		else	sign_in();
	}
}
