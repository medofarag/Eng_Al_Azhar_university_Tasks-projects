public class Main{
    public static void main(String[] args){
        linkedliststudent studentbase = new linkedliststudent();
        studentbase.insertstudentfirst(1 , "mohamed ali");
        studentbase.insertstudentfirst(2 , "mahmoud ali");
        studentbase.insertstudentfirst(3 , "harby ali");
        studentbase.insertstudentfirst(4 , "haytham");
        studentbase.insertstudentfirst(5 , "ali");
        studentbase.insertstudentfirst(6 , "yossef");
        studentbase.insertstudentfirst(7 , "jo");
        studentbase.insertstudentfirst(8 , "farag");
        studentbase.insertstudentfirst(9 , "abdo");
        studentbase.insertstudentfirst(10 , "yaseen");
        studentbase.insertstudentfirst(11 , "Omar");
        studentbase.insertstudentfirst(12 , "Mahmoud Ahmed");

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

        studentbase.insertstudentlast(13 , "Mahmoud Ahmed");
        studentbase.insertstudentlast(14 , "Mahmoud Ahmed");
        studentbase.insertstudentlast(15 , "Mahmoud Ahmed");
        studentbase.insertstudentlast(18 , "Mahmoud Ahmed");
        studentbase.insertstudentlast(19 , "Mahmoud Ahmed");
        studentbase.insertstudentlast(20 , "Mahmoud Ahmed");
        studentbase.insertstudentlast(21 , "Mahmoud Ahmed");
        studentbase.insertstudentlast(22 , "Mahmoud Ahmed");
        
        studentbase.displaystudents();

        System.out.println("");
        System.out.println("");

        studentbase.displaystudents_in_opposite_way();
    }
}
