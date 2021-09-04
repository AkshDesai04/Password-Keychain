package io.github.Dev_AkshDesai.res;

public class ReturnString {
	static String TestString;

	public static String Return (String input) {

		String PROJECT_FOLDER_DIR,
				REGISTRY_FOLDER_DIR,
				REGISTRY_FILE_DIR,
				LOG_FOLDER_DIR,
				LOG_FILE_DIR;
		TestString = input;

		PROJECT_FOLDER_DIR = "C:\\Users\\" +
				new com.sun.security.
						auth.module.
						NTSystem().
						getName() +
				"\\Documents\\Password-Keychain\\";
		REGISTRY_FOLDER_DIR = PROJECT_FOLDER_DIR + "Registry\\";
		REGISTRY_FILE_DIR = REGISTRY_FOLDER_DIR + "Registry.txt";
		LOG_FOLDER_DIR = PROJECT_FOLDER_DIR + "Log\\";
		LOG_FILE_DIR = LOG_FOLDER_DIR + "Log.txt";
		String USERS_FOLDER_DIR = PROJECT_FOLDER_DIR + "Users\\";

		if(IsEqual("Project Folder"))   return PROJECT_FOLDER_DIR;
		if(IsEqual("Registry Folder"))  return REGISTRY_FOLDER_DIR;
		if(IsEqual("Registry File"))    return REGISTRY_FILE_DIR;
		if(IsEqual("Log Folder"))       return LOG_FOLDER_DIR;
		if(IsEqual("Log File"))         return LOG_FILE_DIR;
		if(IsEqual("User Folder"))      return USERS_FOLDER_DIR;

		return "";
	}

	public static boolean IsEqual(String test) {return TestString.equals(test);}
}
