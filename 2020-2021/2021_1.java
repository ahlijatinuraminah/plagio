/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmentfaqih2;

/**
 *
 * @author Faqih
 */
public class Node {
    int key; 
    Node left, right; 
  
    public Node(int item) 
    { 
        key = item; 
        left = right = null; 
    } 
}

public class TreeBinary {
    Node root; 
  
    { 
        root = null; 
    } 
  
    void Postorder(Node node) 
    { 
        if (node == null) 
            return; 
  
        Postorder(node.left); 
        Postorder(node.right); 
        System.out.print(node.key + " "); 
    } 
  
  
    // Wrappers over above recursive functions 
    void Postorder() {
        
        Postorder(root);  
        
    }
}

public class MainClassTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeBinary tree = new TreeBinary(); 
       
       System.out.println("Soal 1. Tree dengan kontruktor Level"); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6); 
  
        System.out.println("Postorder = "); 
        tree.Postorder(); 
    
    
    TreeBinary tree2 = new TreeBinary();
    System.out.println("");
    System.out.println("Soal 2.Output Tree dalam bentuk post Order "); 
        tree2.root = new Node(1); 
        tree2.root.left = new Node(2); 
        tree2.root.right = new Node(3); 
        tree2.root.left.left = new Node(4); 
        tree2.root.left.right = new Node(5);
        tree2.root.right.left = new Node(6); 
        tree2.root.left.left.left = new Node(7); 
        tree2.root.left.left.right = new Node(7);
        tree2.root.right.left = new Node(6);
        tree2.root.right.right = new Node(6);
  
        System.out.println("Postordernya = "); 
        tree2.Postorder(); 
    
    
}
    
}
