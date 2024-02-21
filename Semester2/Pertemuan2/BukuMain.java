public class BukuMain {
    public static void main(String[] args) {
        Buku15 buku1 = new Buku15();
        // mengakses atribut dan memberi nilai
        buku1.judul = "Today Ends Tomorrow Comes";
        buku1.pengarang = "Denanda Pertiwi";
        buku1.halaman = 198;
        buku1.stok = 13;
        buku1.harga = 71000;
        // memanggil method
        buku1.tampilInformasi();
        buku1.terjual(5);
        buku1.gantiHarga(60000);
        buku1.tampilInformasi();
        // membuat objek baru dengan constructor
        Buku15 buku2 = new Buku15("Self Reward","Maheera", 160, 29, 59000);
        buku2.terjual(11);
        buku2.tampilInformasi();
    }
}
