public class NodeSoal2 {

    public String value;
    public NodeSoal2 next;

    public NodeSoal2(String value, NodeSoal2 next){
        this.value = value;
        this.next = next;
    }

    public NodeSoal2(String value){
        this(value, null);
    }

    public NodeSoal2(){
        this(null, null);
    }
}

public class QueueSoal2 {

    public NodeSoal2 head;
    public NodeSoal2 tail;

    public void enqueue(String value){
        if (isEmpty()){
            head = new NodeSoal2(value);
            tail = head;
        } else {
            tail.next = new NodeSoal2(value);
            tail = tail.next;
        }
    }

    public String dequeue(){
        if (isEmpty()) return null;

        String toReturn = head.value;
        head = head.next;

        return toReturn;
    }

    public String peek(){
        return head.value;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int length(){
        int i = 0;
        NodeSoal2 current = head;
        while (current != null){
            ++i;
            current = current.next;
        }

        return i;
    }
}

public class SoalNo2{

    public static void main(String[] args) {
        QueueSoal2 q = new QueueSoal2();
        q.enqueue("halo");
        System.out.println(q.length());
        q.enqueue("dunia");
        q.enqueue("dunia");
        System.out.println(q.length());
        q.enqueue("dunia");
        q.enqueue("dunia");
        q.enqueue("dunia");
        q.enqueue("dunia");
        q.enqueue("dunia");
        System.out.println(q.length());
        System.out.println(q.dequeue());
        q.dequeue();
        q.dequeue();
        System.out.println(q.length());
        System.out.println(q.peek());
    }
}