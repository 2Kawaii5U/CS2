/**
 * Patron.java
 */

/**
 * Patron serves as a person in line at Studio 54
 *
 * @author James Veith jmv5576
 */
public class Patron implements Prioritizable{

    private String name;
    private  int coolness;
    private boolean regular;

    /**
     * Constructor.
     * @param n - the name of the patron
     * @param c - the coolness factor of the patron
     * @param r - boolean indicating whether the patron is a regular
     */
    public Patron(java.lang.String n, int c, boolean r){
        this.name = n;
        this.coolness = c;
        this.regular = r;
    }

    /**
     * The priority of the object, represented as a number
     * @return priority. The coolness factor (higher is better) determines priority, with regularity (being a regular is better) as a tiebreaker between patrons of equal coolness.
     */
    public double getPriority(){
        if (regular)
            return coolness + .5;
        else
            return coolness;
    }

    public String toString(){
        if (regular)
            return "Regular " + name + " with coolness factor " + coolness + " gets in!!!";
        else
            return name + " with coolness factor " + coolness + " gets in!!!";
    }
}
