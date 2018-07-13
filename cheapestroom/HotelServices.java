package assignment1.cheapestroom;

import java.util.*;

public class HotelServices {
    List<Hotel> hotels=new ArrayList<>();
    HotelServices(List<Hotel> hotels)
    {
        this.hotels=hotels;
    }
    public Hotel getCheapestHotel(Request request)
    {
        Map<Integer,Hotel> hotelCost=new HashMap<>();
        List<Integer> totalCost=new ArrayList<>();
        List<Catagory> catagories=request.getCatagories();
        for(Hotel hotel:hotels)
        {
            //System.out.println(hotel.getCostOf(catagories));
            hotelCost.put(hotel.getCostOf(catagories),hotel);

            totalCost.add(hotel.getCostOf(catagories));
        }
        Collections.sort(totalCost);
        return hotelCost.get(totalCost.get(0));
    }
}
