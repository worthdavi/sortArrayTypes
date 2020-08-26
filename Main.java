class Main {
  public static void main(String[] args) {
    long startingTime = System.currentTimeMillis();
  
    // Functions
    ArrayCreator aCreator = new ArrayCreator();
    // Criando array de 10000 posições e inserindo números de 0 a 10000
    int array[] = aCreator.createArray(10000);
    aCreator.insertIncrease(array, 0, 10000);
    aCreator.printArray(array);

    // Classe de insertSort
    Insertion obj = new Insertion();
    // obj.doInsertion(array);


    long finishTime = System.currentTimeMillis() - startingTime;
    System.out.println("Tempo gasto: " + finishTime + "ms");
  }
}