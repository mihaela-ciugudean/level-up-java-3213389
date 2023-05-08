package com.linkedin.javacodechallenges;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class App 
{
    // Create function to calculate the date that's 
    // 100 days from now

    public static LocalDate calculateHundredDaysFromNow(LocalDate today) {
        Period hundredDays = Period.ofDays(100);
        return today.plus(hundredDays);
    }

    public static void main( String[] args )
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE, 100); 
        System.out.println("100 days from now is... " + cal.getTime());

        LocalDate today = LocalDate.now(ZoneId.of("Europe/Paris"));
        System.out.println("100 days from now is... " + calculateHundredDaysFromNow(today));
    }
}
