package io.github.Dev_AkshDesai.PaswordStuff;

import io.github.Dev_AkshDesai.res.ReturnString;

//import javax.xml.bind.SchemaOutputResolver;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//import com.sun.security.auth.module;

import static io.github.Dev_AkshDesai.FileFunctions.FileStringReader.ReadFileData;
import static io.github.Dev_AkshDesai.res.ReturnString.Return;

public class ReadPass {
	public static String ReadPassword(String U_NAME) throws FileNotFoundException {
//		String output = "";
//
//		//TODO: Make this string to take data from ReturnStrings.java and not make it hardcoded.
//		String data = ReadFileData(	"C:\\Users\\" +
//						new com.sun.security.
//								auth.module.
//								NTSystem().
//								getName() +
//						"\\Documents\\Password-Keychain\\" + "ProjectFile.pass"), temp = "";
//
//		System.out.println("RFD\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
//		System.out.println("data : \n" + data);
//		System.out.println("RFD\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
//
//
//		try {
//			output = data.substring(data.indexOf("S_NAME:" + U_NAME) +
//							("S_NAME:" + U_NAME).length(),
//					data.indexOf("PASSWORD:" + "PASSWORD:".length(),
//							data.indexOf("S_NAME:" + U_NAME)));
//		}
//		catch(Exception e) {
//			System.out.println("Error As : " + e);
//			output += "OOPS";
//		}
//
//
//		System.out.println("output");
//		System.out.println(output);
//		System.out.println("output");
//
//		return output;    //TEMP





		String FILE = "C:\\Users\\" +
						System.getProperty("user.name")	+
						"\\Documents\\Password-Keychain\\" +
						"ProjectFile.pass";
		File file = new File(FILE);


		String output = "";
		Scanner Reader = new Scanner(file);

		while(!output.equals("U_NAME:" + U_NAME))
			output = Reader.nextLine();
		output = Reader.nextLine();
		output = Reader.nextLine();

		output = output.substring(9);


		System.out.println("output:\"" + output + "\"");











		return output; //TEMP
	}
}
