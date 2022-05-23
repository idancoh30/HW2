/**
 * Represents a single generic node. Each node contains value and pointer to next node.
 * @param <E> type parameter for generic node.
 */
public class Node<E> {
    private E value;
    private Node<E> next;

    /**
     * Constructor. Initializes a new node which points to another node.
     * @param value - node's value.
     * @param next - pointer to next node.
     */
    public Node(E value, Node<E> next) {
        this.value = value;
        this.next = next;
    }

    /**
     * Constructor. Initializes a new node which points to null.
     * @param value - node's value.
     */
    public Node(E value) {
        this(value, null);
    }

    /**
     * Returns node's value.
     * @return node's value.
     */
    public E getValue() {
        return value;
    }

    /**
     * Returns reference to the next node.
     * @return reference to the next node.
     */
    public Node<E> getNext() {
        return next;
    }

    /**
     * Sets node's next reference. value.
     * @param value - the value to be set into current node.
     */
    public void setValue(E value) {
        this.value = value;
    }

    /**
     * Sets reference to the next node.
     * @param next - next node reference.
     */
    public void setNext(Node<E> next) {
        this.next = next;
    }
}