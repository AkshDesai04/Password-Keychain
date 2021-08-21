package com.company;

import java.io.File;

public class Setup {
	public static void InitSetup() {
		String dir;
		File Dir;



		dir = "C:\\Users\\" +
				new com.sun.security.
						auth.module.
						NTSystem().
						getName() +
				"\\Documents\\Password-Keychane\\";
		Dir = new File(dir);



		if(Dir.mkdirs())
			System.out.println("Folder Success.");
		else
			System.out.println("Folder Fail.");
	}
}
