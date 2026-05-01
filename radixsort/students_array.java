public class students_array {
  private student[] students;
  private int size;
  private int nElems;

  public students_array(int size) {
    this.size = size;
    students = new student[size];
    nElems = 0;
  }

  public int getnStudents() {
    return nElems;
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

  public void add_Student(int id, String name, double math_degree, double physics_degree, double english_degree) {
    if (isFull()) {
      System.out.println("the base is full!");
      return;
    }

    if (search(id) != -1) {
      System.out.println("this id is already exist!");
      return;
    }

    student student = new student(id, name, math_degree, physics_degree, english_degree);
    students[nElems] = student;
    nElems++;
  }

  public int search(int id) {
    if (isEmpty()) {
      return -1;
    }

    for (int i = 0; i < nElems; i++) {
      if (students[i].getid() == id) {
        return i;
      }
    }

    return -1;
  }

  public student remove_Student(int id) {
    if (isEmpty()) {
      return null;
    }

    int target = search(id);
    if (target == -1) {
      System.out.println("this student is not exist!");
      return null;
    }

    student temp = students[target];

    for (int i = target; i < nElems - 1; i++) {
      students[i] = students[i + 1];
    }

    nElems--;
    return temp;
  }

  public void display_Students() {
    for (int i = 0; i < nElems; i++) {
      students[i].displayDetails();
    }
  }

  // radix sort
  public void radixsort() {
    if (isEmpty()) {
      System.out.println("I can not sort Empty Array");
      return;
    }

    int Maxid = getMaxid(students);

    for (int exp = 1; Maxid / exp != 0; exp *= 10) {
      countsort(nElems, exp);
    }
  }

  private int getMaxid(student[] Students) {
    int max = Students[0].getid();
    for (int i = 0; i < nElems; i++) {
      if (Students[i].getid() > max) {
        max = Students[i].getid();
      }
    }
    return max;
  }

  private void countsort(int nElems, int exp) {
    student[] output = new student[nElems];
    int[] count = new int[10];

    for (int i = 0; i < nElems; i++) {
      count[(students[i].getid() / exp) % 10]++;
    }

    for (int i = 1; i < 10; i++) {
      count[i] += count[i - 1];
    }

    for (int i = nElems - 1; i >= 0; i--) {
      output[--count[(students[i].getid() / exp) % 10]] = students[i];
    }

    for (int i = 0; i < nElems; i++) {
      students[i] = output[i];
    }
  }
}
