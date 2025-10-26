package LinkedList;

// Java program to check if
// linked list is circular

class CircularCheck {
    int data;
    CircularCheck next;

    CircularCheck(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularDemo {

    // Function to check if the linked list is circular
    static boolean isCircular(CircularCheck head) {
        // If head is null, list is empty, circular
        if (head == null) return true;

        CircularCheck temp = head;

        // Traverse until the end is reached or
        // the next node equals the head
        while (head != null && head.next != temp)
            head = head.next;

        // If end reached before finding head again,
        // list is not circular
        if (head == null || head.next == null)
            return false;

        // If head found again, list is circular
        return true;
    }

    public static void main(String[] args) {
        CircularCheck head = new CircularCheck(1);
        head.next = new CircularCheck(2);
        head.next.next = new CircularCheck(3);
        head.next.next.next = new CircularCheck(4);
        head.next.next.next = new CircularCheck(8);
        // Check if the linked list is circular
        System.out.println(isCircular(head) ? "Yes" : "No");

        // Making the linked list circular
        head.next.next.next.next = head;

        // Check again if the linked list is circular
        System.out.println(isCircular(head) ? "Yes" : "No");
        System.out.print("The System is not the part of the ");
    }
}
