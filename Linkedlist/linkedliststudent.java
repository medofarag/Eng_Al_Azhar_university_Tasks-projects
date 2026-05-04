package Linkedlist;

public class linkedliststudent {
  private student first;
  private student last;

  public linkedliststudent() {
    this.first = null;
    this.last = null;
  }

  public void insertstudentfirst(int id, String name) {
    student newstudent = new student(id, name);
    if (isEmpty()) {
      last = newstudent;
      first = newstudent;
      return;
    }

    newstudent.next = first;
    first.previous = newstudent;
    first = newstudent;
  }

  public void insertstudentlast(int id, String name) {
    student newstudent = new student(id, name);
    if (isEmpty()) {
      first = newstudent;
      last = newstudent;
      return;
    }

    last.next = newstudent;
    newstudent.previous = last;
    last = newstudent;
  }

  public void insertstudent(int id, String name) {
    if (isEmpty()) {
      insertstudentfirst(id, name);
      return;
    }

    if (find(id) != null) {
      System.out.println("this id is already exist");
      return;
    }

    if (first.id > id) {
      insertstudentfirst(id, name);
      return;
    }

    if (last.id < id) {
      insertstudentlast(id, name);
      return;
    }

    student current = first;
    student newstudent = new student(id, name);
    while (newstudent.id > current.next.id) {
      current = current.next;
    }

    newstudent.previous = current;
    newstudent.next = current.next;
    current.next.previous = newstudent;
    current.next = newstudent;
  }

  public void displaystudents() {
    if (isEmpty()) {
      System.out.println("the Linkedlist is empty");
      return;
    }

    student current = first;
    while (current != null) {
      current.displaydata();
      current = current.next;
    }
  }

  public void displaystudents_in_opposite_way() {
    if (isEmpty()) {
      System.out.println("the Linkedlist is empty");
      return;
    }

    student current = last;
    while (current != null) {
      current.displaydata();
      current = current.previous;
    }
  }

  public boolean isEmpty() {
    if (first == null) {
      return true;
    }
    return false;
  }

  public student find(int id) {
    student current = first;
    while (current != null) {
      if (current.id == id) {
        return current;
      }
      current = current.next;
    }
    return null;
  }

  public student remove(int id) {
    if (isEmpty()) {
      return null;
    }

    if (last.id == id) {
      student temp = last;
      last = last.previous;
      last.next = null;
      return temp;
    }

    if (first.id == id) {
      student temp = first;
      first = first.next;
      first.previous = null;
      return temp;
    }

    student current = find(id);
    if (current != null) {
      student temp = current;
      current.next.previous = current.previous;
      current.previous.next = current.next;
      return temp;
    }

    return null;
  }
}
