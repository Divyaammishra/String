public class Main {

    public static String subString(String string, int si, int ei){ //si = starting index, ei = ending index

        String store = "";

        for(int i=si; i<ei; i++){
            store += string.charAt(i);
        }
        return store;
    }
    public static void main(String[] args) {

        String string = "HelloAbc";

        System.out.print(subString(string, 0, 4));

        /*
        Java has an inbuilt substring function,
        no need to create any function or any extra code
        just use String variable which we have crated

        System.out.print(string.subString(starting index, ending index));
         */

    }
}