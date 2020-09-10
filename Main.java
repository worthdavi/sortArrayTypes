class Main {
  public static void main(String[] args) {
    long startingTime = System.currentTimeMillis();
  
    // Functions
    ArrayCreator aCreator = new ArrayCreator();
    int array[] = aCreator.createArray(10000); // Criando array com X posições
    aCreator.insertDecrease(array, 0, 10000); // Preenchendo com números de X a Y

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
    // h_obj.doHeapSort(array, 10000-1);
    // Funcionando!

    // Classe de quickSort
    // Quick q_obj = new Quick();
    // q_obj.doQuickSort(array, 0, 10000-1);
    // Funcionando!

    long finishTime = System.currentTimeMillis() - startingTime;   
    aCreator.printArray(array);
    System.out.println("Tempo gasto: " + finishTime + "ms");
  }
}