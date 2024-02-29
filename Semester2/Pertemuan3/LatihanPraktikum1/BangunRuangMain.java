package LatihanPraktikum1;

import java.util.Scanner;

public class BangunRuangMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bangunRuang = 1;
        Kerucut[] kerucut = new Kerucut[bangunRuang];
        LimasSegiEmpatSamaSisi[] limas = new LimasSegiEmpatSamaSisi[bangunRuang];
        bola[] bola = new bola[bangunRuang];

        for (int i = 0; i < bangunRuang; i++) {
            System.out.println("Kerucut ke-" + i);
            System.out.print("Jari-jari : ");
            double jariJari = sc.nextDouble();
            System.out.print("Sisi miring : ");
            double sisiMiring = sc.nextDouble();
            kerucut[i] = new Kerucut(jariJari, sisiMiring);
        }

        for (int i = 0; i < bangunRuang; i++) {
            System.out.println("Limas ke-" + i);
            System.out.print("Sisi alas : ");
            double sisiAlas = sc.nextDouble();
            System.out.print("Tinggi : ");
            double tinggi = sc.nextDouble();
            limas[i] = new LimasSegiEmpatSamaSisi(sisiAlas, tinggi);
        }

        for (int i = 0; i < bangunRuang; i++) {
            System.out.println("Bola ke-" + i);
            System.out.print("Jari-jari : ");
            double jariJari = sc.nextDouble();
            bola[i] = new bola(jariJari);
        }

        for (int i = 0; i < bangunRuang; i++) {
            System.out.println("Kerucut ke-" + i);
            System.out.println("Volume : " + kerucut[i].hitungVolume());
            System.out.println("Luas permukaan : " + kerucut[i].hitungLuasPermukaan());
        }

        for (int i = 0; i < bangunRuang; i++) {
            System.out.println("Limas ke-" + i);
            System.out.println("Volume : " + limas[i].hitungVolume());
            System.out.println("Luas permukaan : " + limas[i].hitungLuasPermukaan());
        }

        for (int i = 0; i < bangunRuang; i++) {
            System.out.println("Bola ke-" + i);
            System.out.println("Volume : " + bola[i].hitungVolume());
            System.out.println("Luas permukaan : " + bola[i].hitungLuasPermukaan());
        }
    }
}
