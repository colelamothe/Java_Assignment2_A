public class StarsC {

    // printing method
    public void print(){

        // variable declaration
        final int MAX_ROWS = 10;
        int stars = 10;
        String starString = "";

        // loops controls number of rows
        for(int i = 0;i<MAX_ROWS;i++){
            // loop controls number of stars per row
            for(int j = 0; j<stars;j++){
                starString += "*"; // concatenates the stars into a string for processing later
            }

            // Print formatting
            System.out.printf("%10s", starString); // right justifies the string by setting a field width of 10

            // reset row for next iteration
            starString = "";
            stars--;
            System.out.println();
        }
    }
}
