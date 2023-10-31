package SingleLinkedList;

public class SingleLinkedList {
    Node head;  // bagian awal
    static class Node {
        int data;
        Node next;
        Node(int d)  { data = d;  next=null; }
    }
    /* Fungsi ini mencetak konten dari daftar tertaut mulai dari bagian awal */
    public void display()
    {
        Node n = head;
        while (n != null)
        {
            System.out.print(n.data+" \n");
            n = n.next;
        }
    }
    /* metode untuk membuat daftar tertaut sederhana dengan 3 node*/
    public static void main(String[] args)
    {
        /* Mulai dengan daftar kosong. */
        SingleLinkedList list = new SingleLinkedList();

        list.head       = new Node(100);
        Node second      = new Node(200);
        Node third       = new Node(300);

        list.head.next = second; // Hubungkan simpul pertama dengan simpul kedua
        second.next = third; // Hubungkan simpul pertama dengan simpul kedua
        list.display();
    }
}
