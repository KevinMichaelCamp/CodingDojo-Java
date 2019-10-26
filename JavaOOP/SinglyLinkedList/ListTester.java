public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addBack(1);
        sll.addBack(2);
        sll.addBack(3);
        sll.addBack(4);
        sll.printValues();
        sll.removeBack();
        sll.printValues();
        sll.addFront(4);
        sll.printValues();
        System.out.println(sll.find(2));
        System.out.println(sll.find(5));
        SinglyLinkedList sll2 = new SinglyLinkedList();
        System.out.println(sll2.find(2));

    }
}