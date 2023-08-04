public class Main {

    public static String toUpperCase(String string){

        StringBuilder stringBuilder = new StringBuilder("");

        char ch = Character.toUpperCase(string.charAt(0));
        stringBuilder.append(ch);

        for(int i=1; i<string.length(); i++){
            if(string.charAt(i) == ' ' && i<string.charAt(i)-1){
                stringBuilder.append(string.charAt(i));
                i++;
                stringBuilder.append(Character.toUpperCase(string.charAt(i)));
            }else{
                stringBuilder.append(string.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {

        String string = "hello world, abc";

        System.out.print(toUpperCase(string));
    }
}