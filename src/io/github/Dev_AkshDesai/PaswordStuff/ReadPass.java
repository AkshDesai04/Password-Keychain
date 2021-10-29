package io.github.Dev_AkshDesai.PaswordStuff;

import io.github.Dev_AkshDesai.res.ReturnString;

import javax.xml.bind.SchemaOutputResolver;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static io.github.Dev_AkshDesai.FileFunctions.FileStringReader.ReadFileData;
import static io.github.Dev_AkshDesai.res.ReturnString.Return;

public class ReadPass {
	public static String ReadPassword(String U_NAME) throws FileNotFoundException {

		String FILE = "C:\\Users\\" +
						new com.sun.security.
								auth.module.
								NTSystem().
								getName() +
						"\\Documents\\Password-Keychain\\" +
						"ProjectFile.pass";
		File file = new File(FILE);

		String output = "";
		Scanner Reader = new Scanner(file);

		while(!output.equals("U_NAME:" + U_NAME))	output = Reader.nextLine();
		output = Reader.nextLine();
		output = Reader.nextLine();
		output = output.substring(9);

		return output;
	}
}
