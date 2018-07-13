package assignment1.cheapestroom;

import java.util.List;
import java.util.Map;

public class Hotel {
    private String name;
    private Map<Catagory,Integer> rateCard;
    private int rating;
    Hotel(String name, Map<Catagory,Integer> rateCard, int rating)
    {
        this.name=name;
        this.rateCard=rateCard;
        this.rating=rating;
    }

    public String getName() {
        return name;
    }

    public Map<Catagory, Integer> getRateCard() {
        return rateCard;
    }

    public int getRating() {
        return rating;
    }
    public int getCostOf(List<Catagory> catagories)
    {
        int k=0;
        /*for(Map.Entry mh:rateCard.entrySet())
        {
            System.out.println("map "+mh.getKey()+" "+mh.getValue());

            if(k<catagories.size()) {
                System.out.println("list "+catagories.get(k).getCustomer()+" "+catagories.get(k).getDay());
                System.out.println(mh.getKey().equals(catagories.get(k)));
                k++;
            }
        }*/
        int total=0;
        for(int i=0;i<catagories.size();i++)
        {
            //System.out.println(rateCard.get(new Catagory(Customer.valueOf("REWARDS"),Day.valueOf("WEEKDAY")))+" "+rateCard.size());
            total+=rateCard.get(catagories.get(i));
        }

        return total;
    }


}
