package assignment1.hotelreservation;


import java.util.Map;

public class Reservation {

    public String getHotel(String input)
    {
        InputFormating convertInput=new InputFormating();
        String type=convertInput.getType(input);
        Customer customer;
        customer = Customer.valueOf(type.toUpperCase());
        Map<String,Integer> days=convertInput.convert(input);
        MinimumPriceHotel minimumPriceHotel=new MinimumPriceHotel();
        String result=minimumPriceHotel.getMinimumPriceHotel(customer,days);
        return result;
    }
}


