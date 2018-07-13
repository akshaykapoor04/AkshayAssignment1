package assignment1.test;
import assignment1.string.StringPalindrome;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestingStringPalindrome {
    @Test
    public void testForFalse()
    {
        StringPalindrome palindrome=new StringPalindrome();
        boolean output=palindrome.check("chchch");
        assertEquals(false,output);
        output=palindrome.check("aabb");
        assertEquals(true,output);
    }
    @Test
    public void testForTrue()
    {
        StringPalindrome palindrome=new StringPalindrome();
        boolean output=palindrome.check("aabb");
        assertEquals(true,output);
    }
}
