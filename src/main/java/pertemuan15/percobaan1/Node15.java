package pertemuan15.percobaan1;

public class Node15 {
    int data;
    Node15 prev, next;
    int jarak;

    Node15(Node15 prev, int data, int jarak, Node15 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}
