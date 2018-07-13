package assignment1.cheapestroom;

import java.util.List;

public class Reservation {
    public Hotel makeReservation(String input,HotelServices hotelServices)
    {
        InputFormating formator=new InputFormating();
        Customer customer=Customer.valueOf(formator.getType(input).toUpperCase());
        List<Day> days=formator.convert(input);
        Request request=new Request(customer,days);
        return hotelServices.getCheapestHotel(request);
    }
}
