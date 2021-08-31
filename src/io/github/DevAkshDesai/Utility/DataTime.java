package io.github.DevAkshDesai.Utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTime {
	public static String getDataTime(boolean date, boolean time) {
		String FORMATTED_OUTPUT;
		SimpleDateFormat formatter = new SimpleDateFormat("dd|MM|yyyy HH:mm:ss");

		if(date && time)
			formatter = new SimpleDateFormat("dd|MM|yyyy HH:mm:ss");
		else if(date)
			formatter = new SimpleDateFormat("dd|MM|yyyy");
		else if (time)
			formatter = new SimpleDateFormat("HH:mm:ss");

		Date d = new Date();

		FORMATTED_OUTPUT = formatter.format(d);
		return FORMATTED_OUTPUT;
	}
}
