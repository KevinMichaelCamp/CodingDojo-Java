public class Node {
    public int value;
    public Node previous;
    public Node next;

    public Node(Integer val) {
        this.value = val;
        this.previous = null;
        this.next = null;
    }
}