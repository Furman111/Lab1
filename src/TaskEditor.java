import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

/**
 * Created by FurmanT on 23.11.2016.
 */
public enum TaskEditor {
    ;

    public static boolean validName(String name) {
        if (!name.isEmpty())
            return true;
        else
            return false;
    }

    public static boolean validDate(String date) {
        try {
            StringTokenizer stringTokenizer = new StringTokenizer(date, ". :\t\n\r");
            int day, month, year, hours, minutes;
            day = Integer.valueOf(stringTokenizer.nextToken());
            month = Integer.valueOf(stringTokenizer.nextToken());
            year = Integer.valueOf(stringTokenizer.nextToken());
            if (year < Calendar.getInstance().get(Calendar.YEAR)) return false;
            if ((month > 12) && (month < 1)) return false;
            if (day < 1) return false;
            switch (month) {
                case 1:
                    if (day > 31) return false;
                    break;
                case 2: {
                    GregorianCalendar yearInstance = new GregorianCalendar();
                    if (yearInstance.isLeapYear(year))
                        if (day > 29) return false;
                    else
                        if (day>28) return false;
                    break;
                }
                case 3:
                    if (day > 31) return false;
                    break;
                case 4:
                    if (day > 30) return false;
                    break;
                case 5:
                    if (day > 31) return false;
                    break;
                case 6:
                    if (day > 30) return false;
                    break;
                case 7:
                    if (day > 31) return false;
                    break;
                case 8:
                    if (day > 31) return false;
                    break;
                case 9:
                    if (day > 30) return false;
                    break;
                case 10:
                    if (day > 31) return false;
                    break;
                case 11:
                    if (day > 30) return false;
                    break;
                case 12:
                    if (day > 31) return false;
                    break;
            }
            hours = Integer.valueOf(stringTokenizer.nextToken());
            if ((hours < 1) || (hours > 23)) return false;
            minutes = Integer.valueOf(stringTokenizer.nextToken());
            if ((minutes < 0) || (minutes > 59)) return false;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean validDscr(String discription) {
        if (!discription.isEmpty())
            return true;
        else
            return false;
    }

    public static Calendar parseStringToCalendar(String date) {
        StringTokenizer stringTokenizer = new StringTokenizer(date, ". :\t\n\r");
        int dd, MM, yyyy, hh, mm;
        dd = Integer.valueOf(stringTokenizer.nextToken());
        MM = Integer.valueOf(stringTokenizer.nextToken());
        yyyy = Integer.valueOf(stringTokenizer.nextToken());
        hh = Integer.valueOf(stringTokenizer.nextToken());
        mm = Integer.valueOf(stringTokenizer.nextToken());
        return new GregorianCalendar(yyyy, MM - 1, dd, hh, mm);
    }

}
