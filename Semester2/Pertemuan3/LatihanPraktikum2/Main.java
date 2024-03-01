package LatihanPraktikum2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RepoMahasiswa repoMahasiswa = new RepoMahasiswaImpl();
        ServMahasiwa servMahasiwa = new ServMahasiwa(repoMahasiswa);
        ViewMahasiswa viewMahasiswa = new ViewMahasiswa(sc, servMahasiwa);
        viewMahasiswa.mainView();

    }
}
