package io.github.DevAkshDesai;

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

	Setup() {
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
		DataTime dt = new DataTime();

		PROJECT_FOLDER.mkdir();
		REGISTRY_FOLDER.mkdir();
		REGISTRY_FILE.createNewFile();
		LOG_FOLDER.mkdir();
		LOG_FILE.createNewFile();

		AppendFile(LOG_FILE, dt.getDataTime(true, true) + "\tLog File Created.");
	}

	private static void AppendFile(File file, String data) throws IOException {
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