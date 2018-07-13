package assignment1.cheapestroom;

import java.util.ArrayList;

import java.util.List;


public class InputFormating {
    public List<Day> convert(String input)
    {
        List<String> daysInput=new ArrayList<>();

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
                daysInput.add(day);
            }
        }
        List<Day> days=getDaysList(daysInput);
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
    public List getDaysList(List daysInput)
    {
        List<Day> daysType=new ArrayList<>();
        for (int i=0;i<daysInput.size();i++)
        {
            if (daysInput.get(i).equals("mon") || daysInput.get(i).equals("tues") || daysInput.get(i).equals("wed") || daysInput.get(i).equals("thurs") || daysInput.get(i).equals("fri")) {
                daysType.add(Day.WEEKDAY);
            }
            else
            {
                daysType.add(Day.WEEKEND);
            }
        }
        return daysType;
    }

}
