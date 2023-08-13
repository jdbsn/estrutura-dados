package br.mendonca;

public class AlgoritmosBusca {

  public int buscaLinear(int[] lista, int valor) {
    for (int i = 0; i < lista.length; i++) {
      if(lista[i] == valor) return i;
    }
    return -1;
  }
  
  public int buscaOrdenada(int[] lista, int valor) {

    for (int i = 0; i < lista.length; i++) {
      if(valor == lista[i]) {
        return i;
      } else {
        if(valor < lista[i]) return -1;
      }
    }
    
    return -1;
  }
  
  public int buscaBinaria(int[] lista, int valor) {
    int inicio = 0;
    int meio;
    int fim = lista.length - 1;
    
    while(inicio <= fim) {
      meio = (inicio + fim) / 2;
      if(valor < lista[meio]) {
        fim = meio - 1;
      } else {
        if(valor > lista[meio]) {
          fim = meio + 1;
        } else {
          return meio;
        }
      }
    }
      
    return -1;
  }
  
}
