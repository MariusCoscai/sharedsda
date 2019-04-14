package com.sda.java8.linkedlist.binarysearchtree;

public class BinarySearchTree {
    private TreeNode root;

    public void add(int key) {
        TreeNode newNode = new TreeNode(key);

        // Add initial value 40
        if (root == null) {
            root = newNode;
            return;
        }

        TreeNode currentNode = root;

        while (true) {
            // Add second value 50, 30, 20 and rest
            if (currentNode.getKey() < key) {
                if (currentNode.getRight() != null) {
                    currentNode = currentNode.getRight();
                    continue; // jumps to next iteration of the while: line 17
                }
                currentNode.setRight(newNode);
                newNode.setParent(currentNode);
                return;  // Stops the loop and the method once we add the node
            }
            // Symmetry
            else if (currentNode.getKey() > key) {
                if (currentNode.getLeft() != null) {
                    currentNode = currentNode.getLeft();
                    continue; // jumps to next iteration of the while: line 17
                }
                currentNode.setLeft(newNode);
                newNode.setParent(currentNode);
                return;  // Stops the loop and the method once we add the node
            }
        }
    }

    public void print() {
        print(root);
        System.out.println();
    }

    private void print(TreeNode node) {
        if (node != null) {
            print(node.getLeft());
            System.out.print(node.getKey() + " ");
            print(node.getRight());
        }
    }

    // TODO: the variant with return String
}
