package HashTable_Linear_Probing;

import HashTable_Linear_Probing.hashtable;

public class Main {
  public static void main(String[] args) {
    hashtable base = new hashtable(40);

    base.insert(44, "toggle");
    base.insert(88, "mohamed");
    base.insert(55, "hashim");
    base.insert(84, "ahmad");
    base.insert(66, "yasser");

    base.display();

    base.remove(66);
    base.remove(66);
    base.remove(88);
    base.remove(456);

    base.display();
  }
}
