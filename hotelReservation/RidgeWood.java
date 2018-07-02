package AkshayAssignment.hotelReservation;

import java.util.List;

public class RidgeWood {
    private int rateweekday;
    private int rateweekend;
    public int rating=5;
    private RidgeWood(int rateweekday,int rateweekend)
    {
        this.rateweekday=rateweekday;
        this.rateweekend=rateweekend;
    }
    public static RidgeWood createObject(String customerType)
    {
        RidgeWood resultObject;
        if(customerType.equalsIgnoreCase("regular"))
        {
            resultObject=new RidgeWood(220,150);
        }
        else
        {
            resultObject=new RidgeWood(100,40);
        }
        return resultObject;
    }
    public int calculateTotal(List days)
    {
        int totalPrice=0;
        for(int i=0;i<days.size();i++)
        {
            if(days.get(i).equals("mon")||days.get(i).equals("tues")||days.get(i).equals("wed")||days.get(i).equals("thurs")||days.get(i).equals("fri"))
            {
                totalPrice=totalPrice+this.rateweekday;
            }
            else
            {
                totalPrice=totalPrice+this.rateweekend;
            }
        }
        return totalPrice;
    }
    public int getRating()
    {
        return rating;
    }
}
