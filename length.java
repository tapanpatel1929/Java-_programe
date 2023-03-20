import java.util.*;

public class length {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine();
        int length = str.length();
        int halfLength = length / 2;

        System.out.println("The length of the string is: " + length);
        System.out.println("The second half of the string is: " + str.substring(halfLength));
    }
}
