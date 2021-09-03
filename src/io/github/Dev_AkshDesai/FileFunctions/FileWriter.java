package io.github.Dev_AkshDesai.FileFunctions;

import java.io.BufferedWriter;
import java.io.File;

public class FileWriter {
	public static void WriteStrToFile(String FileDir, String Data, boolean append) {
		File file = new File(FileDir);

		try {
			BufferedWriter BWAppender = new BufferedWriter(
					new java.io.FileWriter(file, append));
			BWAppender.write(Data);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
