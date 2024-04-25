package pertemuan10.tugas;


public class Queue {
    private final Pembeli[] data;
    private int front;
    private int rear;
    private int size;
    private final int max;

    public Queue(int max) {
        this.max = max;
        data = new Pembeli[max];
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

    public void enqueue(Pembeli data) {
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

    public Pembeli dequeue() {
        Pembeli data = null;
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            data = this.data[front];
            this.data[front] = null;
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
            System.out.println("Elemen terdepan: \n" + data[front]);
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
            System.out.println("Elemen terbelakang: \n" + data[rear]);
        }
    }

    public void peekPosition(String nama) {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            int pos = 0;
            while (i != rear) {
                if (data[i].nama().equals(nama)) {
                    System.out.println("Posisi " + nama + " ada di antrian ke-" + pos);
                    return;
                }
                i = (i + 1) % max;
                pos++;
            }
            if (data[i].nama().equals(nama)) {
                System.out.println("Posisi " + nama + " ada di antrian ke-" + pos);
            } else {
                System.out.println("Data tidak ditemukan");
            }
        }
    }

    public void daftarPembeli() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            int pos = 1;
            while (i != rear) {
                System.out.println("Antrian ke-" + pos);
                System.out.println(data[i]);
                i = (i + 1) % max;
                pos++;
            }
            System.out.println("Antrian ke-" + pos);
            System.out.println(data[i]);
        }
    }
}
