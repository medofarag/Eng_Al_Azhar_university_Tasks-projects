public class Main {
  public static void main(String[] args) {
    binarytree base = new binarytree();
    base.add(8, 7.5);
    base.add(6, 4534.7);
    base.add(6, 888);
    base.add(4, 56567);
    base.add(33, 756);
    base.add(88, 9654);
    base.add(33, 8496);

    base.inOrder();

    base.rm(4);
    base.rm(44);
    base.rm(6);

    base.inOrder();

    base.find(33).display();

    base.biggest();
    base.smallest();
  }
}
