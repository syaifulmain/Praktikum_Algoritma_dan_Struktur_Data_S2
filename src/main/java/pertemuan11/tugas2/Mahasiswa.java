package pertemuan11.tugas2;

public class Mahasiswa {
    int nim;
    String nama;

    public Mahasiswa(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Mhs{" +
                "nim=" + nim +
                ", nama='" + nama + '\'' +
                '}';
    }
}

