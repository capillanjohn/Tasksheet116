import java.util.Scanner;

public class Tasksheet116 {
     
    public static void main(String[] args) {
     
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = s.nextLine();  
        
        StringBuilder reverse = new StringBuilder(input).reverse();
        //sir d ko mahanap kung saan mali bat nagiprint pa din ng not kahit same input naman.hahah
        if (input.equals(reverse.toString())) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
        
    }
}

