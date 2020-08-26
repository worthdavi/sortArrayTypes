class Main {
  public static void main(String[] args) {
    long startingTime = System.currentTimeMillis();
  
    // Functions
    int[] array = {1, 5, 9, 6, 2, 4, 0, 7, 10, 11, 15};
    Insertion obj = new Insertion();
    obj.doInsertion(array);
    for(int i = 0; i < array.length; i++){
      System.out.println("[" + i + "] ");
    }

    long finishTime = System.currentTimeMillis() - startingTime;
    System.out.println("Tempo gasto: " + finishTime);
  }
}