package com.company;

import java.io.File;
import java.io.IOException;

public class Setup {
	public static void InitSetup() throws IOException {
		System.out.println("HELLOOOOOOOOOOOOOOOOOOOOOO");
		String dir, reg_dir, reg_file_dir;
		File Dir, Reg_Dir, Reg_File_Dir;



		dir = "C:\\Users\\" +
				new com.sun.security.
						auth.module.
						NTSystem().
						getName() +
				"\\Documents\\Password-Keychain\\";
		Dir = new File(dir);

		reg_dir = "C:\\Users\\" +
				new com.sun.security.
						auth.module.
						NTSystem().
						getName() +
				"\\Documents\\Password-Keychane\\Register\\";

		System.out.println("IMPORTANT: REGISTER STRING MADE.\n" + reg_dir);
		Reg_Dir = new File(reg_dir);


		reg_file_dir = reg_dir + "Register.reg";
		Reg_File_Dir = new File(reg_file_dir);

		if(Reg_Dir.mkdir())
			System.out.println("Registry Folder Success. ::::        " + reg_file_dir);
		else
			System.out.println("Register Folder Fail");


		if(Dir.mkdirs())
			System.out.println("Folder Success.");
		else
			System.out.println("Folder Fail.");

		if(Reg_Dir.mkdirs())
			System.out.println("Folder Success.");
		else
			System.out.println("Folder Fail.");

		System.out.println("Reg File Success.");
	}
}
