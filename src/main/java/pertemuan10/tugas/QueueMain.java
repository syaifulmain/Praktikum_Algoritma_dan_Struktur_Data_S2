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
                case 5 -> queue.clear();
                case 6 -> queue.peekRear();
                case 7 -> queue.daftarPembeli();
            }
        } while (pilih != 8);
    }

    static void menu() {
        System.out.println("Masukan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Peek Rear");
        System.out.println("7. Dafatar Pembeli");
        System.out.println("8. Keluar");
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

    static String input(String message) {
        System.out.print(message + " : ");
        return scanner.nextLine();
    }
}
