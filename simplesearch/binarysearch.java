public class binarysearch{
    public static int search(int[] arr, int target){
        int left = 0;
        int right = arr.length -1;
        int result = -1;
        while(left <= right){
            int mid = (right + left)/2 ;

            if(target == arr[mid]){
                result = mid;
                break;
            }
            if(target > arr[mid]){
                left = mid + 1;
            }
            if(target < arr[mid]){
                right = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args){
       int[] arr = {14 , 16 , 18 , 20 , 88 , 90 , 100 , 110 , 645 , 958 , 6666};
       int target = 543;

       System.out.println(search(arr,target));
       System.out.println(search(arr,88));
       System.out.println(search(arr,645));
       System.out.println(search(arr,15));
       System.out.println(search(arr,6666));
    }
}
