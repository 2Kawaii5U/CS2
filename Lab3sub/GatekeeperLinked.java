/**
 * GatekeeperLinked.java
 */
import java.util.Scanner;

/**
 * Identical to Gatekeeper.java, but this uses a LinkedQueue
 * @author James Veith jmv5576
 */
public class GatekeeperLinked {

    /**
     * Main method.
     * @param args - Command line arguments (not used)
     */
    public static void main(String[] args) {

        LinkedQueue<Patron> linked = new LinkedQueue<Patron>();

        Scanner in = new Scanner( System.in );

        int option = 0;
        while( true ) {//repeat until 3 is inputted

            System.out.print("Enter an option\n" +
                    "1 to Add a patron to the queue\n" +
                    "2 to Admit a patron\n" +
                    "3 to Close for the night (quit)\n" +
                    "Your choice: " );

            option = in.nextInt();

            switch (option) {
                case 1:// make a patron
                    System.out.print("Patron name: ");
                    String patronName = in.next();

                    System.out.print("Coolness (1-10): ");
                    int coolness = in.nextInt();

                    System.out.print("Regular (y/n): ");
                    String temp = in.next();
                    boolean regular = false;
                    if (temp.equals( "y" )){
                        regular = true;
                    }else if(temp.equals( "n" )){
                        regular = false;
                    }else{
                        System.out.println("Input must be a 'y' or 'n' character.");
                        break;//to prevent faulty patrons being created
                    }
                    Patron patron = new Patron( patronName, coolness, regular );
                    linked.insert(patron);
                    break;
                case 2://let through a patron
                    if (linked.isEmpty())
                        System.out.println("Queue is empty.");
                    else{
                        System.out.println(linked.dequeue().toString());
                    }
                    break;
                case 3:// close/quit
                    return;

                default://incase they don't enter 1, 2, or 3
                    System.out.println("Enter 1, 2, or 3");
            }
        }
    }
}
