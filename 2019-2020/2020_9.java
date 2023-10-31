package Assesment2_no.pkg2;

import java.util.LinkedList;

public class Assesment2_No2 {
    
    public static void main(String[] args){
        //Membuat Instance/Objek dari LinkedList
        LinkedList<String> buah = new LinkedList<>();
        
        //Menambahkan Data pada Objek buah
        buah.add("Jeruk");
        buah.add("Jambu");
        buah.add("Apel");
        buah.add("Melon");
        buah.add("Semangka");
        buah.add("Nanas");
        buah.add("Sirsak");
        
        //Mencetak/Menampilkan Data
        System.out.println("Nama Buah: "+buah);
        
        //Menghitung Jumlah/Ukuran pada Objek LinkedList
        System.out.println("Jumlah Buah: "+buah.size());
    }
}
