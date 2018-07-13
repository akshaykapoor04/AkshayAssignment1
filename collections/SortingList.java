package assignment1.collections;

import java.util.*;
public class SortingList {
    public static<N extends Comparable> List<N> sort(List<N> list)
    {
        int sortend=common(list);
        List<N> result;
        for (int i=0;i<sortend-1;i++)
        {
            for(int j=i+1;j<sortend;j++)
            {
                if(list.get(i).compareTo(list.get(j))>0)
                {
                    N temp=list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        result=list;
        return result;
    }
    public static<N extends Comparable> int common(List<N> list)
    {
        int i=0;
        int end=list.size();
        while(i<end-1)
        {
            boolean copy=false;
            for(int j=i+1;j<end;j++)
            {
                if(list.get(i).equals(list.get(j)))
                {
                    copy=true;
                    N temp=list.get(j);
                    list.remove(j);
                    list.add(temp);
                    j--;
                    end--;

                }
            }
            if(copy)
            {
                N temp=list.get(i);
                list.remove(i);
                list.add(temp);
                i--;
                end--;
            }
            i++;
        }
        return end;
    }
    
}
