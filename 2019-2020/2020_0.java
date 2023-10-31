package ass2utha;

import java.util.LinkedList;
import java.util.Queue;

public class Nomor2 {

    public static void queuelist() {
        Queue<Integer> enq = new LinkedList<>();

        for (int i = 1; i < 11; i++) {
            enq.add(i);
        }

        System.out.println("currently in queue: " + enq);

        int dequeue = enq.remove();
        
        System.out.println("dequeued: " + dequeue);
        System.out.println("currently in queue:" + enq);
    }

    public static void main(String[] args) {
        queuelist();
    }
}