/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Queue;
import java.util.LinkedList;
/**
 *
 * @author akbar
 */
class Node {
    int data;
	Node left, right;

	public Node(int item) {
		data = item;
		left = null;
		right = null;
	}
}
class BinaryTree {

	Node root;
	void printLevelOrder() 
	{
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) 
		{
			Node tempNode = queue.poll();
			System.out.print(tempNode.data + " ");

			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}
			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
	}

	public static void main(String args[]) 
	{
		BinaryTree tree_level = new BinaryTree();
		tree_level.root = new Node(1);
		tree_level.root.left = new Node(2);
		tree_level.root.right = new Node(3);
		tree_level.root.left.left = new Node(4);
		tree_level.root.left.right = new Node(5);
                tree_level.root.right.left = new Node(6);
                tree_level.root.right.right = new Node(6);
                tree_level.root.left.left.left = new Node(7);
                tree_level.root.left.left.right = new Node(7);

		System.out.println("tree dengan construct tree per level adalah ");
		tree_level.printLevelOrder();
	}
}
