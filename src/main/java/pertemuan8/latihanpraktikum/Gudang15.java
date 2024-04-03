package pertemuan8.latihanpraktikum;

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

    public Barang15 lihatBarangTerbawah() {
        if (!cekKosong()) {
            return tumpukan[0];
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

    public Barang15 cariBarang(Object cari, String by) {
        if (!cekKosong()) {
            for (int i = 0; i <= top; i++) {
                if (by.equals("kode")) {
                    if (tumpukan[i].kode == Integer.parseInt(String.valueOf(cari))) {
                        return tumpukan[i];
                    }
                } else if (by.equals("nama")) {
                    if (tumpukan[i].nama.equals(String.valueOf(cari))) {
                        return tumpukan[i];
                    }
                }
            }
            System.out.println("Barang tidak ditemukan");
            return null;
        } else {
            System.out.println("Tumpukan barang di Gudang kosong");
            return null;
        }
    }
}
