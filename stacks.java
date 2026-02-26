public class stacks{
    private int nElems;
    private int arrsize;
    private int top;
    private int[] arr;

    public stacks(int arrsize){
        this.arrsize = arrsize;
        this.arr = new int[arrsize];
        nElems = 0;
        top = -1;
    }

    public boolean isfull(){
        if(top == arrsize -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isempty(){
        if(nElems == 0){
            return true;
        }else{
            return false;
        }
    }

    public void push(int num){
        if(!isfull()){
            arr[++top] = num;
            nElems++;
        }else{
            System.out.println("the Array is Full");
        }
    }

    public int pop(){
        if(!isempty()){

            int temp = top;
            top--;
            nElems--;
            return arr[temp];

        }else{

            return -1;

        }
    }

    public void displayData(){
        System.out.println("Number of element in the array is " + nElems);
        System.out.println("");
        System.out.println("Elements on Array");

        for(int i = 0 ; i <= top ; i++ ){
            System.out.println(i + "st: " + arr[i]);
        }
    }
}
