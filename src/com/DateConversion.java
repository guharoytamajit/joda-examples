package com;

import java.util.Date;

import org.joda.time.DateTime;

public class DateConversion {
	public static void main(String[] args) {
		/* joda to java date conversion */
		DateTime dateTime = new DateTime(new Date());
		Date dateNew = dateTime.toDate();
		System.out.println(dateNew);

	}
}
