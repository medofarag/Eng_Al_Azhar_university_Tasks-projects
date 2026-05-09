package hashtable_separate_chain;

public class sortedlinkedlist {
  private person first;
  private person last;

  public sortedlinkedlist() {
    this.first = null;
    this.last = null;
  }

  public void insert(int national_number, String name, String gender, int age, String joptitle, String home_Address) {
    person newperson = new person(national_number, name, gender, age, joptitle, home_Address);

    if (isEmpty()) {
      first = newperson;
      last = newperson;
      return;
    }

    if (find(national_number) != null) {
      return;
    }

    if (first.getNational_number() > newperson.getNational_number()) {
      newperson.next = first;
      first.previous = newperson;
      first = newperson;
      return;
    }

    if (newperson.getNational_number() > last.getNational_number()) {
      newperson.previous = last;
      last.next = newperson;
      last = newperson;
      return;
    }

    person current = first;

    while (current.next != null && current.next.getNational_number() < newperson.getNational_number()) {
      current = current.next;
    }

    newperson.next = current.next;
    current.next.previous = newperson;
    newperson.previous = current;
    current.next = newperson;
  }

  public person find(int national_number) {
    if (isEmpty()) {
      return null;
    }

    person current = first;
    while (current != null && current.getNational_number() != national_number) {
      current = current.next;
    }

    return current;
  }

  public person remove(int national_number) {
    if (isEmpty()) {
      return null;
    }

    person target = find(national_number);

    if (target == null) {
      return null;
    }

    if (first == last) {
      first = null;
      last = null;
      return target;
    }

    if (target.next != null) {
      target.next.previous = target.previous;
    } else {
      last = last.previous;
      last.next = null;
    }

    if (target.previous != null) {
      target.previous.next = target.next;
    } else {
      first = first.next;
      first.previous = null;
    }

    return target;
  }

  public void display_data() {
    if (isEmpty()) {
      return;
    }

    person current = first;
    while (current != null) {
      current.display_Details();
      current = current.next;
    }
  }

  public boolean isEmpty() {
    if (first == null) {
      return true;
    }
    return false;
  }
}
