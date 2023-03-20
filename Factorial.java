import java.util.*;
class Factorial {

    public static int findFactorial(int num) {
         
        if (num == 0 || num == 1) { 
            return 1;
        } else {
            return num * findFactorial(num - 1); 
            
        }
    }

    public static void main(String[] args) {
         
        Scanner num= new Scanner(System.in);
       int number=num.nextInt();
        System.out.println("Enter the number :"+ number);
       
        int factorial = findFactorial(number);
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
