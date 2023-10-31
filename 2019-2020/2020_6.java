package JawabanNo2QueueLinkedList;

public class QueueLinkList {
    int data;
    QueueLinkList prev, next;

    QueueLinkList(int d){
        data = d;
    }
    int getdata(){ return data; }
}

class LinkedListQueue{
    QueueLinkList front, rear;

    LinkedListQueue(){
        front=rear=null;
    }

    void insert(int d){
        QueueLinkList baru = new QueueLinkList(d);
        if (front == null){ front = rear = baru;
        }
        else{
            rear.next = baru;
            baru.prev = rear;
            rear = baru;
        }
    }
    void remove(){
        if (front.next == null){ front = null; rear = null;
        }
        else{
            front = front.next;
            front.prev = null;
        }
    }
    void display(){
        System.out.print("\nAntrian: ");
        for(QueueLinkList t=front; t!=null; t=t.next){
            System.out.print("["+t.getdata()+"]");
        }
    }
}

public class Driver {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.insert(3);
        queue.display();

        queue.insert(2);
        queue.insert(1);
        queue.display();

        queue.remove();
        queue.display();
    }
}
