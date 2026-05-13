package HashTable_Linear_Probing;

public class hashtable {
  private int size;
  private node[] table;
  private int nElems;

  public hashtable(int size) {
    this.size = size;
    this.table = new node[size];
    this.nElems = 0;
  }

  public boolean isFull() {
    if (nElems == size) {
      return true;
    }
    return false;
  }

  public boolean isEmpty() {
    if (nElems == 0) {
      return true;
    }
    return false;
  }

  public int hash(int id) {
    return id % size;
  }

  public void insert(int id, String name) {
    if (isFull()) {
      System.out.println("this table is Full");
      return;
    }

    int hashvalue = hash(id);

    if (find(id) != -1) {
      System.out.println("this id is already exist");
      return;
    }

    while (hashvalue < size) {
      if (table[hashvalue] == null) {
        table[hashvalue] = new node(id, name);
        nElems++;
        return;
      } else {
        hashvalue++;
      }
    }
  }

  public int find(int id) {
    if (isEmpty()) {
      return -1;
    }

    int hashvalue = hash(id);
    while (hashvalue < size) {
      if (table[hashvalue] == null) {
        return -1;
      }

      if (table[hashvalue].getID() == id) {
        return hashvalue;
      }

      hashvalue++;
    }
    System.out.println("this id does not exist");
    return -1;
  }

  public node remove(int id) {
    int index = find(id);
    if (index == -1) {
      System.out.println("this id is not exist");
      return null;
    }

    // remove
    node temp = table[index];
    table[index] = null;

    nElems--;
    return temp;
  }

  public void display() {
    for (int i = 0; i < size; i++) {
      if (table[i] != null) {
        table[i].display();
      }
    }
  }
}
