package pertemuan6.percobaan2;

public class DaftarMahasiswaBerprestasi {
    private Mahasiswa[] listMhs = new Mahasiswa[5];
    private int idx;
    void tambahMahasiswa(Mahasiswa mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Mahasiswa mhs : listMhs) {
            mhs.tampil();
            System.out.println("=====================================");
        }
    }

    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].getIpk() < temp.getIpk()) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
