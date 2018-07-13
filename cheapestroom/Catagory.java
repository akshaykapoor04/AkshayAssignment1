package assignment1.cheapestroom;

public class Catagory {
    private Customer customer;
    private Day day;
    Catagory(Customer customer,Day day)
    {
        this.customer=customer;
        this.day=day;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Day getDay() {
        return day;
    }

    @Override
    public boolean equals(Object obj) {
        Catagory catagory=(Catagory)obj;
        if(this.getCustomer().toString().equals(catagory.getCustomer().toString()))
        {
            if(this.getDay().toString().equals(catagory.getDay().toString()))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
