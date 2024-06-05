package pertemuan15.percobaan1;

public class DoubleLinkedList15 {
    Node15 head;
    int size;

    public DoubleLinkedList15() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int data, int jarak) {
        if (isEmpty()) {
            head = new Node15(null, data, jarak, null);
        } else {
            Node15 newNode = new Node15(null, data, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int getJarak(int index) {
        if (isEmpty() || index >= size) {
            throw new IndexOutOfBoundsException("Nilai indeks di luar batas");
        }
        Node15 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public void remove(int index) {
        Node15 current = head;
        while (current != null) {
            if (current.data == index) {
                if(current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if(current.next != null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
        size--;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        if (isEmpty() || index >= size) {
            throw new IndexOutOfBoundsException("Nilai indeks di luar batas");
        }
        Node15 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void clear() {
        head = null;
        size = 0;
    }
}
