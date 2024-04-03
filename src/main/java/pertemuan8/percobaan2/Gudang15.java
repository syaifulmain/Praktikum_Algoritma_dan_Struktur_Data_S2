package pertemuan8.percobaan2;

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
            System.out.println("Kode unik dari biner : " + konversiDesimalKeBiner(hapus.kode));
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

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi15 stack = new StackKonversi15();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode /= 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
