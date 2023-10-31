package No2;

public class Node {
        int key;
        Node next;

        public Node(int key){
            this.key = key;
            this.next = null;
        }
}


public class Queue {
        Node front, rear;

        public Queue(){
            this.front = this.rear = null;
        }

        void Enqueue(int key){
            Node temp = new Node(key);

            if (this.rear == null) {
                this.front = this.rear = temp;
                return;
            }

            this.rear.next = temp;
            this.rear = temp;
        }

        Node Dequeue(){
            if (this.front == null){
                return null;
            }

            Node temp = this.front;
            this.front = this.front.next;

            if (this.front == null) {
                this.rear = null;
            }
            return temp;
        }
}


public class QueueRun {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.Enqueue(10);
        queue.Enqueue(9);
        queue.Dequeue();
        queue.Enqueue(8);
        queue.Dequeue();
        queue.Enqueue(7);
        queue.Enqueue(6);
        queue.Dequeue();
        queue.Enqueue(5);
        queue.Enqueue(4);

        System.out.println("Dequeue atau antrian pertama yaitu " + queue.Dequeue().key);
    }
}
