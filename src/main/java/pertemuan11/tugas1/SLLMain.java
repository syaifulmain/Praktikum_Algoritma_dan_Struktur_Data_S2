package pertemuan11.tugas1;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.print();
        singLL.addLast(new Mahasiswa(115, "Sari"));
        singLL.print();
        singLL.addFirst(new Mahasiswa(111, "Anton"));
        singLL.print();
        singLL.insertAfter(111, new Mahasiswa(112, "Prita"));
        singLL.print();
        singLL.insertAt(2, new Mahasiswa(113, "Yusuf"));
        singLL.print();
        singLL.insertAfter("Yusuf", new Mahasiswa(114, "Doni"));
        singLL.print();
    }
}