package assignment1.hotelreservation;

import java.util.Map;

public class WoodHotels {
    private String name;
    private int rateWeekDay;
    private int rateWeekEnd;
    private int rating;

    WoodHotels(String name,int rateWeekDay, int rateWeekEnd, int rating) {
        this.name=name;
        this.rateWeekDay = rateWeekDay;
        this.rateWeekEnd = rateWeekEnd;
        this.rating = rating;
    }

    public int getRating() {
        return this.rating;
    }

    public int calculateTotal(Map<String,Integer> days) {
        return days.get("Weekdays")*this.rateWeekDay+days.get("Weekenddays")*rateWeekEnd;
    }

    public int getRateWeekDay() {
        return rateWeekDay;
    }

    public int getRateWeekEnd() {
        return rateWeekEnd;
    }

    public String getName() {
        return name;
    }
}
