public class Holiday {

    private String holidayName;
    private Month month;
    private int day;

    public Holiday(String holidayName, Month month, int day) {
        this.holidayName = holidayName;
        this.month = month;
        this.day = day;
    }

    public Holiday() {
    }

    public String getHolidayName() {
        return holidayName;
    }

    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "holidayName='" + holidayName + '\'' +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}