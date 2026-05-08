package hashtable_separate_chain;

public class person {
  private int national_number;
  private int age;
  private String name;
  private String joptitle;
  private String gender;
  private String home_Address;
  person next;
  person previous;

  public person(int national_number, String name, String gender, int age, String joptitle, String home_Address) {
    this.national_number = national_number;
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.joptitle = joptitle;
    this.home_Address = home_Address;
    this.next = null;
    this.previous = null;
  }

  public int getNational_number() {
    return national_number;
  }

  public void display_Details() {
    System.out.println("");
    System.out.println("Name: " + name);
    System.out.println("Gender: " + gender);
    System.out.println("Age: " + age);
    System.out.println("Joptitle: " + joptitle);
    System.out.println("Home address: " + home_Address);
    System.out.println("National number: " + national_number);
  }
}
