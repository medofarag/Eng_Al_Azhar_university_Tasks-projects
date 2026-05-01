package binarytreesearch;

public class Main {
  public static void main(String[] args) {
    binarytree tree = new binarytree();
    tree.insert(6, 5555);
    tree.insert(7, 5557);
    tree.insert(8, 888);
    tree.insert(4, 959);
    tree.insert(3, 564);
    tree.insert(777, 477);
    tree.insert(789, 43654);
    tree.insert(734, 876876);
    tree.insert(4, 6877);
    tree.insert(1, 83);
    tree.insert(65000, 76);

    tree.display(tree.search(777));
    tree.display(tree.search(88));
    tree.display(tree.search(7));

    tree.display(tree.biggest());
    tree.display(tree.smallest());
  }
}
