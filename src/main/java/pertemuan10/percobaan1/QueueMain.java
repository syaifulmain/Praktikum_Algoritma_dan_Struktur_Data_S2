package pertemuan10.percobaan1;

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan kapasitas queue: ");
        int n = scanner.nextInt();
        Queue queue = new Queue(n);
        int pilih;
        do {
            menu();
            pilih = scanner.nextInt();
            switch (pilih) {
                case 1 -> {
                    System.out.print("Masukan data baru: ");
                    int dataIn = scanner.nextInt();
                    queue.enqueue(dataIn);
                }
                case 2 -> {
                    int dataOut = queue.dequeue();
                    if (dataOut != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataOut);
                    }
                }
                case 3 -> queue.print();
                case 4 -> queue.peek();
                case 5 -> queue.clear();
            }
        } while (pilih != 6);
    }

    static void menu() {
        System.out.println("Masukan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Keluar");
        System.out.println("--------------------");
    }
}
