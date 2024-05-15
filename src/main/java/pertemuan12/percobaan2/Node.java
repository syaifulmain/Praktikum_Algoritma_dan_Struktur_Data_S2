package pertemuan12.percobaan2;

public class Node {
    int data;
    Node prev;
    Node next;

    public Node( Node prev, int data, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
