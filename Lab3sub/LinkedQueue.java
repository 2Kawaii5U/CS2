/**
 * LinkedQueue.java
 */

/**
 * Priority queue implementation using linked list.
 * @author James Veith jmv5576
 */
public class LinkedQueue<T extends Prioritizable> implements PriorityQueue<T>{

    private Node<T> firstNode;

    public LinkedQueue(){
        firstNode = null;
    }

    /**
     * Is there anything in the queue?
     *
     * @return queue is empty.
     */
    @Override
    public boolean isEmpty() {
        if ( firstNode == null )
            return true;
        return false;
    }

    /**
     * Add an item to the queue (at the appropriate location)
     *
     * @param toInsert Item to be added
     */
    @Override
    public void insert(T toInsert) {
        Node<T> newNode = new Node<T>(toInsert, firstNode);
        Node<T> previous = null;
        Node<T> current = firstNode;

        while (current != null && toInsert.getPriority() < current.data.getPriority()) {
            previous = current;
            current = current.next;
        }

        if (previous == null) {
            newNode.next = firstNode;
            firstNode = newNode;
        }

        else {
            previous.next = newNode;
            newNode.next = current;
        }
    }


    /**
     * Removes and returns the item at the front of the queue.
     *
     * @return Removed element
     */
    @Override
    public T dequeue() {
        if (this.isEmpty())
            return null;
        Node<T> temp = firstNode;
        firstNode = firstNode.next;
        return temp.data;
    }
}
