package pertemuan11.tugas2;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedQueue singLQ = new SingleLinkedQueue();
        singLQ.print();
        singLQ.enqueue(new Mahasiswa(111, "Anton"));
        singLQ.print();
        singLQ.enqueue(new Mahasiswa(112, "Prita"));
        singLQ.print();
        singLQ.enqueue(new Mahasiswa(113, "Yusuf"));
        singLQ.print();
        singLQ.enqueue(new Mahasiswa(114, "Doni"));
        singLQ.print();
        singLQ.enqueue(new Mahasiswa(115, "Sari"));
        singLQ.print();
        singLQ.peek();

        System.out.println("==================================");

        Mahasiswa dequeue = singLQ.dequeue();
        System.out.println("Elemen yang di-dequeue: " + dequeue);
        dequeue = singLQ.dequeue();
        System.out.println("Elemen yang di-dequeue: " + dequeue);

        System.out.println("==================================");

        singLQ.print();

        System.out.println("==================================");
        singLQ.peek();
        singLQ.peekRear();
    }
}