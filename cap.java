import java.util.*;
class cap
{
    public static void main (String args[])
    {
        Scanner t = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter a line :");
        s = t.nextLine();
        char r;
        int ct = 0;
        for(int i=0;i<s.length();i++)
        {
            r=s.charAt(i);
            if(r>=65 && r<=90)
            {
                ct++;
            }
        }
         System.out.println("total number of words start with capital letters are :"+ct);
     }
}