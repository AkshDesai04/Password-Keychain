package io.github.Dev_AkshDesai.FileFunctions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class FileWriter {
	public static void WriteStrToFile(String FileDir, String Data, boolean append) throws IOException {
		File file = new File(FileDir);

		try {
//			BufferedWriter BWAppender = new BufferedWriter(
//					new java.io.FileWriter(file, append));
//			BWAppender.write(Data);

			Data = Data + "\n";

			Files.write(Paths.get(FileDir), Data.getBytes(), StandardOpenOption.APPEND);

			System.out.println("Success!");
			System.out.println("Wrote\t" + Data + "\tto\t" + FileDir);
		} catch (Exception e) {



			System.out.println("OOPS:FILE WRITTER:" + e);

			System.out.println("Create a file?");

			Scanner in = new Scanner(System.in);

			System.out.println("0 for yes.\n1 for no.");

//			int cv = in.nextInt();
			int cv = 0;

			switch(cv) {
				case 0:
					file.createNewFile();

					try {
						Data = Data + "\n";

						Files.write(Paths.get(FileDir), Data.getBytes(), StandardOpenOption.APPEND);

						System.out.println("Success!");
						System.out.println("Wrote\t" + Data + "\tto\t" + FileDir);
					}
					catch (Exception E) {
						System.out.println("FilwWritter.java     \t\t\t  \n\nLine 55" + E);
					}

				break;
			}
		}

		finally {
			System.out.println("Big Oops line 62 FileWritter.java");
		}
	}
}
