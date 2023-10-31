public class Node {
    int key; 
    Node left, right; 
  
    public Node(int item) 
    { 
        key = item; 
        left = right = null; 
    } 
}

public class binaryTree {
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
  
    void Postorder() {
        
        Postorder(root);  
        
    } 

}

public class mainTree {
    public static void main(String[] args) {
       binaryTree tree = new binaryTree(); 
       
       System.out.println("\nSoal A. Input : 1 2 3 4 5 6 "); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6); 
  
        System.out.println("\nPostordernya adalah : "); 
        tree.Postorder(); 
    
    
    binaryTree tree2 = new binaryTree();
    
    System.out.println("\nSoal B. Input : 1 2 3 4 5 6 6 7 7 "); 
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
  
        System.out.println("\nPostordernya adalah : "); 
        tree2.Postorder(); 
}

