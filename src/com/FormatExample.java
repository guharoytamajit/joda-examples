package com;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class FormatExample {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		DateTimeFormatter fmt = DateTimeFormat
				.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSZZ");
		String str = date.toString(fmt);
		// this will print only only date realted data (not time)
		System.out.println(str);

		DateTimeFormatter fmt2 = DateTimeFormat.forPattern("d MMMM, yyyy");
		DateTime dateTime = fmt2.parseDateTime("25 December, 2014");
		System.out.println(dateTime);
	}
}
/*
 * Symbol Meaning Presentation Examples ------ ------- ------------ ------- G
 * era text AD C century of era (>=0) number 20 Y year of era (>=0) year 1996
 * 
 * x weekyear year 1996 w week of weekyear number 27 e day of week number 2 E
 * day of week text Tuesday; Tue
 * 
 * y year year 1996 D day of year number 189 M month of year month July; Jul; 07
 * d day of month number 10
 * 
 * a halfday of day text PM K hour of halfday (0~11) number 0 h clockhour of
 * halfday (1~12) number 12
 * 
 * H hour of day (0~23) number 0 k clockhour of day (1~24) number 24 m minute of
 * hour number 30 s second of minute number 55 S fraction of second number 978
 * 
 * z time zone text Pacific Standard Time; PST Z time zone offset/id zone -0800;
 * -08:00; America/Los_Angeles
 * 
 * ' escape for text delimiter '' single quote literal
 */