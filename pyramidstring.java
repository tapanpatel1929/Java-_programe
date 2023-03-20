import java.util.*;

  class Pyramidstring
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        int stringLength = inputString.length();
        for (int i = 1; i <= stringLength; i++) {
            for (int j = 0; j < stringLength - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(inputString.charAt(k) + " ");
            }
            System.out.println();
        }
    }
}
