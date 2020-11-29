// Colin Morris-Moncada
// November 12th 2020
// PI-9
public class Date3 {
    // Private encapsulated variables
    private int year;
    private int month;
    private int day;

    // Accessors
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // Mutators
    public void setDay(int day) {
        if (day < 1 || day > getDaysInMonth()) {
            throw new IllegalArgumentException("Illegal day " + day);
        }
        this.day = day;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Illegal month " + month);
        }
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }


    // Constructor
    public Date3(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    // Initializes a new Date object with the same year/month/day
    // as the given Date object
    public Date3(Date3 other) {
        this(other.year, other.month, other.day);
    }

    // Methods
    public int getDaysInMonth() {
        // runs "in the context" of an object
        if (month == 9 || month == 4 || month == 6 || month == 11) {
            return 30;
        } else if (month == 2) {
            if (isLeapYear()) {
                return 29;
            } else {
                return 28;
            }
        } else {
            return 31;
        }
    }

    public boolean isLeapYear() {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    public int getDaysInYear() {
        if (isLeapYear()) {
            return 366;
        } else {
            return 365;
        }
    }


    public void nextDay() {
        day++;
        if (day > getDaysInMonth()) {
            // case number 2
            month++;
            day = 1;
            if (month > 12) {
                // case number 3
                month = 1;
                year++;
            }
        }
    }

    public int daysBetween(Date3 obj) {

        int count = 0;
        if (before(obj)) {
            Date3 temp = new Date3(this);
            while (temp.year != obj.year || temp.month != obj.month || temp.day != obj.day) {
                temp.nextDay();
                count++;
            }
        } else {
            // this date is >= other date
            Date3 temp = new Date3(obj);
            while (temp.year != year || temp.month != month || temp.day != day) {
                temp.nextDay();
                count++;
            }
        }
        return count;
    }


    public boolean before(Date3 obj) {
        return year < obj.year || (year == obj.year && (month < obj.month || month == obj.month && day < obj.day));
    }
}
