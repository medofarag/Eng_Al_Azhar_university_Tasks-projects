public class teststacks{
    public static void main(String[] args){
        stacks array = new stacks(15);

        array.push(54);
        array.push(64);
        array.push(78);
        array.push(6565);
        array.push(88);
        array.push(8884);
        array.push(88);
        array.push(6);
        array.push(98);
        array.push(567);
        array.push(90);
        array.push(324);
        array.push(14);
        array.push(23);
        array.push(76);
        array.push(89);
        array.push(58);
        array.push(31);

        array.displayData();

        array.pop();
        array.pop();
        array.pop();
        array.pop();
        array.pop();
        array.pop();

        array.displayData();
    }
}
