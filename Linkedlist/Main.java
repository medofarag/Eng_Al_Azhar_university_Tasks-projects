package Linkedlist;

public class Main {
  public static void main(String[] args) {
    linkedliststudent studentbase = new linkedliststudent();
    studentbase.insertstudent(1, "mohamed ali");
    studentbase.insertstudent(2, "mahmoud ali");
    studentbase.insertstudent(3, "harby ali");
    studentbase.insertstudent(4, "haytham");
    studentbase.insertstudent(5, "ali");
    studentbase.insertstudent(6, "yossef");
    studentbase.insertstudent(7, "jo");
    studentbase.insertstudent(8, "farag");
    studentbase.insertstudent(9, "abdo");
    studentbase.insertstudent(10, "yaseen");
    studentbase.insertstudent(11, "Omar");
    studentbase.insertstudent(12, "Mahmoud Ahmed");

    studentbase.displaystudents();

    studentbase.remove(5);
    studentbase.remove(4);
    studentbase.remove(8);
    studentbase.remove(9);
    studentbase.remove(12);

    System.out.println("");
    System.out.println("");

    studentbase.displaystudents();

    System.out.println("");
    System.out.println("");

    studentbase.insertstudent(13, "Mahmoud Ahmed");
    studentbase.insertstudent(14, "Mahmoud Ahmed");
    studentbase.insertstudent(785, "Mahmoud Ahmed");
    studentbase.insertstudent(8, "Mahmoud Ahmed");
    studentbase.insertstudent(55, "Mahmoud Ahmed");
    studentbase.insertstudent(66, "Mahmoud Ahmed");
    studentbase.insertstudent(8, "Mahmoud Ahmed");
    studentbase.insertstudent(22, "Mahmoud Ahmed");

    studentbase.displaystudents();

  }
}
