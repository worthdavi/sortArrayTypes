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
      int aux = array[i];
      array[i] = array[maior];
      array[maior] = aux;
      doMaxHeapify(array, n, maior);
    }
  }
  public static void buildMaxHeap(int array[], int n){
    for(int i = (int) Math.floor(n/2); i >= 0; i--){
      doMaxHeapify(array, n, i);
    }
  }
  public static void doHeapSort(int array[], int n){
    buildMaxHeap(array, n);
    int m = n;
    for(int i = n; i >= 1; i--){
      int aux = array[0];
      array[0] = array[i];
      array[i] = aux;
      m = m - 1;
      doMaxHeapify(array, m, 0);
    }
  }
}