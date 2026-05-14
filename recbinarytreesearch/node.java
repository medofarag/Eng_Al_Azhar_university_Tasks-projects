public class node {
  int id;
  double data;
  node right;
  node left;

  public node(int id, double data) {
    this.id = id;
    this.data = data;
  }

  public void setID(int id) {
    this.id = id;
  }

  public void setID(double data) {
    this.data = data;
  }

  public int getID() {
    return id;
  }

  public double getData() {
    return data;
  }

  public void display() {
    System.out.println("ID: " + id);
    System.out.println("Data: " + data);
  }
}
