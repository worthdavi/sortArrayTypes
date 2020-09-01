class Main {
  public static void main(String[] args) {
    long startingTime = System.currentTimeMillis();
  
    // Functions
    ArrayCreator aCreator = new ArrayCreator();
    int array[] = aCreator.createArray(100); // Criando array com X posições
    aCreator.insertRandomly(array, 0, 100); // Preenchendo com números de X a Y

    // Classe de insertSort
    // Insertion i_obj = new Insertion();
    // i_obj.doInsertion(array);
    // Funcionando!

    // Classe de mergeSort
    // Merge m_obj = new Merge();
    // m_obj.doMerge(array, 0, 99);
    // Dando erro!

    // Classe de heapSort
    // Heap h_obj = new Heap();
    // h_obj.doHeapSort(array, 100-1);
    // Funcionando!


    aCreator.printArray(array);
    long finishTime = System.currentTimeMillis() - startingTime;
    System.out.println("Tempo gasto: " + finishTime + "ms");
  }
}