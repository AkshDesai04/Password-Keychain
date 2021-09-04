package io.github.Dev_AkshDesai.SetupFunctions;

import java.io.File;
import java.io.IOException;

import io.github.Dev_AkshDesai.Utility.DataTime;
import static io.github.Dev_AkshDesai.FileFunctions.FileWriter.WriteStrToFile;


public class Setup {
	static File PROJECT_FOLDER,
			REGISTRY_FOLDER,
			REGISTRY_FILE,
			LOG_FOLDER,
			LOG_FILE,
			USERS_FOLDER;
	static String PROJECT_FOLDER_DIR,
			REGISTRY_FOLDER_DIR,
			REGISTRY_FILE_DIR,
			LOG_FOLDER_DIR,
			LOG_FILE_DIR,
			USERS_FOLDER_DIR;

	public Setup() {
		PROJECT_FOLDER_DIR = "C:\\Users\\" +
				new com.sun.security.
						auth.module.
						NTSystem().
						getName() +
				"\\Documents\\Password-Keychain\\";
		REGISTRY_FOLDER_DIR = PROJECT_FOLDER_DIR +
				"Register\\";
		USERS_FOLDER_DIR = PROJECT_FOLDER_DIR + "Users\\";
		REGISTRY_FILE_DIR = REGISTRY_FOLDER_DIR + "Registry.reg";
		LOG_FOLDER_DIR = PROJECT_FOLDER_DIR + "Log\\";
		LOG_FILE_DIR = LOG_FOLDER_DIR + "Log.log";

		PROJECT_FOLDER = new File(PROJECT_FOLDER_DIR);
		REGISTRY_FOLDER = new File(REGISTRY_FOLDER_DIR);
		REGISTRY_FILE = new File(REGISTRY_FILE_DIR);
		USERS_FOLDER = new File(USERS_FOLDER_DIR);
	}


	public static void InitSetup() throws IOException {
		if(PROJECT_FOLDER.mkdir()) {System.out.println("Success");}
		if(REGISTRY_FOLDER.mkdir()) {System.out.println("Success");}
		if(USERS_FOLDER.mkdir()) {System.out.println("Success");}
		if(LOG_FOLDER.mkdir()) {System.out.println("Success");}
		if(LOG_FILE.createNewFile()) {System.out.println("Success");}
		if(REGISTRY_FILE.createNewFile()) {System.out.println("Success");}

		WriteStrToFile(LOG_FILE_DIR, DataTime.getDataTime(true, true) + "\tLog File Created.", false);
	}
}