import org.ietf.jgss.GSSContext;

import java.util.Scanner;

public class Main {

    //Check if given string is Palindrome or not

                // Word like mom, mam are palindrome because they are same from start and end as well.

    public static boolean checkPalindrome(String string){

        for(int i=0; i<string.length(); i++){
            if(string.charAt(i) != string.charAt(string.length()-1-i)){
                System.out.println("The given input is not a Palindrome");
                return false;
            }
        }
        System.out.println("The given is a Palindrome");
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the word : ");
        String string = scanner.nextLine();

        checkPalindrome(string);
    }
}