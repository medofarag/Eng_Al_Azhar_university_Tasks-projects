package HashTable_Linear_Probing;

public class node {
  private int id;
  private String name;

  public node(int id, String name) {
    this.name = name;
    this.id = id;
  }

  public int getID() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void display() {
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
  }
}
