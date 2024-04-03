package pertemuan8.percobaan2;

public class StackKonversi15 {
    int size;
    int[] tumpukanBarang;
    int top;

    public StackKonversi15() {
        this.size = 32;
        this.tumpukanBarang = new int[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int barang) {
        if (isFull()) {
            System.out.println("Gagal! Tumpukan barang sudah penuh");
        } else {
            tumpukanBarang[++top] = barang;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Gagal! Tumpukan barang kosong");
            return -1;
        } else {
            return tumpukanBarang[top--];
        }
    }
}
