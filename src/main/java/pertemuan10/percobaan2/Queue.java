package pertemuan10.percobaan2;

public class Queue {
    private final Nasabah[] data;
    private int front;
    private int rear;
    private int size;
    private final int max;

    public Queue(int max) {
        this.max = max;
        data = new Nasabah[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(Nasabah data) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            this.data[rear] = data;
            size++;
        }
    }

    public Nasabah dequeue() {
        Nasabah data = null;
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            data = this.data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("Elemen terdepan: " + data[front]);
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i]);
            System.out.println("Jumlah elemen: " + size);
        }
    }

    public void clear() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("Elemen terbelakang: " + data[rear]);
        }
    }
}
