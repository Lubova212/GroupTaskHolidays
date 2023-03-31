import java.util.ArrayList;
import java.util.List;

public class Services {

    FromJson fromJson = new FromJson();

    List<Holiday> holidays = fromJson.getDataFromJson();

    public List<Holiday> getHolidayByMonth(Month month) {
        List<Holiday> holidaysByMonth = new ArrayList<>();
        for (Holiday holiday : holidays) {
            if (month.equals(holiday.getMonth())) {
                holidaysByMonth.add(holiday);
            }
        }
        return holidaysByMonth;
    }

    }

