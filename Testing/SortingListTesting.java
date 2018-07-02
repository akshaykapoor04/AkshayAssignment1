package AkshayAssignment.Testing;
import AkshayAssignment.Others.SortingList;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class SortingListTesting {
    @Test
    public void test()
    {
        ArrayList<Integer> test1=new ArrayList();
        test1.add(6);
        test1.add(2);
        test1.add(7);
        test1.add(1);
        test1.add(8);
        test1.add(2);
        test1.add(4);
        test1.add(1);
        List<Integer> output=SortingList.sort(test1);
        Integer check1[]={4,6,7,8,2,2,1,1};
        assertArrayEquals(check1,output.toArray());
        ArrayList<String> test2=new ArrayList<>();
        test2.add("akshay");
        test2.add("aarushi");
        test2.add("tutu");
        test2.add("tanvi");
        test2.add("aarushi");
        test2.add("aarushi");
        test2.add("neeraj");
        test2.add("shivam");
        List<String> output2=SortingList.sort(test2);
        String check2[]={"akshay","neeraj","shivam","tanvi","tutu","aarushi","aarushi","aarushi"};
        assertArrayEquals(check2,output2.toArray());


    }
}
