package br.mendonca;

public class AlgoritmosOrdenacao {

  public void bubbleSort(int[] lista) {
    int fim = lista.length;
    int continua = 0;
    int aux;
    
    do {
      continua = 0;
      for (int i = 0; i < fim; i++) {
        if(lista[i] < lista[i-1]) {
          aux = lista[i];
          lista[i] = lista[i-1];
          lista[i-1] = aux;
          continua = i;
        }
      }
      fim--;
    } while (continua != 0);
  }
  
  public static void insertionSort(int[] lista) {
    // 5,2,8,1
    // 2,5,8,1
    // 
    for (int i = 0; i < lista.length; i++) {
      for (int j = i; j > 0; j--) {
        if(lista[j] < lista[j-1]) {
          int aux = lista[j-1];
          lista[j-1] = lista[j];
          lista[j] = aux;
        }
      }
    }
    
  }
  
  public static void main(String[] args) {
    int[] lista = {4,3,2,1,1,4};
    insertionSort(lista);
    
    for (int i = 0; i < lista.length; i++) {
      System.out.println(lista[i]);
    }
    
  }
  
}
