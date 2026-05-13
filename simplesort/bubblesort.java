public class bubblesort {
  public static void bubbleSort(int[] arr) {
    int size = arr.length;
    for (int i = 0; i < size - 1; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1);
        }
      }
    }
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
    int[] arr1 = { 33, 55, 35, 357, 47, 245, 888, 999, 23, 466, 7 };

    bubbleSort(arr1);

    for (int k = 0; k < arr1.length; k++) {
      System.out.print(arr1[k] + " ");
    }
  }
}
