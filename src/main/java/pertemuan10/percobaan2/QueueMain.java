package pertemuan10.percobaan2;

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
                case 3 -> queue.peek();
                case 4 -> queue.print();
                case 5 -> queue.peekRear();
            }
        } while (pilih != 6);
    }

    static void menu() {
        System.out.println("Masukan operasi yang diinginkan:");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian Paling Belakang");
        System.out.println("6. Keluar");
        System.out.println("--------------------");
    }

    static void enqueue(Queue queue) {
        System.out.println("Masukan data baru");
        String noRekening = input("No Rekening");
        String nama = input("Nama");
        String alamat = input("Alamat");
        int umur = Integer.parseInt(input("Umur"));
        double saldo = Double.parseDouble(input("Saldo"));
        Nasabah dataIn = new Nasabah(noRekening, nama, alamat, umur, saldo);
        queue.enqueue(dataIn);
    }

    static void dequeue(Queue queue) {
        Nasabah dataOut = queue.dequeue();
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
