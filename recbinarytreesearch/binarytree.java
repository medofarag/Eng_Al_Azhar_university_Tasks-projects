public class binarytree {
  private node root;

  public binarytree() {
    this.root = null;
  }

  public void add(int id, double data) {
    node newnode = new node(id, data);
    if (root == null) {
      root = newnode;
      return;
    }
    if (find(id) != null) {
      System.out.println("this id is already exist");
      return;
    }
    recinsert(root, newnode);
  }

  private void recinsert(node root, node newnode) {
    if (newnode.getID() < root.getID()) {
      if (root.left == null) {
        root.left = newnode;
      } else {
        recinsert(root.left, newnode);
      }
      return;
    }

    if (newnode.getID() > root.getID()) {
      if (root.right == null) {
        root.right = newnode;
      } else {
        recinsert(root.right, newnode);
      }
    }
  }

  public node find(int id) {
    return recsearch(root, id);
  }

  private node recsearch(node root, int id) {
    node target = null;

    if (root == null) {
      return null;
    }

    if (root.getID() == id) {
      target = root;
    }

    if (root.getID() < id) {
      target = recsearch(root.right, id);
    }

    if (root.getID() > id) {
      target = recsearch(root.left, id);
    }

    return target;
  }

  public node rm(int id) {
    if (root == null) {
      System.out.println("this tree is Empty");
      return null;
    }

    node target = recDelete(root, id);

    if (target == null) {
      System.out.println("this id does not exist");
    }

    return target;
  }

  private node recDelete(node root, int id) {
    node target = null;

    if (id < root.getID()) {
      if (root.left == null) {
        return null;
      }

      if (root.left.getID() == id) {
        node temp = root.left;
        root.left = null;
        return temp;
      }

      target = recDelete(root.left, id);
    }

    if (id > root.getID()) {
      if (root.right == null) {
        return null;
      }

      if (root.right.getID() == id) {
        node temp = root.right;
        root.right = null;
        return temp;
      }

      target = recDelete(root.right, id);
    }

    return target;
  }

  public void biggest() {
    if (root == null) {
      System.out.println("this base is Empty");
      return;
    }

    recBiggest(root).display();
  }

  private node recBiggest(node root) {
    node target = root;

    if (root.right != null) {
      target = recBiggest(root.right);
    }

    return target;
  }

  public void smallest() {
    if (root == null) {
      System.out.println("this base is Empty");
      return;
    }
    recSmallest(root).display();
  }

  private node recSmallest(node root) {
    node target = root;
    if (root.left != null) {
      target = recBiggest(root.left);
    }
    return target;
  }

  public void inOrder() {
    recInOrder(root);
  }

  private void recInOrder(node root) {
    if (root == null) {
      return;
    }

    recInOrder(root.left);
    root.display();
    recInOrder(root.right);
  }

  /*
   * private void recPreOrder(node root) {
   * if (root == null) {
   * return;
   * }
   * 
   * root.display();
   * recPreOrder(root.left);
   * recPreOrder(root.right);
   * }
   * 
   * private void recPostOrder(node root) {
   * if (root == null) {
   * return;
   * }
   * 
   * recPostOrder(root.left);
   * recPostOrder(root.right);
   * root.display();
   * }
   */
}
