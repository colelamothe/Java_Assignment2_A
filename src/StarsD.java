public class StarsD {

    // printing method
    public void print(){

        // Variable Declaration
        final int MAX_ROWS = 10;
        int stars = 1;
        int latch = 0;
        String starString = "";
        int width = 10;
        int spaces = 0;
        int spacesStart = 0;

        // loop controls number of rows
        for(int i = 0;i<MAX_ROWS;i++){
            // loop controls stars per row
            for(int j = 0; j<stars;j++){
                starString += "*"; // concatenates stars to a string to be formatted later
            }

            // increment and decrement of star count to create diamond shape
            if(stars <= 9 && latch == 0) { // uses a latch value to ensure that subtraction continues to happen once it begins.
                if(stars != 9) // Checks if we have reached the end of the 9 star count we want and if we have sets the latch leaving stars at 9
                stars += 2;
                else{
                    latch = 1; // by setting a latch and not changing stars we get the two middle rows of equal width
                }
            }
            else {
                // decrement of stars once the incrementing is finished
                stars -= 2;
            }

            // calculates the spaces needed per row
            spaces = width - starString.length();
            spacesStart = starString.length() + spaces / 2;

            // formats stars to be centered on each line by defining the format for the string object itself
            starString = String.format("%" + spacesStart + "s", starString);
            starString = String.format("%-" + width  + "s", starString);

            // outputs the formatted line
            System.out.println(starString);

            // reset tracking variables
            starString = "";
            spaces = 0;
        }
    }
}
