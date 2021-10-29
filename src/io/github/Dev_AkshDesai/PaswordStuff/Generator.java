package io.github.Dev_AkshDesai.PaswordStuff;

import java.util.Random;

public class Generator {
	public static String RandomString(
							  int n,
	                          boolean HighAlphaBOOL,
	                          boolean LowAlphaBOOL,
	                          boolean NumbersBOOL,
	                          boolean SpCharBOOL) {
		String HighAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Numbers = "0123456789";
		String LowAlpha = "abcdefghijklmnopqrstuvxyz";
		String SpChar = "!\"#$%&\'()*+,-./:;<=>?@[|]^_`{}~\\";

		StringBuilder sb = new StringBuilder(n);

		//TODO: Add random for all 3 strings
		for (int i = 0; i < n; i++) {
			int index
					= (int) (HighAlpha.length()
					* Math.random());

			sb.append(HighAlpha
					.charAt(index));
		}

		return sb.toString();
	}
}