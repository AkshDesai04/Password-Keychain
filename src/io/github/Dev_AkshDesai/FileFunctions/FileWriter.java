package io.github.Dev_AkshDesai.FileFunctions;

import java.io.BufferedWriter;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileWriter {
	public static void WriteStrToFile(String FileDir, String Data, boolean append) {
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
		}
	}
}
