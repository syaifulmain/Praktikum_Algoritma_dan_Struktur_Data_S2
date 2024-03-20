package pertemuan6.percobaan1;

public class Mahasiswa {
    private String nama;
    private int thnMasuk;
    private int umur;
    private double ipk;

    public Mahasiswa(String nama, int thnMasuk, int umur, double ipk) {
        this.nama = nama;
        this.thnMasuk = thnMasuk;
        this.umur = umur;
        this.ipk = ipk;
    }

    void tampil () {
        String tampil = """
                Nama        = %s
                Tahun Masuk = %d
                Umur        = %d
                IPK         = %.2f
                """.formatted(nama, thnMasuk, umur, ipk);
        System.out.print(tampil);
    }

    public double getIpk() {
        return ipk;
    }
}
