package com.unitedcodernigar.datetime;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class JodaDateTimeDemo1N {
    public static void main(String[] args) {

        DateTime time = new DateTime();
        System.out.println(time);
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd-hh-mm-ss-SS");
        System.out.println(time.toString(formatter));

        DateTime universalTime = new DateTime(DateTimeZone.UTC);
        System.out.println(universalTime);
        DateTime istanbulTime = new DateTime(DateTimeZone.forID("Europe/Istanbul"));
        System.out.println("The time is "+istanbulTime);
        DateTime kashgar = new DateTime(DateTimeZone.forID("Asia/Kashgar"));
        System.out.println("The time is "+kashgar);

        System.out.println(universalTime.getDayOfMonth());
        System.out.println(universalTime.getDayOfYear());

        DateTime.Property dayName = universalTime.dayOfWeek();
        System.out.println(dayName.getAsText());
        System.out.println(universalTime.plusMonths(2));

        System.out.println("---------------------------2------------------------");

        // get difference
        DateTime beginDateTime = new DateTime("2023-5-25");
        DateTime executionDate = new DateTime();
        Period period = new Period(beginDateTime,executionDate, PeriodType.days());
        System.out.println(period.getDays());






    }
}
