package com;

import org.joda.time.DateTime;

public class ModifyDate {
	public static void main(String[] args) {
		// DateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay,
		// int minuteOfHour)
		DateTime dateTime = new DateTime(1999, 12, 25, 16, 30);
		System.out.println(dateTime);
		dateTime.plusDays(7);
		// still prints same date as dateTimeis immutable like string
		System.out.println(dateTime);
		DateTime dateTime2 = dateTime.plusDays(7);
		System.out.println(dateTime2);
		DateTime dateTime3 = dateTime2.minusHours(5);
		System.out.println(dateTime3);
		DateTime dateTime4 = dateTime3.year().setCopy(2012);
		System.out.println(dateTime4);
	}

}
