/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment2;

/**
 *
 * @author Admin
 */
public class TreeNode {    
     TreeNode left, right;
     int data;
 
     /* Constructor */
     public TreeNode()
     {
         left = null;
         right = null;
         data = 0;
     }
     /* Constructor */
     public TreeNode(int n)
     {
         left = null;
         right = null;
         data = n;
     }
     /* Function to set left node */
     public void setLeft(TreeNode n)
     {
         left = n;
     }
     /* Function to set right node */ 
     public void setRight(TreeNode n)
     {
         right = n;
     }
     /* Function to get left node */
     public TreeNode getLeft()
     {
         return left;
     }
     /* Function to get right node */
     public TreeNode getRight()
     {
         return right;
     }

     public void setData(int d)
     {
         data = d;
     }

     public int getData()
     {
         return data;
     }     
 }

public class Tree     
{
    
private TreeNode root;
 

     public Tree()
     {
         root = null;
     }

     public boolean isEmpty()
     {
         return root == null;
     }
     /* Functions to insert data */
     public void insert(int data)
     {
         root = insert(root, data);
     }

     private TreeNode insert(TreeNode node, int data)
     {
         if (node == null)
             node = new TreeNode(data);
         else
         {
             if (node.getRight() == null)
                 node.right = insert(node.right, data);
             else
                 node.left = insert(node.left, data);             
         }
         return node;
     }     
     public void postorder()
     {
         postorder(root);
     }

 void postorder(TreeNode t)
     {
         if (t != null)
         {
             postorder(t.getLeft());             
             postorder(t.getRight());
             System.out.print(t.getData() +" ");
         }
     }     
 }

public class Assessment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("==========================");
        System.out.println("Nomor 2");   
       Scanner scan = new Scanner(System.in);

        Tree t = new Tree(); 

        System.out.println("Binary Tree");          




                t.insert(1);                     
                t.insert(2); 
                t.insert(3); 
                t.insert(4); 
                t.insert(5); 
                t.insert(6); 
                t.insert(6); 
                t.insert(7);
                t.insert(7); 
                System.out.println("Input : 1 2 3 4 5 6 6 7 7");
                        


            System.out.print("Post order : ");
            t.postorder();

                       
    }
    
}
