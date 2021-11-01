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
			Data = Data + "\n";

			Files.write(Paths.get(FileDir), Data.getBytes(), StandardOpenOption.APPEND);

			System.out.println("Success!");
			System.out.println("Wrote\t" + Data + "\tto\t" + FileDir);
		}
		catch (Exception e) {
			file.createNewFile();
			try {
				Data = Data + "\n";
				Files.write(Paths.get(FileDir), Data.getBytes(), StandardOpenOption.APPEND);
			}
			catch (Exception E) {
				System.out.println("FilwWritter.java     \t\t\t  \n\nLine 55" + E);
			}
		}

		finally {
			System.out.println("Error line 62 FileWriter.java");
		}
	}
}
