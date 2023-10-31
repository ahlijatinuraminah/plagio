package soal2;

import java.util.LinkedList; 
import java.util.Queue; 

public class Soal2 
{ 
public static void main(String[] args) 
{ 
	Queue<Integer> t = new LinkedList<>(); 

	
	for (int i=3; i<9; i++) 
	t.add(i); 


	System.out.println("elemen yang mengantri: "+t); 

 
	int dihapus = t.remove(); 
	System.out.println("elemen yang dihilangkan: " + dihapus); 

	System.out.println(t); 

	
} 
} 
