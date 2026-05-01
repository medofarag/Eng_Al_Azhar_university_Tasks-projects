public class Main {
  public static void main(String[] args) {
    student student1 = new student(10, "mohamed", 90.0, 75.0, 80.0);
    student1.displayDetails();
    students_array r = new students_array(6);

    r.add_Student(10, "mohamed", 90.0, 75.0, 80.0);
    r.add_Student(10, "mohamed", 90.0, 75.0, 80.0);
    r.add_Student(6, "mohamed", 90.0, 75.0, 80.0);
    r.add_Student(7, "mohamed", 90.0, 75.0, 80.0);
    r.add_Student(8, "mohamed", 90.0, 75.0, 80.0);
    r.add_Student(9, "mohamed", 90.0, 75.0, 80.0);
    r.add_Student(6, "mohamed", 90.0, 75.0, 80.0);
    r.add_Student(16, "mohamed", 90.0, 75.0, 80.0);
    r.add_Student(16, "mohamed", 90.0, 75.0, 80.0);

    r.display_Students();

    r.remove_Student(80);
    r.remove_Student(60);
    r.remove_Student(16);

    r.radixsort();

    r.display_Students();
  }
}
