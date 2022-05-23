/**
 * Represents a generic LIFO (=last in first out) stack.
 * @param <E> type parameter for generic stack.
 */
public class Stack<E> {
    private Node<E> head;

    /**
     * Constructor. Initializes a new empty stack.
     */
    public Stack() {
        head = null;
    }

    /**
     * Pushes new element into stack's buttom.
     * @param item - element to be pushed.
     */
    public void push(E item) {
        Node<E> newHead = new Node<>(item);
        newHead.setNext(head);
        head = newHead;
    }

    /**
     * Pop out the last element was pushed into stack.
     * @return top most element in stack.
     */
    public E pop() {
        if (head == null) {
            return null;
        }
        E item = head.getValue();
        head = head.getNext();
        return item;
    }

    /**
     * Shows the head of the stack without pushing it out.
     * @return top most element in stack.
     */
    public E peek() {
        if (head == null) {
            return null;
        }
        return head.getValue();
    }

    /**
     * Checks if stack is empty.
     * @return true if stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return head == null;
    }
}