import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.print.DocFlavor.INPUT_STREAM;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BT {
    public Node root = null;

    public Node leaf = null;

    public void preOrder(Node node) {
        // node which is given must be root node of the BT
        if (node == null) {
            return;
        }

        // root left right
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(Node node) {
        // node which is given must be root node of the BT
        if (node == null) {
            return;
        }

        // left root right
        preOrder(node.left);
        System.out.print(node.data + " ");
        preOrder(node.right);
    }

    public void postOrder(Node node) {
        // node which is given must be root node of the BT
        if (node == null) {
            return;
        }

        // left right node
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.data + " ");
    }

    public Node arrToBTRecursive(int[] arr, int index) {
        if (index >= arr.length) {
            return null;
        }
        Node temp = new Node(arr[index]);
        temp.left = arrToBTRecursive(arr, index * 2 + 1);
        temp.right = arrToBTRecursive(arr, index * 2 + 2);
        return temp;
    }

    public void arrToBTQueue(int[] arr) {
        Queue<Node> q = new LinkedList<Node>();
        root = new Node(arr[0]);
        q.offer(root);

        int i = 1;
        while (i < arr.length) {
            Node newNode = q.poll();

            newNode.left = new Node(arr[i]);
            i++;
            newNode.right = new Node(arr[i]);
            i++;

            q.offer(newNode.left);
            q.offer(newNode.right);
        }
    }

    public void insertNode(int val) {
        Node curr = root;
        Queue<Node> q = new LinkedList<Node>();
        q.offer(curr);

        int i = 1;
        while (i < arr.length) {
            Node newNode = q.poll();

            newNode.left = new Node(arr[i]);
            i++;
            newNode.right = new Node(arr[i]);
            i++;

            q.offer(newNode.left);
            q.offer(newNode.right);
        }

    }
}

public class BinaryTree {
    public static void main(String[] args) {
        BT bt = new BT();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        // bt.root = bt.arrToBTRecursive(arr,0);
        bt.arrToBTQueue(arr);
        bt.preOrder(bt.root);
    }
}