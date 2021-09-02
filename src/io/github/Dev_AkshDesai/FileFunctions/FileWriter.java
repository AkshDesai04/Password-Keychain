package io.github.Dev_AkshDesai.FileFunctions;

import java.io.BufferedWriter;
import java.io.File;

public class FileWriter {
	public static void AppendFile(File file, String Data) {
		try {
			BufferedWriter BWAppender = new BufferedWriter(
					new java.io.FileWriter(file, true));
			BWAppender.write(Data);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
