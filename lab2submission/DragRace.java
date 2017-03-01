/**
 * DragRace.java
 */

/**
 * DragRace is a class to race Dragsters.
 *
 * @author James Veith jmv5576
 */
public class DragRace {
    private DragRace(){}

    /**
     * Main method that creates Dragster objects and races them.
     * @param args - commnad line arguments (unused)
     */
    public static void main(String[] args){
        // make the dragsters
        Dragster d1 = new Dragster( .6, 1000, .9, 3 );
        Dragster d2 = new Dragster( .4, 800, 1.0, 5 );
        Dragster d3 = new Dragster( .5, 1200, .95, 7 );
        Dragster d4 = new Dragster( .3, 1200, .95, 1 );
        Dragster d5 = new Dragster( .4, 900, .9, 6 );

        //burnout the dragsters
        d1.burnout();
        d2.burnout();
        d3.burnout();
        d4.burnout();
        d5.burnout();

        // print out the "Dragster characteristics" and the results of each dragster
        System.out.println("Dragster characteristics: " + d1.toString());
        System.out.println("Dragster time: " + d1.race() + " seconds");
        System.out.println("Dragster characteristics: " + d2.toString());
        System.out.println("Dragster time: " + d2.race() + " seconds");
        System.out.println("Dragster characteristics: " + d3.toString());
        System.out.println("Dragster time: " + d3.race() + " seconds");
        System.out.println("Dragster characteristics: " + d4.toString());
        System.out.println("Dragster time: " + d4.race() + " seconds");
        System.out.println("Dragster characteristics: " + d5.toString());
        System.out.println("Dragster time: " + d5.race() + " seconds");

    }
}// Class DragRace
