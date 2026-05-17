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
      System.out.println("this array is Full");
      return;
    }

    numbers[nElems] = num;
    nElems++;
  }

  public void mergesort() {
    if (isEmpty()) {
      System.out.println("this array is Empty");
      return;
    }
    recmergesort(0, nElems - 1);
  }

  public void recmergesort(int low, int high) {
    if (low >= high) {
      return;
    }

    int middle = (low + high) / 2;

    recmergesort(low, middle);
    recmergesort(middle + 1, high);

    merge(low, middle, high);
  }

  private void merge(int low, int middle, int high) {
    int[] sorted = new int[high - low + 1];
    int i = low;
    int j = middle + 1;
    int k = 0;

    while (i <= middle && j <= high) {
      if (numbers[i] < numbers[j]) {
        sorted[k++] = numbers[i++];
      } else {
        sorted[k++] = numbers[j++];
      }
    }

    while (i <= middle) {
      sorted[k++] = numbers[i++];
    }

    while (j <= high) {
      sorted[k++] = numbers[j++];
    }

    k = 0;
    i = low;
    while (i <= high) {
      numbers[i++] = sorted[k++];
    }
  }

  public void display() {
    if (isEmpty()) {
      System.out.println("I can't print Empty array");
      return;
    }
    for (int i = 0; i < nElems; i++) {
      System.out.println("num" + i + " " + numbers[i]);
    }
  }
}
