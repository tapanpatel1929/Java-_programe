import java.util.*;
 public class Dollar
{
    public static void main(String[]args)
    {
      double rupees;
      System.out.println("Enter the value of rupees :");
      Scanner i= new Scanner(System.in);
      rupees=i.nextDouble();
      double dollars = rupees/80;
      System.out.println("dollars :"+dollars);
      }
}