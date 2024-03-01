package LatihanPraktikum2;

import java.util.Scanner;

public class Mahasiswa15Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa15[] mhs = new Mahasiswa15[3];
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Masukan Data Mahasiswa ke-" + (i + 1));
            System.out.print("Masukan Nama: ");
            String nama = scanner.next();
            System.out.print("Masukan NIM: ");
            String nim = scanner.next();
            System.out.print("Masukan Jenis Kelamin: ");
            char jenisKelamin = scanner.next().charAt(0);
            System.out.print("Masukan IPK: ");
            float ipk = scanner.nextFloat();
            mhs[i] = new Mahasiswa15(nama, nim, jenisKelamin, ipk);
        }

        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nama: " + mhs[i].nama);
            System.out.println("NIM: " + mhs[i].nim);
            System.out.println("Jenis Kelamin: " + mhs[i].jenisKelamin);
            System.out.println("Niali IPK: " + mhs[i].ipk);
        }
    }
}
