import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FromJson {

    public List<Holiday> getDataFromJson() {
        List<Holiday> holidays = new ArrayList<>();

        try {
            ObjectMapper mapper = new ObjectMapper();

            holidays = Arrays.asList(mapper.readValue(Paths.get("src/main/resources/holidays.json").toFile(), Holiday[].class));

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return holidays;
    }
}