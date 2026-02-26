public class queues{
    private int nElems;
    private int arrsize;
    private int front;
    private int end;
    private int[] arr;

    public queues(int arrsize){
        this.arrsize = arrsize;
        this.arr = new int[arrsize];
        nElems = 0;
        front = 0;
        end = -1;
    }

    public boolean isfull(){
        if(end == arrsize -1){
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

    public void enqueue(int num){
        if(!isfull()){
            arr[++end] = num;
            nElems++;
        }else{
            System.out.println("the Array is Full");
        }
    }

    public int dequeue(){
        if(!isempty()){

            int temp = front;
            front++;
            nElems--;
            return arr[temp];

        }else{

            return -1;

        }
    }

    public void displayData(){
        System.out.println("First element in the array is at " + front + " and equal to " + arr[front]);
        System.out.println("Last element in the array is at " + end + " and equal to " + arr[end]);
        System.out.println("Number of element in the array is " + nElems);
        System.out.println("");
        System.out.println("Elements on Array");

        for(int i = front ; i <= end ; i++ ){
            System.out.println(i + "st: " + arr[i]);
        }
    }
}
