public class QueueLinkedList {
    int data;
    QueueLinkedList prev, next;
    QueueLinkedList(int d){
        data=d;
    }
    int getdata(){ return data; }
}
class linkedlistq{
    QueueLinkedList front, rear;
    linkedlistq(){
        front=rear=null;
    }

    void insert(int d){
        QueueLinkedList baru = new QueueLinkedList(d);
        if (front==null){ front=rear=baru;
        }
        else{
            rear.next = baru;
            baru.prev = rear;
            rear = baru;
        }
    }
    void remove(){
        if (front.next==null){ front=null; rear=null;
        }
        else{
            front=front.next;
            front.prev=null;
        }
    }
    void display(){
        System.out.print("\nIsi Antrian: ");
        for(QueueLinkedList t=front; t!=null; t=t.next){
            System.out.print("["+t.getdata()+"]");
        }
    }

    public static void main(String[] args) {
        linkedlistq queue = new linkedlistq();
        queue.insert(1); queue.display();
        queue.insert(2); queue.display();
        queue.insert(3); queue.display();
        queue.insert(4); queue.display();
        queue.remove(); queue.display();
        queue.remove(); queue.display();
        queue.remove(); queue.display();
        queue.remove(); queue.display();
    }

}



