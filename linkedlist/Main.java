// A class to represent a node of a linked list
class Node {
    int data; // the data stored in the node
    Node next; // the reference to the next node

    // A constructor to create a new node with given data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// A class to represent a linked list
class LinkedList {
    Node head; // the reference to the head node

    // A method to add a new node at the end of the list
    public void append(int data) {
        // Create a new node with given data
        Node newNode = new Node(data);

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Otherwise, traverse the list to find the last node
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        // Link the new node to the last node
        last.next = newNode;
    }

    // A method to reorder the list as L0 -> Ln -> L1 -> Ln-1 -> ...
    public void reorder() {
        // If the list is empty or has only one node, do nothing
        if (head == null || head.next == null) {
            return;
        }

        // Find the middle node of the list using slow and fast pointers
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split the list into two halves
        Node firstHalf = head;
        Node secondHalf = slow.next;
        slow.next = null;

        // Reverse the second half of the list
        secondHalf = reverse(secondHalf);

        // Merge the two halves alternately
        Node curr = firstHalf;
        while (secondHalf != null) {
            // Save the next nodes of both halves
            Node nextFirst = curr.next;
            Node nextSecond = secondHalf.next;

            // Link the current nodes of both halves
            curr.next = secondHalf;
            secondHalf.next = nextFirst;

            // Move to the next nodes of both halves
            curr = nextFirst;
            secondHalf = nextSecond;
        }
    }

    // A helper method to reverse a given list
    private Node reverse(Node head) {
        // Initialize the previous, current and next pointers
        Node prev = null;
        Node curr = head;
        Node next = null;

        // Iterate until the end of the list
        while (curr != null) {
            // Save the next node
            next = curr.next;

            // Make the current node point to the previous node
            curr.next = prev;

            // Move the previous and current pointers one step forward
            prev = curr;
            curr = next;
        }

        // Return the new head of the reversed list
        return prev;
    }

    // A method to print the data of the list
    public void print() {
        // Initialize a pointer to the head node
        Node temp = head;

        // Iterate until the end of the list
        while (temp != null) {
            // Print the data of the current node
            System.out.print(temp.data + " ");

            // Move to the next node
            temp = temp.next;
        }

        // Print a new line
        System.out.println();
    }
}

// A class to test the linked list
class Main {
    public static void main(String[] args) {
        // Create a new linked list
        LinkedList list = new LinkedList();

        // Add some nodes to the list
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        // Print the original list
        System.out.println("Original list:");
        list.print();

        // Reorder the list
        list.reorder();

        // Print the reordered list
        System.out.println("Reordered list:");
        list.print();
    }
}
