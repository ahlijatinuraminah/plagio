import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String j[]){
        Queue<Integer> queue = new LinkedList<>();

        for (int i=0; i<5; i++)
            queue.add(i);

        System.out.println("Antrian  : "+ queue);

        int removeQueue = queue.remove();
        System.out.println("Hapus Antrian : " + removeQueue);

        System.out.println("Antrian saat ini : "+ queue);

        int head = queue.peek();
        System.out.println("Antrian Pertama : " + head);

        int size = queue.size();
        System.out.println("Jumlah Antrian : " + size);
    }
}
