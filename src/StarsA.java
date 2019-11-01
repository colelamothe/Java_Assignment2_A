public class StarsA {

    // printing method
    public void print(){
        // Variable declaration
        final int MAX_ROWS = 10;
        int stars = 10;

        // loop defines number of line
        for(int i = 0;i<MAX_ROWS;i++){
            // loop defines number of stars per line
            for(int j = 0; j<stars;j++){
                System.out.print("*");
            }
            stars--; // decrements number of stars for each new line.
            System.out.println(); // starts a new line
        }
    }
}
