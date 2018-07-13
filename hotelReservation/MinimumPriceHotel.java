package assignment1.hotelreservation;

import java.util.Map;

public class MinimumPriceHotel {

    public String getMinimumPriceHotel(Customer customerType, Map<String,Integer> days) {
        WoodHotels lakeWood;
        WoodHotels bridgeWood;
        WoodHotels ridgeWood;
        if(customerType==Customer.REGULAR)
        {
            lakeWood=new WoodHotels("LakeWood",110,90,3);
            bridgeWood=new WoodHotels("BridgeWood",160,60,4);
            ridgeWood=new WoodHotels("RidgeWood",220,150,5);
        }
        else {
            lakeWood=new WoodHotels("LakeWood",80,80,3);
            bridgeWood=new WoodHotels("BridgeWood",110,50,4);
            ridgeWood=new WoodHotels("RidgeWood",100,40,5);
        }


        int lakeWoodRate=lakeWood.calculateTotal(days);
        int bridgeWoodRate=bridgeWood.calculateTotal(days);
        int ridgeWoodRate=ridgeWood.calculateTotal(days);
        if (lakeWoodRate < bridgeWoodRate && lakeWoodRate < ridgeWoodRate) {
            return lakeWood.getName();
        } else if (ridgeWoodRate < lakeWoodRate && ridgeWoodRate < bridgeWoodRate) {
            return ridgeWood.getName();
        } else if (bridgeWoodRate < lakeWoodRate && bridgeWoodRate < ridgeWoodRate) {
            return bridgeWood.getName();
        } else {
            if (bridgeWoodRate == lakeWoodRate) {
                if ( bridgeWood.getRating()> lakeWood.getRating())
                    return bridgeWood.getName();
                else
                    return lakeWood.getName();
            } else if (ridgeWoodRate == lakeWoodRate) {
                if (ridgeWood.getRating() > bridgeWood.getRating())
                    return ridgeWood.getName();
                else
                    return bridgeWood.getName();
            } else {
                if (ridgeWood.getRating() > lakeWood.getRating())
                    return ridgeWood.getName();
                else
                    return lakeWood.getName();
            }
        }


    }


}
