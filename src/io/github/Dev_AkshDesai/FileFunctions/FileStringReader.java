package io.github.Dev_AkshDesai.FileFunctions;

import javax.sound.sampled.Line;
import javax.xml.bind.SchemaOutputResolver;
import java.io.*;
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

		File file = new File(FileName);
		String data = "";

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			for(int i = LineNumber;i > 0;i--)	data = br.readLine();}
		catch (IOException e) {e.printStackTrace();}

		return data;
	}
}
