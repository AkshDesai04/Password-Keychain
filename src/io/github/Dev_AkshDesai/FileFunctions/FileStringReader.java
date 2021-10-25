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
		System.out.println("OK U READING");

		int c = 0;
//		String data = ReadFileData(FileName);

		File file = new File(FileName);
		String data = "";
//		String line;

//		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
//
//		}

//		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//			line = br.readLine();
//			line = br.readLine();
//				while ((line = br.readLine()) != null) {
				// process the line.
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}











		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//			while ((data = br.readLine()) != null) {
//				System.out.println("data:\t" + data);
//				System.out.println("data.substring(0, 9):\t" + data.substring(0, 9));
//				if(data.substring(0, 9).equals("user_pass"))
//					break;
//			}

			for(int i = LineNumber;i > 0;i--) {
//				if(br.readLine())
				data = br.readLine();
				System.out.println("I have this " + data);
				System.out.println("OK U LOOPING line 64 FileStringReader");
			}
				//TODO: Get this sorted now😅

		} catch (IOException e) {
			e.printStackTrace();
		}


//		for(int i = 0;i < data.length();i++) {
//			System.out.println("DATA:" + data);
//			if(data.charAt(i) == 0) c++;
//
//			if(c == LineNumber) data = data.substring(c, data.indexOf('\n', c));
//
//			System.out.println("Giving this: " + data);
//			return data;
//		}


//		data = line;


//		data = data.substring(9);

		System.out.println("Giving this: " + data);
		return data;
	}
}
