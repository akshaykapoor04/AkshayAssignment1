package AkshayAssignment.hotelReservation;

import java.util.ArrayList;
import java.util.List;

public class Reservation {
    public static List<String> convert(String input)
    {
        ArrayList<String> days=new ArrayList<String>();
        for(int i=0;i<input.length();i++)
        {
            String day="";
            if(input.charAt(i)=='(')
            {
                int j=i+1;
                while(input.charAt(j)!=')')
                {
                    day=day+input.charAt(j);
                    j++;
                }
                i=j;
                days.add(day);
            }
        }

        return days;
    }
    public static String getType(String input)
    {
        String type="";
        int i=0;
        while(input.charAt(i)!=':')
        {
            type=type+input.charAt(i);
            i++;
        }
        return type;
    }
    public static String getCheapestHotel(int lakeWoodRate,int bridgeWoodRate,int ridgeWoodRate,int lakeWoodRating,int bridgeWoodRating,int ridgeWoodRating)
    {

        if(lakeWoodRate<bridgeWoodRate&&lakeWoodRate<ridgeWoodRate)
        {
            return "LakeWood";
        }
        else if(ridgeWoodRate<lakeWoodRate&&ridgeWoodRate<bridgeWoodRate)
        {
            return "RidgeWood";
        }
        else if(bridgeWoodRate<lakeWoodRate&&bridgeWoodRate<ridgeWoodRate)
        {
            return "BridgeWood";
        }
        else
        {
            if(bridgeWoodRate==lakeWoodRate)
            {
                if(bridgeWoodRating>lakeWoodRating)
                    return "BridgeWood";
                else
                    return "LakeWood";
            }
            else if(ridgeWoodRate==lakeWoodRate)
            {
                if(ridgeWoodRate>bridgeWoodRate)
                    return "RidgeWood";
                else
                    return "BridgeWood";
            }
            else
            {
                if(ridgeWoodRating>bridgeWoodRate)
                    return "RidgeWood";
                else
                    return "BridgeWood";
            }
        }

    }
    public String getHotel(String input)
    {
        //Scanner scan=new Scanner(System.in);
        //String input=scan.nextLine();
        ArrayList days=(ArrayList)Reservation.convert(input);
        String type=Reservation.getType(input);
        LakeWood lakeWood=LakeWood.createObject(type);
        BridgeWood bridgeWood=BridgeWood.createObject(type);
        RidgeWood ridgeWood=RidgeWood.createObject(type);
        int lakeWoodRate=lakeWood.calculateTotal(days);
        int bridgeWoodRate=bridgeWood.calculateTotal(days);
        int ridgeWoodRate=ridgeWood.calculateTotal(days);
        String result=Reservation.getCheapestHotel(lakeWoodRate,bridgeWoodRate,ridgeWoodRate,lakeWood.rating,bridgeWood.rating,ridgeWood.rating);
        //System.out.println(lakeWoodRate+" "+bridgeWoodRate+" "+ridgeWoodRate);
        return result;
    }
}
