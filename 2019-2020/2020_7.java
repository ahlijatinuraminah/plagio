package assessment2_sdalab;

public class QueueLinked2 {

    Node front;
    Node rear;

    public QueueLinked2() {
        front = null;
        rear = null;
    }

    private class Node {

        int i;
        Node next;

        Node(int i) {
            this.i = i;
        }

        public void displayData() {
            System.out.println("i   : " + i);
        }
    }


    public int nodeData() {
        return front.i;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void insert(int item) {
        insertLast(item);
    }

    public int remove() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty..");
        }
        return removeFirst();
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty..");
        }
        return nodeData();
    }

    public void insertLast(int i) {
        Node newNode = new Node(i);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
    }

    public int removeFirst() {

        int temp = front.i;
        if (front.next == null) {
            rear = null;
        }
        front = front.next;
        return temp;
    }

    public void displayList() {
        Node current = front;
        while (current != null) {
            current.displayData();
            current = current.next;
        }
    }


    public static void main(String[] args) {
        QueueLinked2 queue = new QueueLinked2();
        queue.insert(7);
        queue.insert(8);
        queue.insert(9);
        queue.displayList();
        System.out.println("\nPeeked  : " + queue.peek());
        System.out.println("Removed : " + queue.remove());
        System.out.println("Removed : " + queue.remove());
        System.out.println("Removed : " + queue.remove());
        queue.displayList();
    }
}
