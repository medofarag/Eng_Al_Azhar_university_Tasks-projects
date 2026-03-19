public class student{
    int id;
    String name;
    student next;
    student previous;

    public student(int id , String name){
        this.id = id;
        this.name = name;
        this.next = null;
    }

    public void displaydata(){
        System.out.println("name: " + name);
        System.out.println("id: " + id);
    }
}
