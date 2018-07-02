package AkshayAssignment.hotelReservation;

import java.util.List;

public class LakeWood extends WoodHotels{
    private int rateweekday;
    private int rateweekend;
    public int rating=3;
    private LakeWood(int rateweekday,int rateweekend)
    {
        this.rateweekday=rateweekday;
        this.rateweekend=rateweekend;
    }
    public static LakeWood createObject(String customerType)
    {
        LakeWood resultObject;
        if(customerType.equalsIgnoreCase("regular"))
        {
            resultObject=new LakeWood(110,90);
        }
        else
        {
            resultObject=new LakeWood(80,80);
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
