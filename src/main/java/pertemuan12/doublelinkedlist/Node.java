package pertemuan12.doublelinkedlist;

public class Node<T> {
    T data;
    Node<T> prev;
    Node<T> next;

    public Node( Node<T> prev, T data, Node<T> next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
