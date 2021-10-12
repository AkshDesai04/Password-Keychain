package io.github.Dev_AkshDesai.PaswordStuff;

import java.util.Scanner;

import static io.github.Dev_AkshDesai.FileFunctions.FileWriter.WriteStrToFile;
import static io.github.Dev_AkshDesai.Utility.DataTime.getDataTime;
import static io.github.Dev_AkshDesai.res.ReturnString.Return;

public class WritePass {
	void AddPassWord() {
		String U_NAME, S_NAME, PASS, C_PASS;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the user name for the new password.");
		U_NAME = in.nextLine();
		System.out.println("Enter the site name for the new password.");
		S_NAME = in.nextLine();
		System.out.println("Enter the new password.");
		PASS = in.nextLine();
		System.out.println("Confirm the new password.");
		C_PASS = in.nextLine();

		while(!PASS.equals(C_PASS)) {
			System.out.println("The passwords do not match.\nPlease try again.");

			System.out.println("Enter the new password.");
			PASS = in.nextLine();
			System.out.println("Confirm the new password.");
			C_PASS = in.nextLine();
		}

		String DATA = "---DATA---\n" +
				getDataTime(true, true) + "\n" +
				"U_NAME:" + U_NAME + "\n" +
				"S_NAMW:" + S_NAME + "\n" +
				"PASSWORD:" + PASS + "\n" +
				"---DATA---" + "\n\n";


		WriteStrToFile(Return("Project File"), DATA, true);
	}
}
