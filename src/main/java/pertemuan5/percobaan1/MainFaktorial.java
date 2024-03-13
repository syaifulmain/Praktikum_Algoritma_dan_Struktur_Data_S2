package pertemuan5.percobaan1;

import java.util.Scanner;

public class MainFaktorial {
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
            System.out.println("Hasil Faktorial Menggunakan Brute Force Adalah : " + faktorial[i].faktorialBF1(faktorial[i].getNilai())); // user for
//            System.out.println("Hasil Faktorial Menggunakan Brute Force Adalah : " + faktorial[i].faktorialBF2(faktorial[i].getNilai())); // user while
//            System.out.println("Hasil Faktorial Menggunakan Brute Force Adalah : " + faktorial[i].faktorialBF3(faktorial[i].getNilai())); // user do while
        }
        System.out.println("HASIL FAKTORIAL DIVIDE AND CONQUER");
        for (int i = 0; i < e; i++) {
            System.out.println("Hasil Faktorial Menggunakan Divide and Conquer Adalah : " + faktorial[i].faktorialDC(faktorial[i].getNilai()));
        }
    }
}
