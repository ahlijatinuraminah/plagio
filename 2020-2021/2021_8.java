package asses2nomor2;

import java.util.Stack;

public class Node {
    int data;
    Node left, right;
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}


public class PostOrder {
    Stack<Node> stack1, stack2;

    void postOrder(Node root) {

        // Create two stacks
        stack1 = new Stack();
        stack2 = new Stack<>();

        if (root == null)
            return;

        stack1.push(root);

        while (!stack1.isEmpty()) {

            Node temp = stack1.pop();
            stack2.push(temp);

            if (temp.left != null)
                stack1.push(temp.left);
            if (temp.right != null)
                stack1.push(temp.right);
        }

        // Print all elements of second stack
        while (!stack2.isEmpty()) {
            Node temp = stack2.pop();
            System.out.print(temp.data + " ");
        }
    }
}



public class Main {
    public static void main(String[] args) {
        Node root = null;

        root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(6);

        root.left.left.left = new Node(7);
        root.left.left.right = new Node(7);

        PostOrder postOrder = new PostOrder();
        postOrder.postOrder(root);
    }
}
