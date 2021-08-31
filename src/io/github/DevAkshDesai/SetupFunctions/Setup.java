package io.github.DevAkshDesai.SetupFunctions;

import io.github.DevAkshDesai.Utility.DataTime;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Setup {
	static File PROJECT_FOLDER,
			REGISTRY_FOLDER,
			REGISTRY_FILE,
			LOG_FOLDER,
			LOG_FILE;
	static String PROJECT_FOLDER_DIR,
			REGISTRY_FOLDER_DIR,
			REGISTRY_FILE_DIR,
			LOG_FOLDER_DIR,
			LOG_FILE_DIR;

	public Setup() {
		PROJECT_FOLDER_DIR = "C:\\Users\\" +
				new com.sun.security.
						auth.module.
						NTSystem().
						getName() +
				"\\Documents\\Password-Keychain\\";
		REGISTRY_FOLDER_DIR = PROJECT_FOLDER_DIR +
				"Registry\\";
		REGISTRY_FILE_DIR = REGISTRY_FOLDER_DIR + "Registry.reg";
		LOG_FOLDER_DIR = PROJECT_FOLDER_DIR + "Log\\";
		LOG_FILE_DIR = LOG_FOLDER_DIR + "Log.log";

		PROJECT_FOLDER = new File(PROJECT_FOLDER_DIR);
		REGISTRY_FOLDER = new File(REGISTRY_FOLDER_DIR);
		REGISTRY_FILE = new File(REGISTRY_FILE_DIR);
	}


	public static void InitSetup() throws IOException {
		if(PROJECT_FOLDER.mkdir()) {System.out.println("Success");}
		if(REGISTRY_FOLDER.mkdir()) {System.out.println("Success");}
		if(REGISTRY_FILE.createNewFile()) {System.out.println("Success");}
		if(LOG_FOLDER.mkdir()) {System.out.println("Success");}
		if(LOG_FILE.createNewFile()) {System.out.println("Success");}

		AppendFile(LOG_FILE, DataTime.getDataTime(true, true) + "\tLog File Created.");
	}

	private static void AppendFile(File file, String data) {
		try {
			BufferedWriter BWAppender = new BufferedWriter(
					new FileWriter(file, true));
			BWAppender.write(data);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}