package io.github.DevAkshDesai;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTime {

	public static String getDataTime(boolean date, boolean time) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd|MM|yyyy HH:mm:ss");

		if(date && time)
			formatter = new SimpleDateFormat("dd|MM|yyyy HH:mm:ss");
		else if(date)
			formatter = new SimpleDateFormat("dd|MM|yyyy");
		else if (time)
			formatter = new SimpleDateFormat("HH:mm:ss");

		Date d = new Date();

		return formatter.format(d);
	}
}
