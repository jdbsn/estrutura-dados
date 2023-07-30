package br.mendonca.trabalho05;

import br.mendonca.trabalho05.estruturas.JoaoNetoEstrutura;
import br.mendonca.trabalho05.tads.JoaoNetoTAD;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  JoaoNetoEstrutura pilha = new JoaoNetoEstrutura(5);
	  JoaoNetoTAD jntad = new JoaoNetoTAD();
	  
	  for(int i = 0; i<10; i++) {
	    jntad = new JoaoNetoTAD();
	    System.out.println("Elemento adicionado: " + jntad.print());
	    pilha.push(jntad);
	  }
	  
	  System.out.println(pilha.print());
	  
	  jntad = (JoaoNetoTAD) pilha.pop();
	  System.out.println("Elemento retirado: " + jntad.print());
	  
	  System.out.println(pilha.print());
	  JoaoNetoTAD[] list = (JoaoNetoTAD[]) pilha.getLista();
	  
	  System.out.println(pilha.getQuantidade());
	  
	  System.out.println(pilha.get(0).print());
	  
	  pilha.pop();
	  pilha.pop();
	  pilha.pop();
	  pilha.pop();
	  
	  System.out.println("Pilha vazia: " + pilha.print());
	  
	  pilha.pop();
	  System.out.println(pilha.getQuantidade());
	  
	}

}
