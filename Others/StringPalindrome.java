package AkshayAssignment.Others;

public class StringPalindrome {
    public boolean checkPalindrome(String sample)
    {
        int counter=0;
        int noofodd=0;
        String charobserved="";
        while (counter<sample.length())
        {
            if(inString(sample.charAt(counter),charobserved)) {

            }
            else
            {
                charobserved=charobserved+sample.charAt(counter);
                if ((count(sample.charAt(counter), sample) % 2) != 0) {
                    if (noofodd == 0) {
                        noofodd++;
                    } else {
                        return false;
                    }

                }

            }
            counter++;
        }
        return true;
    }
    public int count(char c,String sample)
    {

        int counter=0;
        int countofchar=0;

        while(counter<sample.length())
        {
            if(sample.charAt(counter)==c)
            {

                countofchar++;
            }
            counter++;
        }
        return countofchar;
    }
    public boolean inString(char c,String charobserved)
    {
        for (int i=0;i<charobserved.length();i++)
        {
            if(charobserved.charAt(i)==c)
            {
                return true;
            }
        }
        return false;
    }
    public static boolean check(String sample)
    {
        //Scanner scan=new Scanner(System.in);
        //String sample=scan.nextLine();
        String samplenew=sample.replace(" ","");
        //System.out.println(samplenew);
        StringPalindrome obj=new StringPalindrome();
        boolean result=obj.checkPalindrome(samplenew);
        return result;
    }
}
