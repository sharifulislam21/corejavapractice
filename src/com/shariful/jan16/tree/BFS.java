// Recursive Java program for level order traversal (BFS) of Binary Tree

package com.shariful.jan16.tree;

public class BFS {
	
	// Root of the Binary Tree
	Node root;
	
	public BFS(){
		root = null;
	}
	
	void printLevelOrder(){
		int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);
	}

	int height(Node root) {
		
		if(root==null)
			return 0;
		else{
			int lheight = height(root.left);
			int rheight = height(root.right);
			
			if(lheight>rheight)
				return (lheight+1);
			else
				return (rheight+1);
		}
	}
	
	/* Print nodes at the given level */
	void printGivenLevel(Node root, int level) {
		if(root==null)
			return;
		if(level == 1)
			System.out.print(root.key + " ");
		else if(level > 1){
			printGivenLevel(root.left, level-1);
			printGivenLevel(root.right, level-1);
		}
	}

	public static void main(String[] args) {
		BFS tree =  new BFS();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		
		System.out.println("Level Order Traversal of Binary Tree: ");
		tree.printLevelOrder();
	}
}
