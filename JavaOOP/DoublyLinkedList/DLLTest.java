public class DLLTest {
    public static void main(String[] args) {
        DLL dll = new DLL();
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        Node n6 = new Node(60);

        dll.push(n1);
        dll.push(n2);
        dll.push(n3);
        dll.push(n4);
        dll.push(n5);
        dll.push(n6);

        Node n7 = new Node(1);
        Node n8 = new Node(2);
        Node n9 = new Node(3);
        Node n10 = new Node(4);

        DLL dll2 = new DLL();

        dll2.push(n7);
        dll2.push(n8);
        dll2.push(n9);
        dll2.push(n10);
        dll2.push(n10);
        dll2.push(n9);
        dll2.push(n8);
        dll2.push(n7);

        System.out.println("\n******************************************");
        System.out.println("Print Values Forward: ");
        dll.printValuesForward();
        System.out.println("\n******************************************");
        System.out.println("Print Values Backward: ");
        dll.printValuesBackward();
        System.out.println("\n******************************************");
        System.out.println("Remove last node and returns it: ");
        System.out.println(dll.pop());
        dll.printValuesForward();
        System.out.println("\n******************************************");
        System.out.println("Return T/F if value is found: ");
        System.out.println(dll.contains(30));
        System.out.println(dll.contains(60));
        System.out.println("\n******************************************");
        System.out.println("Return the number of nodes in the list: ");
        System.out.println(dll.size());
        System.out.println("\n******************************************");
        System.out.println("Insert At: ");
        dll.insertAt(2, n6);
        dll.printValuesForward();
        System.out.println("\n******************************************");
        System.out.println("Remove At: ");
        dll.removeAt(2);
        dll.printValuesForward();
        System.out.println("\n******************************************");
        System.out.println("Is Palindrome T/F: ");
        System.out.println(dll.isPalindrome());
        System.out.println(dll2.isPalindrome());
    }
}