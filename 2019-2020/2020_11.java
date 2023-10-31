public class QueueLinkedList {
    int data;
    QueueLinkedList next;

    QueueLinkedList(int d) { data = d; }

    int getData() { return data; }

    static class QueueLL {
        QueueLinkedList front, rear;
        QueueLL() { front=rear=null; }

        void insert(int d) {
            QueueLinkedList baru = new QueueLinkedList(d);
            if (front == null) {
                front = rear = baru;
            } else {
                rear.next = baru;
                rear = baru;
            }
        }

        void remove() {
            if (front.next == null) {
                front = null;
                rear = null;
            } else {
                QueueLinkedList temp = front;
                front = front.next;
                temp = null;
            }
        }

        void display() {
            System.out.println("\nIsi Antrian: ");
            for (QueueLinkedList t=front; t!=null; t=t.next) {
                System.out.print("{"+t.getData()+"}");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        QueueLinkedList.QueueLL queue = new QueueLinkedList.QueueLL();
        queue.insert(1); queue.display();
        queue.insert(2); queue.display();
        queue.insert(3); queue.display();
        queue.remove(); queue.display();
        queue.remove(); queue.display();
    }
}
