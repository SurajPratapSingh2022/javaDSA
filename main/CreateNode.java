package com.dsa.main;

import java.util.Scanner;

class Node {
    int info;
    Node next;

    // Constructor to initialize the node
    Node(int info) {
        this.info = info;
        this.next = null;
    }
}

public class CreateNode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the first node
        System.out.print("Enter information: ");
        int data = scanner.nextInt();

        Node start = new Node(data);

        // Display the information stored
        System.out.println("Information stored: " + start.info);

        scanner.close();
    }
}
