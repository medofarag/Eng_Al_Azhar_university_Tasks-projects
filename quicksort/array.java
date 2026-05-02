public class array {
  private int size;
  private int nElems;
  private int[] numbers;

  public array(int size) {
    this.size = size;
    this.nElems = 0;
    numbers = new int[size];
  }

  public boolean isEmpty() {
    if (nElems == 0) {
      return true;
    }
    return false;
  }

  public boolean isFull() {
    if (nElems == size) {
      return true;
    }
    return false;
  }

  public void add(int num) {
    if (isFull()) {
      System.out.println("the array is full");
      return;
    }

    numbers[nElems] = num;
    nElems++;

  }

  public void sort() {
    if (isEmpty()) {
      System.out.println("the array is full");
      return;
    }
    quicksort(0, nElems - 1);
  }

  private void quicksort(int low, int high) {
    if (low >= high) {
      return;
    }
    int pivotindex = partion(low, high);

    quicksort(low, pivotindex - 1);
    quicksort(pivotindex + 1, high);
  }

  private int partion(int low, int high) {
    int pivot = numbers[high];

    int i = low - 1;

    for (int j = low; j < high; j++) {
      if (numbers[j] <= pivot) {
        i++;
        swap(i, j);
      }
    }
    swap(i + 1, high);
    return i + 1;
  }

  private void swap(int a, int b) {
    int temp = numbers[a];
    numbers[a] = numbers[b];
    numbers[b] = temp;
  }

  public void display() {
    for (int i = 0; i < nElems; i++) {
      System.out.println(numbers[i]);
    }
  }
}
