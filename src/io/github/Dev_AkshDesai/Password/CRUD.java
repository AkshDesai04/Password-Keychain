package io.github.Dev_AkshDesai.Password;


import java.util.Scanner;

import io.github.Dev_AkshDesai.res.ReturnString;

import static io.github.Dev_AkshDesai.res.ReturnString.Return;
import static io.github.Dev_AkshDesai.FileFunctions.FileWriter.WriteStrToFile;

public class CRUD {
	public static void createPass() {
		String PASSWORD_NAME, PASSWORD_USER_NAME, PASSWORD;
		//String PASSWORD_URL;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the name for the password.");
		PASSWORD_NAME = in.nextLine();
		System.out.println("Enter the user name for the password.");
		PASSWORD_USER_NAME = in.nextLine();
//		System.out.println("Enter the URl for the password(optional).");
//		PASSWORD_URL = in.next();
		System.out.println("Enter the for the password.");
		PASSWORD = in.nextLine();

		WriteStrToFile(Return("User Folder") + Return("User Name\\") + "/*User name here*/",
				true);
	}
}
