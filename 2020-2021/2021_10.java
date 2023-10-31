import java.util.*;

 // Compiler version JDK 11.0.2

public class Node
 {
    int key; 
    Node left, right; 
  
    public Node(int item) 
    { 
        key = item; 
        left = right = null; 
    } 
 }


public class BinaryTree {
    Node root; 
  
    BinaryTree() 
    { 
        root = null; 
    } 
    
    void printPostorder(Node node) 
    { 
        if (node == null) 
            return; 
  
        // first recur on left subtree 
        printPostorder(node.left); 
  
        // then recur on right subtree 
        printPostorder(node.right); 
  
        // now deal with the node 
        System.out.print(node.key + " "); 
    } 
    
    void printInorder(Node node) 
    { 
        if (node == null) 
            return; 
  
        /* first recur on left child */
        printInorder(node.left); 
  
        /* then print the data of node */
        System.out.print(node.key + " "); 
  
        /* now recur on right child */
        printInorder(node.right); 
    } 
    
    void printPreorder(Node node) 
    { 
        if (node == null) 
            return; 
  
        /* first print data of node */
        System.out.print(node.key + " "); 
  
        /* then recur on left sutree */
        printPreorder(node.left); 
  
        /* now recur on right subtree */
        printPreorder(node.right); 
    } 
    
    void printPostorder()  {     
        printPostorder(root);  
    } 
    void printInorder()    {     
        printInorder(root);   
    } 
    void printPreorder()   {    
        printPreorder(root);  
    } 
 }


public class MainClass
 {

    public static void main(String[] args) 
     {
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
  
        System.out.println("Preorder = "); 
        tree.printPreorder(); 
  
        System.out.println("\nInorder = "); 
        tree.printInorder(); 
  
        System.out.println("\nPostorder = "); 
        tree.printPostorder(); 
    } 
 }
