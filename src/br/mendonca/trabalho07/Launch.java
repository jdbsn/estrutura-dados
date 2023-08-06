package br.mendonca.trabalho07;

import br.mendonca.trabalho07.estruturas.JoaoNetoEstrutura;
import br.mendonca.trabalho07.tads.JoaoNetoTAD;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  JoaoNetoEstrutura listadupla = new JoaoNetoEstrutura();
	  
	  JoaoNetoTAD tad;

	  JoaoNetoTAD removido = (JoaoNetoTAD) listadupla.removerNoInicio();
	  System.out.println("Lista vazia - " + listadupla.print());
	  System.out.println("-------------------------------------------------------------------------------------------------------");
	  
      removido = (JoaoNetoTAD) listadupla.removerNoMeio(1);
      System.out.println("Elemento remvoido - " + removido);
      
      System.out.println("-------------------------------------------------------------------------------------------------------");
	  
	  System.out.println("4 elementos adicionados:");
	  for(int i =0; i<4; i++) {
	    tad = new JoaoNetoTAD();
	    System.out.println(tad.print());
	    listadupla.inserirNoFim(tad);
	  }
	  
	  System.out.println("-------------------------------------------------------------------------------------------------------");
	  System.out.println(listadupla.print());
	  System.out.println("-------------------------------------------------------------------------------------------------------");
	  
      String msg = listadupla.get(0) == null ? "Não existe" : listadupla.get(0).print();
      System.out.println("Elemento na posição 1 - " + msg);
      System.out.println("-------------------------------------------------------------------------------------------------------");
	  
	  tad = new JoaoNetoTAD();
	  System.out.println("Novo elemento na posição 2 - " + tad.print());
	  listadupla.inserirNoMeio(tad, 1);
	  System.out.println(listadupla.print());
	  
	  System.out.println("-------------------------------------------------------------------------------------------------------");
	  
	  removido = (JoaoNetoTAD) listadupla.removerNoInicio();
	  System.out.println("Elemento removido - " + removido.print());
	  System.out.println(listadupla.print());
	  
	  System.out.println("-------------------------------------------------------------------------------------------------------");
	  
	  for(int i = 0; i < 4; i++) {
	    removido = (JoaoNetoTAD) listadupla.removerNoInicio();
	    System.out.println("Elemento removido - " + removido.print());
	  }
	  
	  System.out.println("Lista vazia - " + listadupla.print());
	  
	  System.out.println("-------------------------------------------------------------------------------------------------------");
	  
	  System.out.println("3 elementos adicionados:");
      for(int i =0; i<3; i++) {
        tad = new JoaoNetoTAD();
        System.out.println(tad.print());
        listadupla.inserirNoIncio(tad);
      }
      
      System.out.println(listadupla.print());
      
      removido = (JoaoNetoTAD) listadupla.removerNoMeio(2);
      System.out.println("Elemento remvoido - " + removido);
      
      System.out.println(listadupla.print());
      System.out.println("Quantidade - " + listadupla.getQuantidade());
	  
	}

}
