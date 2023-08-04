import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    /*
    Determine if 2 Strings are anagrams of each other.
    What are anagrams?
            If two strings contain the same characters but in a different order, they can be said to be anagrams. 
     */

    public static void checkAnagrams(String string1, String string2){

        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        if(string1.length() == string2.length()){
            char[] string1charArray = string1.toCharArray();
            char[] string2charArray = string1.toCharArray();

            Arrays.sort(string1charArray);
            Arrays.sort(string2charArray);

            boolean result = Arrays.equals(string1charArray,string2charArray);
                if(result){
                    System.out.print(string1 + " and " + string2 + " are anagrams of each other.");
                }else{
                    System.out.print(string1 + " and " + string2 + " are not anagrams of each other");
                }
        }
        else{
            System.out.print(string1 + " and " + string2 + " are not anagrams of each other");
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word : ");
        String string1 = scanner.nextLine();

        System.out.print("Enter second word : " +
                "");
        String string2 = scanner.nextLine();

        checkAnagrams(string1,string2);
    }
}