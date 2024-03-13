package pertemuan5;

import java.util.Scanner;

public class Faktorial {
    private int nilai;

    public Faktorial(int nilai) {
        this.nilai = nilai;
    }

    public int getNilai() {
        return nilai;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Jumlah Element : ");
        int e = scanner.nextInt();
        Faktorial[] faktorial = new Faktorial[e];
        for (int i = 0; i < e; i++) {
            System.out.print("Masukan Nilai Data ke-" + (i + 1) + " : ");
            faktorial[i] = new Faktorial(scanner.nextInt());
        }
        System.out.println("HASIL FAKTORIAL BRUTE FORCE");
        for (int i = 0; i < e; i++) {
            System.out.println("Hasil Faktorial Menggunakan Brute Force Adalah : " + faktorial[i].faktorialBF1(faktorial[i].getNilai()));
        }
        System.out.println("HASIL FAKTORIAL DIVIDE AND CONQUER");
        for (int i = 0; i < e; i++) {
            System.out.println("Hasil Faktorial Menggunakan Divide and Conquer Adalah : " + faktorial[i].faktorialDC(faktorial[i].getNilai()));
        }
    }

    // Faktorial Brute Force for
    int faktorialBF1(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto *= i;
        }
        return fakto;
    }

    // Faktorial Brute Force while
    int faktorialBF2(int n) {
        int fakto = 1;
        int i = 1;
        while (i <= n) {
            fakto *= i;
            i++;
        }
        return fakto;
    }

    // Faktorial Brute Force do while
    int faktorialBF3(int n) {
        int fakto = 1;
        int i = 1;
        if (n != 0) {
            do {
                fakto *= i;
                i++;
            } while (i <= n);
        }
        return fakto;
    }

    int faktorialDC(int n) {
        return (n == 0) ? 1 : n * faktorialDC(n - 1);
    }
}
