public class Merge{
  public static void doMerge(int array[], int p, int r){
    if(p >= r){
      return;
    }     
    int q = (int) Math.floor((p + r)/2);
    System.out.println("INDICE = " + p + "\nFinal = " + r + "\nBase = " + q);
    doMerge(array, p, q);
    doMerge(array, q + 1, r);
    doIntercalar(array, p, q, r);
  }
  public static void doIntercalar(int array[], int p, int q, int r){
    System.out.println("INTERCALOU!!!");
    int n1 = q - p;
    int n2 = r - q;
    int first[] = new int[n1];
    int second[] = new int[n2];
    int i, j, k;
    for(i = 0; i < n1; i++){
      first[i] = array[p + i - 1];
    }
    for(j = 0; j < n2; j++){
      second[j] = array[q + j];
    }
    first[n1 + 1] = 999999;
    second[n2 + 1] = 999999;
    i = 1;
    j = 1;
    for(k = 0; k < r; k++){
      if(first[i] <= second[i]){
        array[k] = first[i];
        i++; 
      }else{
        array[k] = second[j];
        j++; 
      }
    }
  }
}
