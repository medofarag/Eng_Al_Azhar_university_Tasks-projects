public class student {
  private int id;
  private String name;
  private double math_degree;
  private double physics_degree;
  private double english_degree;

  public student(int id, String name, double math_degree, double physics_degree, double english_degree) {
    this.id = id;
    this.name = name;
    this.math_degree = math_degree;
    this.physics_degree = physics_degree;
    this.english_degree = english_degree;
  }

  public int getid() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getMath_degree() {
    return math_degree;
  }

  public double getPhysics_degree() {
    return physics_degree;
  }

  public double getEnglish_degree() {
    return english_degree;
  }

  public void displayDetails() {
    System.out.println("ID : " + id);
    System.out.println("Name : " + name);
    System.out.println("Math degree : " + math_degree);
    System.out.println("Physics degree : " + physics_degree);
    System.out.println("English degree : " + english_degree);
    System.out.println("");
  }
}
