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
//
	public static void makeUser() {
		String USER_NAME, USER_PASS, USER_PASS_C, USER_FOLDER_DIR, USER_FILE_DIR, REG_FILE_DIR, REG_FOLDER_DIR;

		File USER_FOLDER, USER_FILE, REG_FOLDER;

		Scanner in = new Scanner(System.in);



		REG_FOLDER_DIR = Return("REG_FOLDER_DIR");
		REG_FILE_DIR = Return("REG_FILE_DIR");

		System.out.println("Enter your name.");
		USER_NAME = in.nextLine();

		USER_FOLDER_DIR = Return("User Folder");

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

//		USER_FILE_DIR = USER_FOLDER_DIR +
//				USER_NAME + ".txt";

		USER_FOLDER_DIR = Return("Project Folder");
		USER_FILE_DIR = Return("Project File");

		System.out.println("User File Dir :- " + USER_FILE_DIR);

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
			USER_FILE.createNewFile();
			System.out.println("File Created.");

//			WriteStrToFile(USER_FILE_DIR, "user_name:" + USER_NAME, true);
//			WriteStrToFile(USER_FILE_DIR, "pass:" + USER_PASS, true);
			WriteStrToFile("C:\\Users\\" +
							System.getProperty("user.name") +
							"\\Documents\\Password-Keychain\\"
							+ "ProjectFile.pass"
					, "user_name:" + USER_NAME, true);

			System.out.println("Error?");

			WriteStrToFile("C:\\Users\\" +
							System.getProperty("user.name") +
							"\\Documents\\Password-Keychain\\"
							+ "ProjectFile.pass"
					, "user_pass:" + USER_PASS, true);
			System.out.println("Error?");

//			WriteStrToFile(USER_FILE_DIR, "pass:" + USER_PASS, true);
		} catch (IOException e) {
			System.out.println("Out");
			e.printStackTrace();
			System.out.println("Out");
		}

//		WriteStrToFile(REG_FILE_DIR, "user_name: " + USER_NAME, true);
		System.out.println("Error?");

	}
//}



//package io.github.Dev_AkshDesai.SetupFunctions;
//
//import java.io.File;
//import java.io.IOException;
//
//import io.github.Dev_AkshDesai.Utility.DataTime;
//import static io.github.Dev_AkshDesai.res.ReturnString.Return;
//import static io.github.Dev_AkshDesai.FileFunctions.FileWriter.WriteStrToFile;
//
//
//public class Setup {
	static File PROJECT_FOLDER,
			PROJECT_FILE,
			REGISTRY_FOLDER,
			REGISTRY_FILE,
			LOG_FOLDER,
			LOG_FILE,
			USERS_FOLDER;
	static String PROJECT_FOLDER_DIR,
			PROJECT_FILE_DIR,
			REGISTRY_FOLDER_DIR,
			REGISTRY_FILE_DIR,
			LOG_FOLDER_DIR,
			LOG_FILE_DIR,
			USERS_FOLDER_DIR;

	public static void InitSetup() throws IOException {


		PROJECT_FOLDER_DIR = Return("PROJECT_FOLDER_DIR");
		PROJECT_FILE_DIR = Return("PROJECT_FILE_DIR");
//		REGISTRY_FOLDER_DIR = Return("REGISTRY_FOLDER_DIR");
//		USERS_FOLDER_DIR = Return("USERS_FOLDER_DIR");
//		REGISTRY_FILE_DIR = Return("REGISTRY_FILE_DIR");
//		LOG_FOLDER_DIR = Return("LOG_FOLDER_DIR");
//		LOG_FILE_DIR = Return("LOG_FILE_DIR");

		PROJECT_FOLDER = new File(PROJECT_FOLDER_DIR);
		PROJECT_FILE = new File(PROJECT_FILE_DIR);
//		REGISTRY_FOLDER = new File(REGISTRY_FOLDER_DIR);
//		REGISTRY_FILE = new File(REGISTRY_FILE_DIR);
//		USERS_FOLDER = new File(USERS_FOLDER_DIR);
//		LOG_FOLDER = new File(LOG_FOLDER_DIR);
//		LOG_FILE = new File(LOG_FILE_DIR);


		if(PROJECT_FOLDER.mkdir()) {System.out.println("Success");}
		if(PROJECT_FILE.createNewFile()) {System.out.println("Success pfile.");}
		else
			System.out.println("OOPS NOT SUCCESSFULL FILE MAKING.");
//		if(REGISTRY_FOLDER.mkdir()) {System.out.println("Success");}
//		if(USERS_FOLDER.mkdir()) {System.out.println("Success");}
//		if(LOG_FOLDER.mkdir()) {System.out.println("Success");}
//		if(LOG_FILE.createNewFile()) {System.out.println("Success");}
//		if(REGISTRY_FILE.createNewFile()) {System.out.println("Success");}

//		WriteStrToFile(LOG_FILE_DIR, DataTime.getDataTime(true, true) + "\tLog File Created.", false);
	}
}