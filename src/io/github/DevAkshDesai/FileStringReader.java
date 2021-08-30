package io.github.DevAkshDesai;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class FileStringReader {
	public static String ReadResourceFile(String request) throws FileNotFoundException {
		String StringResourceDir, key;
		File StringResource;

		AtomicReference<Scanner> scanner = new AtomicReference<>(new Scanner(System.in));

		StringResourceDir = "C:\\Users\\" +
				new com.sun.security.
						auth.module.
						NTSystem().
						getName() +
				"\\Documents\\Password-Keychain\\" +
				"rec\\StringResourceFile.txt";
		key = "";

		StringResource = new File(StringResourceDir);

		scanner.set(new Scanner(StringResource));

		do {
			try {
				key = scanner.get().nextLine();
			}
			catch (Exception e) {
				System.out.println("Key Not Found");
			}
		}
		while(!KeyIs(key, request));

		return "Hello world";
	}

	private static boolean KeyIs(String key, String request) {

		return false;
	}
}
