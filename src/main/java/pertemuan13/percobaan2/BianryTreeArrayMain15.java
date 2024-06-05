package pertemuan13.percobaan2;

public class BianryTreeArrayMain15 {
    public static void main(String[] args) {
        BinaryTreeArray15 bta = new BinaryTreeArray15();
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("\nInOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println();
    }
}
