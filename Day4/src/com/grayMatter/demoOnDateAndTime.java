package com.grayMatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class demoOnDateAndTime {

    public static void main(String[] args) throws ParseException {
        // Proper way to use SimpleDateFormat to parse a date string
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.US);
        String myDate = "18-JUL-2024";

        // Parsing the date string to Date object
        Date date = sdf.parse(myDate);
        System.out.println(date);

        // Using LocalDate to get the current date
//        LocalDate = LocalDate.now();
//        System.out.println(localDate);

        // Creating a specific date using LocalDate
//        localDate = LocalDate.of(2024, 7, 18);
//        System.out.println(localDate);

        // Using DateTimeFormatter to parse the date string to LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy", Locale.US);
//        localDate = LocalDate.parse(myDate, formatter);
//        System.out.println(localDate);

        // Using LocalTime to get the current time
//        LocalTime time = LocalTime.now();
//        System.out.println(time);
        
        LocalTime  time1 = LocalTime.now();
        
        System.out.println(time1);
        
        System.out.println(date.getDay());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        
        
        String myJoining = "2022-03-22";
        LocalDate doj = LocalDate.parse(myJoining);
        String myLeaving= "2024-07-18";
        LocalDate dol = LocalDate.parse(myLeaving);
        
        Period p = Period.between(doj, dol);
        
        System.out.println(p);
        System.out.println("Total period of time worked "+p.getYears()+" years "+ p.getMonths()+" months "+ p.getDays()+ " days");
        
        
        
        
        
        
        
        
        
        
    }
}
