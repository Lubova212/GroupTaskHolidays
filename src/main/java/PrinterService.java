
import java.util.List;
import java.util.Scanner;

public class PrinterService {
    Scanner scanner = new Scanner(System.in);


    public Month getEnteredMonth() {
        System.out.println("Enter a month: ");
        return Month.valueOf(scanner.nextLine().toUpperCase());
    }

    public void printList(List<Holiday> holidayList) {
        for (Holiday holiday : holidayList) {
            System.out.println(holiday.getHolidayName() + ", " + holiday.getMonth() + " " + holiday.getDay());
        }
    }
}
