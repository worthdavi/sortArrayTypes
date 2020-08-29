class Main {
  public static void main(String[] args) {
    long startingTime = System.currentTimeMillis();
  
    // Functions
    ArrayCreator aCreator = new ArrayCreator();
    int array[] = aCreator.createArray(100); // Criando array com X posições
    aCreator.insertRamdonly(array, 0, 99); // Preenchendo com números de X a Y
    aCreator.printArray(array); // Imprimindo array

    // Classe de insertSort
    // Insertion i_obj = new Insertion();
    // i_obj.doInsertion(array);

    // Classe de mergeSort
    Merge m_obj = new Merge();
    m_obj.doMerge(array, 0, 99);


    long finishTime = System.currentTimeMillis() - startingTime;
    System.out.println("Tempo gasto: " + finishTime + "ms");
  }
}