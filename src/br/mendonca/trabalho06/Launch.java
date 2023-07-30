package br.mendonca.trabalho06;

import br.mendonca.trabalho06.elementos.JoaoNetoElemento;
import br.mendonca.trabalho06.estruturas.JoaoNetoEstrutura;
import br.mendonca.trabalho06.tads.JoaoNetoTAD;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    JoaoNetoEstrutura pilha = new JoaoNetoEstrutura();
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
	    JoaoNetoElemento stack = (JoaoNetoElemento) pilha.getLista();
	    
	    System.out.println("Topo: " + stack.getItad().print());
	      
	    System.out.println(pilha.getQuantidade());
	      
	    System.out.println("Primeiro elemento: " + pilha.get(0).print());
	      
	    pilha.pop();
	    pilha.pop();
	    pilha.pop();
	    pilha.pop();
	      
	    System.out.println("Removido 4 elementos: " + pilha.print());
	    
	    System.out.println("Elemento 3: " + pilha.get(2).print());
	    
	    stack = (JoaoNetoElemento) pilha.getLista();
        
        System.out.println("Topo: " + stack.getItad().print());
        
	    System.out.println(pilha.getQuantidade());
	    
	    pilha.pop();
	    System.out.println(pilha.getQuantidade());
	    
	    pilha.pop();
	    pilha.pop();
	    pilha.pop();
	    pilha.pop();
	    
	    System.out.println(pilha.getQuantidade());
	    
	    pilha.pop();
	    pilha.pop();
	    pilha.pop();
	    pilha.pop();
	    pilha.pop();
	    
	    System.out.println("Após remover varias vezes: " + pilha.getQuantidade());
	    
	}

}
