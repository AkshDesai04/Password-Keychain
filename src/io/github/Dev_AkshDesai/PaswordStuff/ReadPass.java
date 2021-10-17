package io.github.Dev_AkshDesai.PaswordStuff;

import io.github.Dev_AkshDesai.res.ReturnString;

import java.io.FileNotFoundException;

import static io.github.Dev_AkshDesai.FileFunctions.FileStringReader.ReadFileData;
import static io.github.Dev_AkshDesai.res.ReturnString.Return;

public class ReadPass {
	public static String[] ReadPassword() throws FileNotFoundException {
		String output[] = new String[3];

		String data = ReadFileData(Return("Project File")), temp = "";

		for(int i = 0;i < data.length();i++) {
			temp = data.substring(data.indexOf('\n'), data.indexOf('\n', data.indexOf('\n') + 1));
			if(temp.substring(0, temp.indexOf(':')).equals("U_NAME")) {
				output[0] = temp.substring(temp.indexOf(':'), temp.indexOf('\n'));
				//TODO: ADD OTHER FIELDS IN THE OUTPUT ARRAY
			}
		}

		return new String[]{"Aksh"};    //TEMP
	}
}
