package pertemuan6.percobaan2;

public class Main {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa mhs1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa mhs2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa mhs3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
        Mahasiswa mhs4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa mhs5 = new Mahasiswa("Ummi", 2019, 21, 3.75);

        list.tambahMahasiswa(mhs1);
        list.tambahMahasiswa(mhs2);
        list.tambahMahasiswa(mhs3);
        list.tambahMahasiswa(mhs4);
        list.tambahMahasiswa(mhs5);

        System.out.println("Data Mahasiswa sebelum sorting : ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting asc berdasarkan IPK : ");
        list.selectionSort();
        list.tampil();
    }
}
