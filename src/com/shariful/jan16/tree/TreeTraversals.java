// Java program for different tree traversals : Depth First Traversals (Inorder, Preoredr, Postorder)

package com.shariful.jan16.tree;

class TreeTraversals {
	Node root;
	
	TreeTraversals () {
		root = null;
	}

	 /* Given a binary tree, print its nodes in inorder*/
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
    
    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(Node node)
    {
        if (node == null)
            return;

        /* then print the data of node */
        System.out.print(node.key + " ");
 
        /* first recur on left child */
        printPreorder(node.left);
 
        /* now recur on right child */
        printPreorder(node.right);
    }
    
    /* Given a binary tree, print its nodes in postorder*/
    void printPostorder(Node node)
    {
        if (node == null)
            return;
 
        /* first recur on left child */
        printPostorder(node.left);
 
        /* now recur on right child */
        printPostorder(node.right);

        /* then print the data of node */
        System.out.print(node.key + " ");
    }
    
    void printInorder() {     
    	printInorder(root);   
    }
    
    void printPreorder() {     
    	printPreorder(root);   
    }
    
    void printPostorder() {     
    	printPostorder(root);   
    }
	
    public static void main(String[] args) {
		
    	TreeTraversals binaryTree = new TreeTraversals();
		binaryTree.root = new Node(1);
		binaryTree.root.left = new Node(2);
		binaryTree.root.right = new Node(3);
		binaryTree.root.left.left = new Node(4);
		binaryTree.root.left.right = new Node(5);
		binaryTree.root.right.left = new Node(6);
		binaryTree.root.right.right = new Node(7);
		
		System.out.println("Inorder Traversal: ");
		binaryTree.printInorder();
		
		System.out.println("\nPreorder Traversal: ");
		binaryTree.printPreorder();
		
		System.out.println("\nPostorder Traversal: ");
		binaryTree.printPostorder();
	}

}
