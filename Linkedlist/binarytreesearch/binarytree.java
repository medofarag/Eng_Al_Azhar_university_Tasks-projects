package binarytreesearch;

public class binarytree {
  private node root;

  public binarytree() {
    this.root = null;
  }

  public boolean isEmpty() {
    if (root == null) {
      return true;
    }
    return false;
  }

  public void insert(int id, double data) {
    if (isEmpty()) {
      root = new node(id, data);
      return;
    }

    node newnode = new node(id, data);
    node previous = root; // initialize
    boolean right = true; // initialize
    node current = root;

    while (current != null) {
      if (id == current.id) {
        System.out.println("this id is already exist");
        return;
      }
      if (id > current.id) {
        previous = current;
        current = current.right;
        right = true;
      } else {
        previous = current;
        current = current.left;
        right = false;
      }
    }
    if (right) {
      previous.right = newnode;
    } else {
      previous.left = newnode;
    }
  }

  public node search(int id) {
    if (isEmpty()) {
      System.out.println("the tree is Empty.");
      return null;
    }

    node current = root;
    while (current != null && current.id != id) {
      if (id > current.id) {
        current = current.right;
        continue;
      }
      if (id < current.id) {
        current = current.left;
        continue;
      }
    }

    if (current == null) {
      System.out.println("this id is not exist!");
      return null;
    }

    if (current.id == id) {
      return current;
    }

    System.out.println("Undefined behavior");
    return null;
  }

  public void display(node node) {
    if (node == null) {
      System.out.println("this node is not exist");
      return;
    }

    System.out.println("ID: " + node.id);
    System.out.println("Data: " + node.data);
    System.out.println(" ");
  }

  public node biggest() {
    if (isEmpty()) {
      System.out.println("The tree is Empty");
      return null;
    }
    node current = root;
    while (current.right != null) {
      current = current.right;
    }
    return current;
  }

  public node smallest() {
    if (isEmpty()) {
      System.out.println("The tree is Empty");
      return null;
    }
    node current = root;
    while (current.left != null) {
      current = current.left;
    }
    return current;
  }

}
