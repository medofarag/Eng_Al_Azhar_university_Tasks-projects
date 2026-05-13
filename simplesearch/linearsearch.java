public class linearsearch{
    public static int search(int[] arr, int target){
        int result = -1; // init value
        for(int i = 0 ; i < arr.length ; i++){
            if(target == arr[i]){
                result = i;
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args){

        int[] arr = {12 , 23 , 45 , 66 , 687 , 6756 , 88 , 788};
        int target = 99;
        int tar = 90;
        int targ = 687;
        int targe = 23;

        System.out.println(search(arr,target));
        System.out.println(search(arr,tar));
        System.out.println(search(arr,targ));
        System.out.println(search(arr,targe));
    }
}

