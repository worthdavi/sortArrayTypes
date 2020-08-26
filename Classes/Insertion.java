public class Insertion{
  public static int[] doInsertion(int vetor[]){
    int size = vetor.length;
    for(int i = 0; i < size; i++){
      int key = vetor[i];
      int j = i - 1;
      while((j >= 0) && (vetor[j] > key)){
        vetor[j + 1] = vetor[j];
        j--;
      }
      vetor[j + 1] = key;
    }
    return vetor;
  }
}