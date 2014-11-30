package com.nextDay;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;

public class NextDay {

	public static void main(String[] args) {
		DateTime dateTime = new DateTime();
		printJoda(dateTime, "before");
		DateTime startOfNextSunDay = NextDay
				.getStartOfNextThursdayDay(dateTime);
		printJoda(startOfNextSunDay, "after");
	}

	public static void printJoda(DateTime dateTime, String massage) {
		System.out.println("===============" + massage
				+ "================\nDay of month:" + dateTime.getDayOfMonth()
				+ "  Day of week: " + dateTime.getDayOfWeek()
				+ "  Day of year: " + dateTime.getDayOfYear() + "  Month: "
				+ dateTime.getMonthOfYear() + "  Hour: "
				+ dateTime.getHourOfDay() + "  Mins: "
				+ dateTime.getMinuteOfHour()
				+ "\n===============================");

	}

	public static DateTime getStartOfNextSunDay(DateTime dateTime) {
		DateTime nxtsunday = null;
		if (dateTime.getDayOfWeek() == DateTimeConstants.SUNDAY) {
			nxtsunday = dateTime.plusWeeks(1);
		} else {
			nxtsunday = dateTime.withDayOfWeek(DateTimeConstants.SUNDAY);
		}
		nxtsunday = nxtsunday.withTimeAtStartOfDay();
		return nxtsunday;
	}

	public static DateTime getStartOfNextThursdayDay(DateTime dateTime) {
		DateTime nxtThursday = dateTime;
		if (dateTime.getDayOfWeek() >= DateTimeConstants.THURSDAY) {
			nxtThursday = dateTime.plusWeeks(1);
		}
		nxtThursday = nxtThursday.withDayOfWeek(DateTimeConstants.THURSDAY);
		nxtThursday = nxtThursday.withTimeAtStartOfDay();
		return nxtThursday;
	}

}
