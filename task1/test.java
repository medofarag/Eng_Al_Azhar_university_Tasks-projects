public class test{
    public static void main(String[] args){


        queues array = new queues(20);

        array.enqueue(8);
        array.enqueue(7);
        array.enqueue(8);
        array.enqueue(60);
        array.enqueue(70);
        array.enqueue(60);
        array.enqueue(30);
        array.enqueue(54);
        array.enqueue(0);
        array.enqueue(30);
        array.enqueue(90);
        array.enqueue(4444);
        array.enqueue(30);
        array.enqueue(32);
        array.enqueue(23);
        array.enqueue(14);
        array.enqueue(30);
        array.enqueue(98);
        array.enqueue(878);
        array.enqueue(56);
        array.enqueue(34);
        array.enqueue(3760);
        array.enqueue(987);
        array.enqueue(234);
        array.enqueue(80);

        array.displayData();

        array.dequeue();
        array.dequeue();
        array.dequeue();
        array.dequeue();
        array.dequeue();
        array.dequeue();

        array.displayData();
    }
}
