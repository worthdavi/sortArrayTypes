public class Heap{
  public static void doMaxHeapify(int array[], int n, int i){
    int e = (2*i);
    int d = (2*i)+1;
    int maior = i;
    if((e <= n )&&(array[e] > array[maior])){
        maior = e;
    }
    if((d <= n)&&(array[d] > array[maior])){
      maior = d;
    }
    if(maior != i){
      array[i] = array[maior];
      doMaxHeapify(array, n, maior);
    }
  }
  public static void buildMaxHeap(int array[], int n){
    for(int i = (int) Math.floor(n/2); i > 1; i--){
      doMaxHeapify(array, n, i);
    }
  }
  public static void doHeapSort(int array[], int n){
    buildMaxHeap(array, n);
    int m = n;
    for(int i = n; i > 2; i--){
      array[1] = array[i];
      m = m - 1;
      doMaxHeapify(array, m, 1);
    }
  }
}