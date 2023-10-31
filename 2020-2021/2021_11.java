/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintree;

/**
 *
 * @author DELL
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
  
        //Visit all the nodes in the left subtree
        printPostorder(node.left); 
  
        //Visit all the nodes in the right subtree
        printPostorder(node.right); 
  
        //Visit the root node
        System.out.print(node.key + " "); 
    } 
    
    void printInorder(Node node) 
    { 
        if (node == null) 
            return; 
  
        //First, visit all the nodes in the left subtree
        printInorder(node.left); 
  
        //Then the root node
        System.out.print(node.key + " "); 
  
        //Visit all the nodes in the right subtree
        printInorder(node.right); 
    } 
    
    void printPreorder(Node node) 
    { 
        if (node == null) 
            return; 
  
        //Visit root node
        System.out.print(node.key + " "); 
  
        //Visit all the nodes in the left subtree
        printPreorder(node.left); 
  
        //Visit all the nodes in the right subtree
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

public class MainTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.left.left.left = new Node(7);
        tree.root.left.left.right = new Node(7);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(6);
  
        System.out.print("Preorder    : "); 
        tree.printPreorder(); 
  
        System.out.print("\nInorder     : "); 
        tree.printInorder(); 
  
        System.out.print("\nPostorder   : "); 
        tree.printPostorder(); 
    } 
}
