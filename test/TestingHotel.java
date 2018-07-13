package assignment1.test;
import assignment1.hotelreservation.Reservation;
import org.junit.Test;

import static org.junit.Assert.*;
public class TestingHotel {
    @Test
    public void test()
    {
        Reservation hotel=new Reservation();
        String output=hotel.getHotel("Rewards:26mar2018(thur),27mar2018(fri),28mar2018(sat)");
        assertEquals("RidgeWood",output);
    }
    @Test
    public void test1()
    {
        Reservation hotel=new Reservation();
        String output=hotel.getHotel("Regular:20mar2018(fri),21mar2018(sat),22mar2018(sun)");
        assertEquals("BridgeWood",output);
    }
    @Test
    public void test2()
    {
        Reservation hotel=new Reservation();
        String output=hotel.getHotel("Regular:16mar2018(mon),17mar2018(tues),18mar2018(wed)");
        assertEquals("LakeWood",output);
    }

}
