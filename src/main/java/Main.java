import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Services services = new Services();
        PrinterService printer = new PrinterService();

        Month enteredMonth = printer.getEnteredMonth();

        printer.printList(services.getHolidayByMonth(enteredMonth));





    }
}
