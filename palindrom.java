import java.util.*;
 public class palindrom
{
    public static void main(String[]args)
    {
        int num,Reversenum,reminder;
        Scanner i = new Scanner(System.in);
        System.out.println("Enter a number :");
        num = i.nextInt();
       int originalnum = num ;
        Reversenum = 0;
       while (num != 0)
       {
        reminder = num % 10;
        Reversenum = Reversenum * 10 + reminder;
        num /=10;
       }
       if(originalnum == Reversenum)
       {
        System.out.println(originalnum +"is a palindrom");
       }
       else
       {
        System.out.println(originalnum + " is not a palindrom");
       }
    }   
}    