package api;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;

public class Api {
    public static void Api() throws Exception {
        try {

            Gson gson = new Gson();

            HttpRequest getRequest = HttpRequest.newBuilder()
                    .uri(new URI("https://openholidaysapi.org/PublicHolidays?countryIsoCode=AT&languageIsoCode=GB&validFrom=2023-01-01&validTo=2023-12-31&subdivisionCode=AT-GB"))
                    .build();


            HttpClient httpClient = HttpClient.newHttpClient();
            HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());

            List<Holiday> holiday = List.of(gson.fromJson(getResponse.body(), Holiday[].class));

            System.out.println(holiday);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a month");
            String month = scanner.nextLine();

            switch (month) {

                case "january":
                    for (Holiday holiday1 : holiday) {
                        if (holiday1.getMonth().equals("01")) {
                            System.out.println(holiday1.getStartDate() + " " + holiday1.getText());
                        }
                    }
                    break;
                case "february":
                    for (Holiday holiday1 : holiday) {
                        if (holiday1.getMonth().equals("02")) {
                            System.out.println(holiday1.getStartDate() + " " + holiday1.getText());
                        }
                    }
                    break;
                case "march":
                    for (Holiday holiday1 : holiday) {
                        if (holiday1.getMonth().equals("03")) {
                            System.out.println(holiday1.getStartDate() + " " + holiday1.getText());
                        }
                    }
                    break;
                case "april":
                    for (Holiday holiday1 : holiday) {
                        if (holiday1.getMonth().equals("04")) {
                            System.out.println(holiday1.getStartDate() + " " + holiday1.getText());
                        }
                    }
                    break;
                case "may":
                    for (Holiday holiday1 : holiday) {
                        if (holiday1.getMonth().equals("05")) {
                            System.out.println(holiday1.getStartDate() + " " + holiday1.getText());
                        }
                    }
                    break;
                case "june":
                    for (Holiday holiday1 : holiday) {
                    if (holiday1.getMonth().equals("06")) {
                        System.out.println(holiday1.getStartDate() + " " + holiday1.getText());
                    }
                }
                    break;
                case "july":
                    for (Holiday holiday1 : holiday) {
                        if (holiday1.getMonth().equals("07")) {
                            System.out.println(holiday1.getStartDate() + " " + holiday1.getText());
                        }
                    }
                    break;
                case "august":
                    for (Holiday holiday1 : holiday) {
                        if (holiday1.getMonth().equals("08")) {
                            System.out.println(holiday1.getStartDate() + " " + holiday1.getText());
                        }
                    }
                    break;
                case "september":
                    for (Holiday holiday1 : holiday) {
                        if (holiday1.getMonth().equals("09")) {
                            System.out.println(holiday1.getStartDate() + " " + holiday1.getText());
                        }
                    }
                    break;
                case "october":
                    for (Holiday holiday1 : holiday) {
                        if (holiday1.getMonth().equals("10")) {
                            System.out.println(holiday1.getStartDate() + " " + holiday1.getText());
                        }
                    }
                    break;
                case "november":
                    for (Holiday holiday1 : holiday) {
                    if (holiday1.getMonth().equals("11")) {
                        System.out.println(holiday1.getStartDate() + " " + holiday1.getText());
                    }
                }
                    break;
                case "december":
                    for (Holiday holiday1 : holiday) {
                        if (holiday1.getMonth().equals("12")) {
                            System.out.println(holiday1.getStartDate() + " " + holiday1.getText());
                        }
                    }
                    break;
                default:
                    System.out.println("Wrong input");

            }

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
