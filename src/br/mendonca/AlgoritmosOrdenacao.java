package br.mendonca;

public class AlgoritmosOrdenacao {

  public static void bubbleSort(int[] lista) {
    int fim = lista.length;
    int continua = 0;
    int aux;
    
    do {
      continua = 0;
      for (int i = 1; i < fim; i++) {
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
  
  public static void selectionSort(int[] lista) {
    int menor;
    int aux;
    
    for(int i = 0; i < lista.length; i++) {
      menor = i;
      for(int j = i+1; j < lista.length; j++) {
        if(lista[j] < lista[menor]) {
          menor = j;
        }
      }
      if(i != menor) {
        aux = lista[i];
        lista[i] = lista[menor];
        lista[menor] = aux;
      }
    }
  }
  
  public static void merger(int[] lista, int inicio, int fim) {
    if(inicio < fim) {
      int meio = (inicio + fim) / 2;
      merger(lista, inicio, meio);
      merger(lista, meio + 1, fim);
      mergerSort(lista, inicio, meio, fim);
    }

  }
  
  public static void mergerSort(int[] lista, int inicio, int meio, int fim) {
    boolean fim1 = false;
    boolean fim2 = false;
    
    int p1 = inicio;
    int p2 = meio + 1;
    int tamanho = fim - inicio + 1;

    int[] aux = new int[tamanho];

    for (int i = 0; i < aux.length; i++) { 
      if(!fim1 && !fim2) {
        if(lista[p1] < lista[p2]) {
          aux[i] = lista[p1++];
        } else {
          aux[i] = lista[p2++];
        }
        if(p1 > meio) fim1 = true;
        if(p2 > fim) fim2 = true;
      } else {
        if(!fim1) {
          aux[i] = lista[p1++];
        } else {
          aux[i] = lista[p2++];
        }
      }
    }
    
    for (int i = 0, j = inicio; i < tamanho; i++, j++) {
      lista[j] = aux[i];
    }
    
  }
  
  public static void main(String[] args) {
    int[] lista = {3,1,4,5,2,1};
    merger(lista, 0, lista.length - 1);
    
    for (int i = 0; i < lista.length; i++) {
      System.out.println(lista[i]);
    }
    
  }
  
}
