public class Main {

    public static String stringCompression(String string){

        StringBuilder stringBuilder =  new StringBuilder("");

        for(int i=0; i<string.length(); i++){
            Integer count = 1;
            while(i<string.length()-1 && string.charAt(i) == string.charAt(i+1)){
                count++;
                i++;
            }
            stringBuilder.append(string.charAt(i));
            if(count > 1){
                stringBuilder.append(count.toString());
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {

        String string = "aabbbccccddddd";

        System.out.print(stringCompression(string));
    }
}