public class Main {

    //Checking, which is large string
    public static void main(String[] args) {

        String states[] = {"Varanasi","Pune","Bangalore"};

        //Solution

        String largest = states[0];

        for(int i=0; i<states.length; i++){
            if(largest.compareTo(states[i]) < 0){
                largest = states[i];
            }
        }

        System.out.print("Largest string is : " + largest);
    }
}