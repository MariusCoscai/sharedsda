package com.sda.java8.binarysearchtree;

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
            } else {
                System.out.println("Key already present: " + key);
                return;
            }
        }
    }

    public void printInOrder() {
        printInOrder(root);
        System.out.println();
    }

    private void printInOrder(TreeNode node) {
        if (node != null) {
            printInOrder(node.getLeft());
            System.out.print(node.getKey() + " ");
            printInOrder(node.getRight());
        }
    }

    public void printPreOrder() {
        printPreOrder(root);
        System.out.println();
    }

    private void printPreOrder(TreeNode node) {
        if (node != null) {
            System.out.print(node.getKey() + " ");
            printPreOrder(node.getLeft());
            printPreOrder(node.getRight());
        }
    }

    public void printPostOrder() {
        printPreOrder(root);
        System.out.println();
    }

    private void printPostOrder(TreeNode node) {
        if (node != null) {
            printPostOrder(node.getLeft());
            printPostOrder(node.getRight());
            System.out.print(node.getKey() + " ");
        }
    }

    // TODO: the variant with return String
}
