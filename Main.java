public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.insert(50);
        bt.insert(30);
        bt.insert(70);
        bt.insert(20);
        bt.insert(40);
        bt.insert(60);
        bt.insert(80);

        System.out.println("Árvore antes da remoção:");
        bt.printTree();

        bt.delete(20);
        System.out.println("Árvore após remover 20:");
        bt.printTree();

        bt.delete(30);
        System.out.println("Árvore após remover 30:");
        bt.printTree();

        bt.delete(50);
        System.out.println("Árvore após remover 50:");
        bt.printTree();
    }
}
