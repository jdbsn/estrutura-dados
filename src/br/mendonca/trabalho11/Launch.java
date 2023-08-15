package br.mendonca.trabalho11;

import br.mendonca.trabalho11.estruturas.JoaoNetoEstrutura;
import br.mendonca.trabalho11.sorts.JoaoNetoSort;
import br.mendonca.trabalho11.tads.JoaoNetoTAD;

public class Launch {

	public static void main(String[] args) {
      JoaoNetoEstrutura lista = new JoaoNetoEstrutura(100);
      JoaoNetoSort sort = new JoaoNetoSort();
      
      for (int i = 0; i < 10; i++) {
        lista.inserirNoFim(new JoaoNetoTAD());
      }
      
      System.out.println(lista.print());
      
      System.out.println(lista.getQuantidade());
      
      sort.bubble(lista);
      
      System.out.println(lista.print());

	}

}
