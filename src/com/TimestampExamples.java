package com;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class TimestampExamples {
	public static void main(String[] args) {
		// get current moment in default time zone
		DateTime dt = new DateTime();
		System.out.println(dt);
		// translate to London local time
		System.out.println(DateTimeZone.forID("Europe/London"));
		DateTime dtLondon = dt.withZone(DateTimeZone.forID("Europe/London"));

		System.out.println(dtLondon);
	}
}
