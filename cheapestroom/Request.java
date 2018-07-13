package assignment1.cheapestroom;

import java.util.ArrayList;
import java.util.List;

public class Request {
    private Customer customer;
    private List<Day> days;
    Request(Customer customer,List<Day> days)
    {
        this.customer=customer;
        this.days=days;
    }
    public List<Catagory> getCatagories()
    {
        List<Catagory> catagories=new ArrayList<>();
        for(int i=0;i<days.size();i++)
        {
            catagories.add(new Catagory(customer,days.get(i)));
        }
        return catagories;
    }
}
