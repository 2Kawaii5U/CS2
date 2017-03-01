/**
 * Node.java
 */

/**
 * A node class for a prioritized linked queue
 * @author James Veith jmv5576
 */
public class Node<T> {

    public T data;
    public Node<T> next;

    /**
     * Constructor
     * @param data - Any prioritizable object (in this exercise Patron)
     * @param next - The next Node in the linked queue
     */
    public Node(T data, Node<T> next){
        this.data = data;
        this.next = next;
    }
}
