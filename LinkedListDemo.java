class Node
{
    int data;
    Node next;
}

class LinkedListDemo
{
    public static void main(String[] args)
    {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();

        first.data = 10;
        second.data = 20;
        third.data = 30;

        first.next = second;
        second.next = third;
        third.next = null;

        System.out.println(first.data);
        System.out.println(first.next.data);
        System.out.println(first.next.next.data);
    }
}