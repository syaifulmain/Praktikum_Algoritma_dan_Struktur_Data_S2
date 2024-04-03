package pertemuan8.percobaan1;

public class Gudang15 {
    Barang15[] tumpukan;
    int size;
    int top;

    public Gudang15(int size) {
        this.size = size;
        tumpukan = new Barang15[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang15 barang) {
        if (!cekPenuh()) {
            tumpukan[++top] = barang;
            System.out.println("Barang " + barang.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang15 ambilBarang() {
        if (!cekKosong()) {
            Barang15 hapus = tumpukan[top];
            tumpukan[top--] = null;
            System.out.println("Barang " + hapus.nama + " berhasil diambil dari Gudang");
            return hapus;
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang kosong");
            return null;
        }
    }

    public Barang15 lihatBarangTeratas() {
        if (!cekKosong()) {
            return tumpukan[top];
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang kosong");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian Tumpukan Barang di Gudang");
            for (int i = 0; i <= top; i++) {
                System.out.printf("Kode %d : %s (%s)%n",
                        tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang di Gudang kosong");
        }
    }
}
