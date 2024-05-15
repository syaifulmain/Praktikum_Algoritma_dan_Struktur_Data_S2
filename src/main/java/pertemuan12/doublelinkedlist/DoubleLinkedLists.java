package pertemuan12.doublelinkedlist;

import java.util.Comparator;
import java.util.function.Consumer;

public class DoubleLinkedLists<E> {
    Node<E> head;
    int size;

    public DoubleLinkedLists() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(E item) {
        if (isEmpty()) {
            head = new Node<>(null, item, null);
        } else {
            Node<E> newNode = new Node<>(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(E item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node<E> newNode = new Node<>(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(E item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            Node<E> current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node<E> newNode = new Node<>(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node<E> newNode = new Node<>(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                newNode.prev.next = newNode;
                newNode.next.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node<E> current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node<E> current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public E getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        }
        return head.data;
    }

    public E getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        }
        Node<E> tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public E get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        Node<E> tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    //get all
    public DoubleLinkedLists<E> getAll() {
        DoubleLinkedLists<E> dll = new DoubleLinkedLists<>();
        Node<E> tmp = head;
        while (tmp != null) {
            dll.addLast(tmp.data);
            tmp = tmp.next;
        }
        return dll;
    }

    public void sort(Comparator<? super E> c) {
        Node<E> current = head;
        Node<E> index = null;
        E temp;
        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (c.compare(current.data, index.data) > 0) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public void forEach (Consumer<? super E> action) {
        Node<E> tmp = head;
        while (tmp != null) {
            action.accept(tmp.data);
            tmp = tmp.next;
        }
    }

    public E search(E key, Comparator<? super E> c) {
        Node<E> tmp = head;
        while (tmp != null) {
            if (c.compare(tmp.data, key) == 0) {
                return tmp.data;
            }
            tmp = tmp.next;
        }
        return null;
    }
}
