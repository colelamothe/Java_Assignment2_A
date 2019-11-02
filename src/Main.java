public class Main {

    public static void main(String[] args){
        // Object creation to allow the calling of object methods
        StarsA a = new StarsA();
        StarsB b = new StarsB();
        StarsC c = new StarsC();
        StarsD d = new StarsD();

        // prints the starts from A, B, and C
        a.print();
        System.out.println(); // creates space between each star pattern
        b.print();
        System.out.println();
        c.print();
        System.out.println();
        d.print();
    }
}
