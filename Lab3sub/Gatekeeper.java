/**
 * Gatekeeper.java
 */
import java.util.Scanner;

/**
 * Main method and representation of a Gatekeeper at Studio 54
 * @author James Veith jmv5576
 */
public class Gatekeeper {

    /**
     * Main method.
     * @param args - Command line arguments (not used)
     */
    public static void main(String[] args) {

        HeapQueue<Patron> heap = new HeapQueue<Patron>();

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
                case 1:
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
                        break;
                    }
                    Patron patron = new Patron( patronName, coolness, regular );
                    heap.insert(patron);
                    break;
                case 2:
                    if (heap.isEmpty())
                        System.out.println("Queue is empty.");
                    else{
                        System.out.println(heap.dequeue().toString());
                    }
                    break;
                case 3:
                    return;

                default:
                    System.out.println("Enter 1, 2, or 3");
            }
        }
    }
}
