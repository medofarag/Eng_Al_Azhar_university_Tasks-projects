package hashtable_separate_chain;

public class separatechain {
  private sortedlinkedlist[] table;
  private int size;

  public separatechain(int size) {
    this.size = size;
    this.table = new sortedlinkedlist[size];

    for (int i = 0; i < size; i++) {
      table[i] = new sortedlinkedlist();
    }
  }

  public int hash(int national_number) {
    return national_number % size;
  }

  public person find(int national_number) {
    int hashvalue = hash(national_number);

    return table[hashvalue].find(national_number);
  }

  public void insert(int national_number, String name, String gender, int age, String joptitle, String home_Address) {
    int hashvalue = hash(national_number);

    if (table[hashvalue].find(national_number) != null) {
      System.out.println("this national number is already exist");
      return;
    }

    table[hashvalue].insert(national_number, name, gender, age, joptitle, home_Address);
  }

  public person remove(int national_number) {
    int hashvalue = hash(national_number);

    person temp = table[hashvalue].remove(national_number);
    return temp;
  }

  public void display() {
    for (int i = 0; i < size; i++) {
      table[i].display_data();
    }
  }
}
