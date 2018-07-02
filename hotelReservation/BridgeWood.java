package AkshayAssignment.hotelReservation;

import java.util.List;

public class BridgeWood extends WoodHotels {
    private int rateweekday;
    private int rateweekend;
    public int rating=4;
    private BridgeWood(int rateweekday,int rateweekend)
    {
        this.rateweekday=rateweekday;
        this.rateweekend=rateweekend;
    }
    public static BridgeWood createObject(String customerType)
    {
        BridgeWood resultObject;
        if(customerType.equalsIgnoreCase("regular"))
        {
            resultObject=new BridgeWood(160,60);
        }
        else
        {
            resultObject=new BridgeWood(110,50);
        }
        return resultObject;
    }

    @Override
    public int calculateTotal(List days) {
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
}
