package assignment1.cheapestroom;


import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class CheapestRoomTest {
    HotelServices hotelServices;
    @Before
    public void initialise()
    {
        List<Hotel> hotels=new ArrayList<>();
        Map<Catagory,Integer> rateCard;
        rateCard=new HashMap<>();
        rateCard.put(new Catagory(Customer.REGULAR,Day.WEEKDAY),110);
        rateCard.put(new Catagory(Customer.REGULAR,Day.WEEKEND),90);
        rateCard.put(new Catagory(Customer.REWARDS,Day.WEEKDAY),80);
        rateCard.put(new Catagory(Customer.REWARDS,Day.WEEKEND),80);
        hotels.add(new Hotel("LandWood",rateCard,3));
        rateCard=new HashMap<>();
        rateCard.put(new Catagory(Customer.REGULAR,Day.WEEKDAY),160);
        rateCard.put(new Catagory(Customer.REGULAR,Day.WEEKEND),60);
        rateCard.put(new Catagory(Customer.REWARDS,Day.WEEKDAY),110);
        rateCard.put(new Catagory(Customer.REWARDS,Day.WEEKEND),50);
        hotels.add(new Hotel("BridgeWood",rateCard,4));
        rateCard=new HashMap<>();
        rateCard.put(new Catagory(Customer.REGULAR,Day.WEEKDAY),220);
        rateCard.put(new Catagory(Customer.REGULAR,Day.WEEKEND),150);
        rateCard.put(new Catagory(Customer.REWARDS,Day.WEEKDAY),100);
        rateCard.put(new Catagory(Customer.REWARDS,Day.WEEKEND),40);
        hotels.add(new Hotel("RidgeWood",rateCard,5));
        hotelServices=new HotelServices(hotels);

    }
    @Test
    public void test()
    {
        Reservation reservation=new Reservation();
        Hotel output=reservation.makeReservation("Rewards:26mar2018(thur),27mar2018(fri),28mar2018(sat)",hotelServices);
        assertEquals("RidgeWood",output.getName());
    }
    @Test
    public void test1()
    {

    }
}
