package dateorganizer;

/**
* A testbed for a binary heap implementation of a priority queue using various comparators to sort Gregorian dates
* Course: CS3102.01
* @author Duncan, Chloe Chin
* @see Date, PQueueAPI, PQueue
* <pre>
* Date: 09/25/23
* Course: CSC 3102
* File: DateOrganizer.java
* Programming Project #: 1
* Instructor: Dr. Duncan
* </pre>
*/

 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;



public class DateOrganizer {
	
	public static int getDayNum(Date d) {
        int output = -1;
        switch (d.getDay()) {
            case 0: // Sunday
                output = 0;
                break;
            case 1: // Monday
                output = 1;
                break;
            case 2: // Tuesday
                output = 2;
                break;
            case 3: // Wednesday
                output = 3;
                break;
            case 4: // Thursday
                output = 4;
                break;
            case 5: // Friday
                output = 5;
                break;
            case 6: // Saturday
                output = 6;
                break;
        }
        return output;
    }
    
    

	public static void main(String[] args) throws IOException, ParseException, PQueueException {
        if (args.length != 2) {
            System.out.println("Invalid number of command line arguments");
            System.out.println("Usage: DateOrganizer <date-file-name> <sort-code>");
            System.exit(1);
        }

        String fileName = args[0];
        int sortCode = Integer.parseInt(args[1]);

        Comparator<Date> comparator = getComparator(sortCode);
        PQueue<Date> dateQueue = new PQueue<>(comparator);

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Date date = parseDate(line);
                if (date != null) {
                    dateQueue.insert(date);
                }
            }
        }

        SimpleDateFormat dateFormat = getDateFormat(sortCode);

        while (!dateQueue.isEmpty()) {
            Date date = dateQueue.remove();
            String formattedDate = dateFormat.format(date);
            System.out.println(formattedDate);
        }
    }

    private static Date parseDate(String dateStr) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return dateFormat.parse(dateStr);
    }
    

    private static Comparator<Date> getComparator(int sortCode) {
        switch (sortCode) {
        case -2:
        	System.out.println("Dates from BundesHolidays.txt in -month -day -year Order\n");
            return (date1, date2) -> {
                int result = Integer.compare(date2.getMonth(), date1.getMonth());
                if (result == 0) {
                    result = Integer.compare(date2.getDay(), date1.getDay());
                    if (result == 0) {
                        result = Integer.compare(date2.getYear(), date1.getYear());
                    }
                }
                return result;
            };
            case -1:
            	System.out.println("Dates from BundesHolidays.txt in -year -month -day Order\n");
            	return (date1, date2) -> {
                    int result = Integer.compare(date2.getYear(), date1.getYear());
                    if (result == 0) {
                        result = Integer.compare(date2.getMonth(), date1.getMonth());
                        if (result == 0) {
                            result = Integer.compare(date2.getDay(), date1.getDay());
                        }
                    }
                    return result;
                };
            case 0:
            	System.out.println("Dates from BundesHolidays.txt in +weekDayNumber +monthName +day +year Order\n");
                return (date1, date2) -> {
                    int result = Integer.compare(getDayNum(date1), getDayNum(date2));
                    if (result == 0){
                        result = Integer.compare(date1.getMonth(), date2.getMonth());
                        if (result == 0) {
                            result = Integer.compare(date1.getDay(), date2.getDay());
                            if (result == 0) {
                                result = Integer.compare(date1.getYear(), date2.getYear());
                            }
                        }
                    }
                    return result;
                  };
            case 1:
            	System.out.println("Dates from BundesHolidays.txt in +year +month +day Order\n");
            	return (date1, date2) -> {
                    int result = Integer.compare(date1.getYear(), date2.getYear());
                    if (result == 0) {
                        result = Integer.compare(date1.getMonth(), date2.getMonth());
                        if (result == 0) {
                            result = Integer.compare(date1.getDay(), date2.getDay());
                        }
                    }
                    return result;
                };
            case 2:
            	System.out.println("Dates from BundesHoliday.txt in +month +day +year Order\n");
            	return (date1, date2) -> {
                    int result = Integer.compare(date1.getMonth(), date2.getMonth());
                    if (result == 0) {
                        result = Integer.compare(date1.getDay(), date2.getDay());
                        if (result == 0) {
                            result = Integer.compare(date1.getYear(), date2.getYear());
                        }
                    }
                    return result;
                };
            default:
                throw new IllegalArgumentException("Invalid sort code");
        }
    }

    private static SimpleDateFormat getDateFormat(int sortCode) {
        switch (sortCode) {
            case -2:
            	return new SimpleDateFormat("EEEE, MMMM dd, yyyy");
            case -1:
                return new SimpleDateFormat("EEEE, MMMM dd, yyyy");
            case 0:
                return new SimpleDateFormat("EEEE, MMMM dd, yyyy");
            case 1:
                return new SimpleDateFormat("EEEE, MMMM dd, yyyy");
            case 2:
                return new SimpleDateFormat("EEEE, MMMM dd, yyyy");
            default:
                throw new IllegalArgumentException("Invalid sort code");
        }
    }
}