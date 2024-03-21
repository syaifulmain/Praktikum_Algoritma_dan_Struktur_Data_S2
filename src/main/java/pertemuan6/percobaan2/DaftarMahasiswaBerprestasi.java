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

    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].getIpk() < listMhs[indexMin].getIpk()) {
                    indexMin = j;
                }
            }
            Mahasiswa temp = listMhs[indexMin];
            listMhs[indexMin] = listMhs[i];
            listMhs[i] = temp;
        }
    }
}
