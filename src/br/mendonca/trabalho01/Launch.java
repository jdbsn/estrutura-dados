package br.mendonca.trabalho01;

import br.mendonca.trabalho01.estrutura.JoaoNetoEstrutura;
import br.mendonca.trabalho01.tads.JoaoNetoTAD;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  JoaoNetoTAD jntad;
	  JoaoNetoEstrutura estrutura = new JoaoNetoEstrutura(10);
	  
	  for(int i = 0; i < 3; i++) {
	    estrutura.inserirNoFim(new JoaoNetoTAD());
	  }
	  
	  System.out.println(estrutura.print());
	  
	  System.out.println("--------------------------------------------------");
	  
	  estrutura.inserirNoInicio(new JoaoNetoTAD());
	  
	  System.out.println(estrutura.print());
	  
//	  int quantidade = 4;
//	  int lista[] = new int[5];
//	  lista[0] = 2;
//	  lista[1] = 3;
//	  lista[2] = 4;
//	  lista[3] = 5;
//	  // [2,3,4,5, ]
//	  for(int i = quantidade; i > 0 ; i--) {
//	      lista[i] = lista[i - 1];
//	  }
//	  lista[0] = 1;
//	  
//	  for (int i = 0; i < lista.length; i++) {
//	    System.out.println(lista[i]);
//        
//      }
	  
	}

}
