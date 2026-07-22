import java.util.Scanner;

// Node class representing each element in the linked list
class Node {
    int data;
    Node link;
}

// Singly Linked List (SLL) class
class Sll {
    private Node front, rear;

    // Constructor to initialize an empty list
    Sll() {
        front = rear = null;
    }

    // Insert at the beginning
    public void insertBegin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int e = sc.nextInt();
        Node temp = new Node();
        temp.data = e;
        temp.link = null;

        if (front == null) {
            front = rear = temp;
        } else {
            temp.link = front;
            front = temp;
        }
        System.out.println("Inserted " + e + " at the beginning.");
    }

    // Insert at the end
    public void insertEnd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int e = sc.nextInt();
        Node temp = new Node();
        temp.data = e;
        temp.link = null;

        if (front == null) {
            front = rear = temp;
        } else {
            rear.link = temp;
            rear = temp;
        }
        System.out.println("Inserted " + e + " at the end.");
    }

    // Delete from the beginning
    public void deleteBegin() {
        if (front == null) {
            System.out.println("List is empty!");
            return;
        }

        Node temp = front;
        front = front.link;
        System.out.println("Deleted " + temp.data + " from the beginning.");
        temp = null;
        if (front == null) {
            rear = null;
        }
    }

    // Delete from the end
    public void deleteEnd() {
        if (front == null) {
            System.out.println("List is empty!");
            return;
        }

        if (front == rear) {
            System.out.println("Deleted " + front.data + " from the end.");
            front = rear = null;
        } else {
            Node temp = front;
            while (temp.link != rear) {
                temp = temp.link;
            }
            System.out.println("Deleted " + rear.data + " from the end.");
            rear = temp;
            rear.link = null;
        }
    }

    // Display the linked list
    public void display() {
        if (front == null) {
            System.out.println("List is empty!");
            return;
        }

        Node temp = front;
        System.out.print("Singly Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.link;
        }
        System.out.println("NULL");
    }
}

// Main class
public class SingleList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sll obj = new Sll();
        int ch;

        do {
            System.out.println("\nOperations on Singly Linked List");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete from Beginning");
            System.out.println("4. Delete from End");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1: obj.insertBegin();
                        break;
                case 2: obj.insertEnd();
                        break;
                case 3: obj.deleteBegin();
                        break;
                case 4: obj.deleteEnd();
                        break;
                case 5: obj.display();
                        break;
                case 6: System.out.println("Exiting...");
                        break;
                default: System.out.println("Invalid choice! Please try again.");
            }
        } while (ch != 6);
    }
}
