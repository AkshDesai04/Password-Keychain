package io.github.Dev_AkshDesai.FileFunctions;

import javax.sound.sampled.Line;
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

	public static String ReadFileData(String FileName, int LineNumber) throws FileNotFoundException {
		int c = 0;
		String data = ReadFileData(FileName);
		for(int i = 0;i < data.length();i++) {
			if(data.charAt(i) == 0) c++;

			if(c == LineNumber) data = data.substring(c, data.indexOf('\n', c));
			return data;
		}

		return "";
	}
}
