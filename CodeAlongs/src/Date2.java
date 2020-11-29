// Colin Morris-Moncada
// November 12th 2020
// PI-9
public class Date2 {
    // fields
    int year;
    int month;
    int day;

    public Date2(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date2(Date2 other) {
        this(other.year, other.month, other.day);
    }

    // methods
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

    public int daysBetween(Date2 obj) {

        int count = 0;
        if (before(obj)) {
            Date2 temp = new Date2(this);
            while (temp.year != obj.year || temp.month != obj.month || temp.day != obj.day) {
                temp.nextDay();
                count++;
            }
        } else {
            // this date is >= other date
                Date2 temp = new Date2(obj);
                while (temp.year != year || temp.month != month || temp.day != day) {
                    temp.nextDay();
                    count++;
                }
        }
        return count;
    }


    public boolean before(Date2 obj){
        return year < obj.year || (year == obj.year && (month < obj.month || month == obj.month && day < obj.day));
    }
}
