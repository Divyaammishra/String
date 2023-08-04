import java.util.Scanner;

public class Main {

    // Q. Count how many times lower case vowel's occurred ina String entered by the user.

    public static String countVowel(String string){

        Integer count = 0;

        for(int i=0; i<string.length(); i++){
            char ch = string.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("The count of vowel's are :" + count);
        return count.toString();
    }
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        System.out.print("Enter something : ");
        String string = scanner.nextLine();

        countVowel(string);

    }
}