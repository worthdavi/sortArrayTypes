import java.util.Random;

public class ArrayCreator{
  public static int[] createArray(int size){
    int array[] = new int[size];
    return array;
  }
  public static int[] insertIncrease(int array[], int fromNumber, int toNumber){
    int nextInsert = fromNumber;
    for(int i = 0; i < array.length; i++){
      if (nextInsert < toNumber){
        array[i] = nextInsert;
        nextInsert += 1;
      }     
    }
    return array;
  }
  public static int[] insertDecrease(int array[], int fromNumber, int toNumber){
    int nextInsert = toNumber;
    for(int i = 0; i < array.length; i++){
      if (nextInsert > fromNumber){
        array[i] = nextInsert;
        nextInsert -= 1;
      }     
    }
    return array;
  }
  public static int[] insertRamdonly(int array[], int fromNumber, int toNumber){
    Random r = new Random();
    for(int i = 0; i < array.length; i++){
        array[i] = r.nextInt(toNumber) + 1;
      }    
    return array; 
  }
  public static void printArray(int array[]){
    for(int i = 0; i < array.length; i++){
      System.out.println("[" + array[i] + "]");
    }
  }
}