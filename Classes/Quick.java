public class Quick{
  public static void doQuickSort(int array[], int p, int r){
    if(p < r){
      int q = Particione(array, p, r); 
      doQuickSort(array, p, q - 1); 
      doQuickSort(array, q + 1, r);
    }
  }
  public static int Particione(int array[], int p, int r){
    int x = array[r];
    int i = p - 1; 
    for(int j = p; j < r; j++){
      if(array[j] <= x){
        i = i + 1; 
        int aux = array[i]; 
        array[i] = array[j]; 
        array[j] = aux;
      }
    }
    int aux = array[i + 1];
    array[i + 1] = array[r]; 
    array[r] = aux;
    return i + 1;
  }
}