package assignment1.hotelreservation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InputFormating {
    public Map convert(String input)
    {
        ArrayList<String> daysList=new ArrayList<String>();
        Map<String,Integer> days=new HashMap();
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
                daysList.add(day);
            }
        }
        days.put("Weekdays",getWeekDays(daysList));
        days.put("Weekenddays",getWeekEndDays(daysList));
        return days;
    }
    public String getType(String input)
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
    public int getWeekDays(ArrayList days)
    {
        int noOfWeekDays=0;
        for (int i=0;i<days.size();i++)
        {
            if (days.get(i).equals("mon") || days.get(i).equals("tues") || days.get(i).equals("wed") || days.get(i).equals("thurs") || days.get(i).equals("fri")) {
                noOfWeekDays++;
            }
        }
        return noOfWeekDays;
    }
    public int getWeekEndDays(ArrayList days)
    {
        int noOfWeekEndDays=0;
        for (int i=0;i<days.size();i++)
        {
            if (days.get(i).equals("sat") || days.get(i).equals("sun") ) {
                noOfWeekEndDays++;
            }
        }
        return noOfWeekEndDays;
    }
}
