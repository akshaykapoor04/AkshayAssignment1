package AkshayAssignment.Testing;
import AkshayAssignment.Others.StringPalindrome;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestingStringPalindrome {
    @Test
    public void test()
    {
        StringPalindrome palindrome=new StringPalindrome();
        boolean output=palindrome.check("chchch");
        assertEquals(false,output);
        output=palindrome.check("chchb");
        assertEquals(true,output);
    }
}
