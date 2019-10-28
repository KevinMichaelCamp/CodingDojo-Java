public class DLL {
    public Node head;
    public Node tail;

    public DLL() { 
        this.head = null;
        this.tail = null;
    }

    // PUSH - adds node to front of list
    public void push(Node newNode) {
        // Empty List
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        // Find last node
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
    }

    // Print Forward
    public void printValuesForward() {
        Node current = this.head;
        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    //Print Backward
    public void printValuesBackward() {
        Node current = this.tail;
        while(current != null){
            System.out.println(current.value);
            current = current.previous;
        }
    }

    // POP - removes last node & returns it
    public Node pop() {
        Node lastNode = this.tail;
        this.tail = lastNode.previous;
        this.tail.next = null;

        return lastNode;
    }

    // Contains
    public boolean contains(int value) {
        Node current = this.head;
        while(current != null){
            if(current.value == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Size
    public int size() {
        int counter = 0;
        Node current = this.head;
        while(current != null){
            counter++;
            current = current.next;
        }
        return counter;
    }

    // Insert At  - might not work with lists containing 1 node
    public void insertAt(int pos, Node newNode) {
        Node current = this.head;

        if(pos < 0){
            System.out.println("Invalid position");
        }
        while(pos > 0){
            current = current.next;
            pos--;
        }
        Node prev = current.previous;
        newNode.next = current;
        newNode.previous = prev;
        prev.next = newNode;
        current.previous = newNode;
    }

    // Remove At
    public void removeAt(int pos) {
        Node current = this.head;

        if (pos < 0) {
            System.out.println("Invalid position");
        }
        while(pos > 0){
            current = current.next;
            pos--;
        }
        Node prev = current.previous;
        Node next = current.next;
        prev.next = next;
        next.previous = prev;
    }
    // is Palindrome
    public boolean isPalindrome() {
        Node frunner = this.head;
        Node brunner = this.tail;
        while (frunner.value == brunner.value) {
            while (frunner != brunner) {
                frunner = frunner.next;
                brunner = brunner.previous;
            }
            return true;
        }
        return false;
    }

}