package hashtable_separate_chain;

public class Main {
  public static void main(String[] args) {
    separatechain base = new separatechain(40);
    base.insert(8888, "mohamed", "male", 20, "accounter", "newyork");
    base.insert(8567, "mahmoud", "male", 21, "programmer", "sanaddress");
    base.insert(5874, "ali", "male", 15, "student", "cairo");
    base.insert(8856, "marium", "female", 24, "Engineer", "zagaig");
    base.insert(4388, "yasser", "male", 23, "civel", "sanfrancisco");
    base.insert(2354, "mustafa", "male", 66, "civel", "Alexanderia");

    base.display();

    base.remove(8888);
    base.remove(8888);
    base.remove(2357);

    base.display();

    base.insert(2354, "mustafa", "male", 66, "civel", "Alexanderia");
    base.display();

  }
}
