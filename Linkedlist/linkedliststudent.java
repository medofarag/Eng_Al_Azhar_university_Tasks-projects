public class linkedliststudent {
    private student first;
    private student last;

    public void linkedliststudent(){
        this.first = null;
        this.last = null;
    }

    public void insertstudentfirst(int id , String name){
        student newstudent = new student(id,name);
        if(isEmpty()){
            last = newstudent;
            first = newstudent;
        }else{
            newstudent.next = first;
            first.previous = newstudent;
            first = newstudent;
        }
    }

    public void insertstudentlast(int id , String name){ 
        student newstudent = new student(id,name);
        if(isEmpty()){
            first = newstudent;
            last = newstudent;
        }else{
            last.next = newstudent;
            newstudent.previous = last;
            last = newstudent;
        }
    }

    public void displaystudents(){
        if(!isEmpty()){
	        student current = first;
	        while(current != null){
		        current.displaydata();
		        current = current.next;
	        }
        }else{
            System.out.println("the Linkedlist is empty");
        }
    }


    public void displaystudents_in_opposite_way(){
        if(!isEmpty()){
	        student current = last;
	        while(current != null){
		        current.displaydata();
		        current = current.previous;
	        }
        }else{
            System.out.println("the Linkedlist is empty");
        }
    }

    public boolean isEmpty(){
        if(first == null){
            return true;
        }
        return false;
    }

    public student find(int id){
        student current = first;
        while(current != null){
            if(current.id == id){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public student remove(int id){
        if(!isEmpty()){
            if(last.id == id){
              student temp = last;
              last = last.previous;
              last.next = null;
              return temp;
            }
            if(first.id == id){
                student temp = first;
                first = first.next;
                first.previous = null;
                return temp;
            }else{
                student current;
                current = find(id);
                if(current != null){
                    student temp = current;
                    if(current.next != null){
                        current.next.previous = current.previous;
                    }
                    current.previous.next = current.next;
                    return temp;
                }
            }
        }
        return null;
    }
}
