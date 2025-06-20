package OOps2.Q3;

public class Node {
    
    int data; Node next;

    Node(int data){
        // Constructor to initialize the node with data and set next to null
        this.data = data; 
        this.next = null; // Initially, the next pointer is set to null
    }
    Node( Node newNode) {
       this.data = newNode.data;
       this.next = new Node (newNode.next); //Deep Copy - Create a new node with the same data and a new next node
    }
}
