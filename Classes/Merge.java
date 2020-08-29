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
    for(int i = 0; i < first.length; i++){
      first[i] = array[p + i - 1];
      for(int j = 0; j < second.length; j++){
        second[j] = array[q + j];
        // first[n1 + 1] = inf;
        // second[n2 + 1] = inf; não sei oq eh isso aqui do slide 
        i = 1;
        j = 1;
        for(int k = 0; k < r; k++){
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
  }
}
