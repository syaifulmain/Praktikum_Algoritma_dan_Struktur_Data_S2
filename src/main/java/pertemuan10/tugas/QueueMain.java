package pertemuan10.tugas;

import java.util.Scanner;

public class QueueMain {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukan kapasitas queue: ");
        int n = Integer.parseInt(scanner.nextLine());
        Queue queue = new Queue(n);
        int pilih;
        do {
            menu();
            pilih = Integer.parseInt(scanner.nextLine());
            switch (pilih) {
                case 1 -> enqueue(queue);
                case 2 -> dequeue(queue);
                case 3 -> queue.print();
                case 4 -> queue.peek();
                case 5 -> queue.peekRear();
                case 6 -> peekPosition(queue);
                case 7 -> queue.daftarPembeli();
                case 8 -> queue.clear();
            }
        } while (pilih != 9);
    }

    static void menu() {
        System.out.println("Masukan operasi yang diinginkan:");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Semua Antrian");
        System.out.println("4. Cek Antrian Paling Depan");
        System.out.println("5. Cek Antrian Paling Belakang");
        System.out.println("6. Cek Antrian Berdasarkan Nama");
        System.out.println("7. Daftar Pembeli");
        System.out.println("8. Hapus Semua Antrian");
        System.out.println("9. Keluar");
        System.out.println("--------------------");
    }

    static void enqueue(Queue queue) {
        System.out.println("Masukan data baru");
        String nama = input("Nama");
        int noHP = Integer.parseInt(input("No HP"));
        Pembeli dataIn = new Pembeli(nama, noHP);
        queue.enqueue(dataIn);
    }

    static void dequeue(Queue queue) {
        Pembeli dataOut = queue.dequeue();
        if (dataOut != null) {
            System.out.println("Data yang dikeluarkan: ");
            System.out.println(dataOut);
        }
    }

    static void peekPosition(Queue queue) {
        String nama = input("Nama");
        queue.peekPosition(nama);
    }

    static String input(String message) {
        System.out.print(message + " : ");
        return scanner.nextLine();
    }
}
