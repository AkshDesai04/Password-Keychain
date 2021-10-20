package io.github.Dev_AkshDesai.res;

public class ReturnString {
	static String TestString;

	public static String Return (String input) {

		String PROJECT_FOLDER_DIR,
				PROJECT_FILE_DIR;
//				REGISTRY_FOLDER_DIR,
//				REGISTRY_FILE_DIR,
//				LOG_FOLDER_DIR,
//				LOG_FILE_DIR,
//				USER_FOLDER_DIR,
//				USER_FILE_DIR;
		TestString = input;

//		PROJECT_FOLDER_DIR = "C:\\Users\\"
//				new com.sun.security.
//						auth.module.
//						NTSystem().
//						getName() +
//				"\\Documents\\Password-Keychain\\";

				PROJECT_FOLDER_DIR = "D:\\AkshTestPass\\";

		PROJECT_FILE_DIR = PROJECT_FOLDER_DIR + "ProjectFile.pass";

		if(IsEqual("Project Folder"))   return PROJECT_FOLDER_DIR;
		if(IsEqual("User Folder"))   return PROJECT_FOLDER_DIR;
		if(IsEqual("Project File"))   return PROJECT_FILE_DIR;

		return "";
	}

	public static boolean IsEqual(String TestString) {return TestString.equals(TestString);}
}
