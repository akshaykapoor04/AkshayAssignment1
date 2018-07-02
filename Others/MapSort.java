package AkshayAssignment.Others;

import java.util.*;
import java.util.Map;

public class MapSort {
    public static<T,N extends Comparable<N>> LinkedHashMap sort(Map<T,N> student)
    {

        //Object arr1[]= new Object[student.size()];
        //N arr[]=(N[])arr1;
        ArrayList<N> al=new ArrayList<N>();
        Set set=student.keySet();
        Iterator itr=set.iterator();
        //int number=0;
        while(itr.hasNext()){
            //arr1[number]=(N)student.get(itr.next());
            al.add((N)student.get(itr.next()));
            //number++;
        }

        for(int i=0;i<al.size()-1;i++)
        {
            for (int j=i+1;j<al.size();j++)
            {
                if(al.get(i).compareTo(al.get(j))>0)
                {
                    N temp=al.get(i);
                    al.set(i,al.get(j));
                    al.set(j,temp);
                }
            }
        }
        LinkedHashMap<T,N> result=new LinkedHashMap<T,N>();
        for(int i=0;i<al.size();i++)
        {
            for(Map.Entry<T,N> m:student.entrySet())
            {
                if(m.getValue().equals(al.get(i)))
                {
                    result.put(m.getKey(),m.getValue());
                }
            }
        }
        return result;
    }
    public<T,N extends Comparable<N>> LinkedHashMap makeSort(Map<T,N> student)
    {
        //Map<Integer,String> student=new HashMap<Integer,String>();
        //Scanner scan=new Scanner(System.in);
        //System.out.println("enter no. of entries");
        /*int input=scan.nextInt();
        for(int i=0;i<input;i++)
        {
            System.out.println("enter rollno");
            int roll=scan.nextInt();
            System.out.println("enter name");
            String name=scan.next();
            student.put(roll,name);
        }*/
        MapSort obj=new MapSort();
        LinkedHashMap<T,N> result=obj.sort(student);
        return result;

    }
}
