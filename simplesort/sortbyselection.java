public class sortbyselection {
  public static void selectionsort(int[] arr) {
    int size = arr.length;
    for (int i = 0; i < size; i++) {
      int IndexOfmin = min(arr, i, size - 1);
      swap(arr, IndexOfmin, i);
    }
  }

  public static int min(int[] arr, int start, int end) {
    int indexOfMin = start;
    for (int j = start + 1; j <= end; j++) {
      if (arr[j] < arr[indexOfMin]) {
        indexOfMin = j;
      }
    }
    return indexOfMin;
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
    int[] arr = { 88, 55, 42, 104, 25, 963, 75, 421, 9563, 554, 127, 634, 4523, 5, 1, 27 };
    selectionsort(arr);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
