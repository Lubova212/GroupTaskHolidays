package api;

import java.util.Arrays;


public class Holiday {

    private String startDate;
    private String  endDate;
    private String type;
   private NameResponse[] name;
   private NameResponse result;
    private String text;

    public Holiday(String  startDate, String  endDate, String type, NameResponse[] name) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;
        this.name = name;
    }

    public Holiday() {

    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return this.text = name[0].getText();
    }

    public NameResponse[] getName() {
        return name;
    }

    public void setName(NameResponse[] name) {
        this.text = name[0].getText();
        this.name = name;
    }

    public void setText(String name) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", type='" + type + '\'' +
                ", text='" + text + '\'' +
                ", name='" + Arrays.toString(name) + '\'' +
                '}';
    }

    public String getMonth() {
        return startDate.substring(5, 7);
    }
}
