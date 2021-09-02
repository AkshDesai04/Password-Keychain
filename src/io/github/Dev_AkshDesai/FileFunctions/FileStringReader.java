package io.github.Dev_AkshDesai.FileFunctions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileStringReader {
	public static String ReadFileData (String FileName) throws FileNotFoundException {
		String out = "";
		File file = new File(FileName);
		Scanner in = new Scanner(file);

		while(in.hasNextLine())
			out += "\n" + in.nextLine();

		return out;
	}
}
