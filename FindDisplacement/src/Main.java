public class Main {

    //Refer google to get know more about Displacement
    public static float getShortestPath(String path){
        int x = 0, y = 0;

        for(int i=0; i<path.length(); i++){
            char direction = path.charAt(i);

            if (direction == 'E'){
                x++;
            } else if (direction == 'W') {
                x--;
            } else if (direction == 'N') {
                y++;
            }else {
                y--;
            }
        }

        int xSquare = x*x;
        int ySquare = y*y;

        return (float) Math.sqrt(xSquare + ySquare);
    }
    public static void main(String[] args) {

        String path = "WNENWNSEN"; // W = West, N = North, S = South, E = East

        System.out.print("Displacement of the given direction is " + getShortestPath(path));
    }
}