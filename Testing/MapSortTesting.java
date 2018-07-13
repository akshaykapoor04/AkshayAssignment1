package assignment1.testing;
import assignment1.collections.MapSort;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;

public class MapSortTesting {
    @Test
    public void test()
    {
        Map<Integer,String> student=new HashMap<>();
        student.put(2,"tutu");
        student.put(3,"akshay");
        student.put(4,"aarushi");
        student.put(1,"tanvi");
        LinkedHashMap<Integer,String> test1=MapSort.sort(student);
        String check1[]={"aarushi","akshay","tanvi","tutu"};
        ArrayList<String> testresult= new ArrayList<>(test1.values());
        assertArrayEquals(check1,testresult.toArray());
    }
}
