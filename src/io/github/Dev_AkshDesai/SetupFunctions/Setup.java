package io.github.Dev_AkshDesai.SetupFunctions;

import java.io.File;
import java.io.IOException;

import io.github.Dev_AkshDesai.Utility.DataTime;
import static io.github.Dev_AkshDesai.res.ReturnString.Return;
import static io.github.Dev_AkshDesai.FileFunctions.FileWriter.WriteStrToFile;


public class Setup {
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
		if(PROJECT_FILE.createNewFile()) {System.out.println("Success.");}
//		if(REGISTRY_FOLDER.mkdir()) {System.out.println("Success");}
//		if(USERS_FOLDER.mkdir()) {System.out.println("Success");}
//		if(LOG_FOLDER.mkdir()) {System.out.println("Success");}
//		if(LOG_FILE.createNewFile()) {System.out.println("Success");}
//		if(REGISTRY_FILE.createNewFile()) {System.out.println("Success");}

//		WriteStrToFile(LOG_FILE_DIR, DataTime.getDataTime(true, true) + "\tLog File Created.", false);
	}
}