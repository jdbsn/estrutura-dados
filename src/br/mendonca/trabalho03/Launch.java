package br.mendonca.trabalho03;

import br.mendonca.trabalho03.estruturas.JoaoNetoEstrutura;
import br.mendonca.trabalho03.tads.JoaoNetoTAD;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    JoaoNetoEstrutura fila = new JoaoNetoEstrutura(5);
	    JoaoNetoTAD jntad;
	    
	    for(int i = 0; i < 5; i++) {
	      jntad = new JoaoNetoTAD();
	      System.out.println("Elemento adicionado: " + jntad.print());
	      fila.enqueue(jntad);
	    }
	    
	    System.out.println(fila.print());
	    
	    System.out.println("Elemento 3: " + fila.get(2).print());
	  
	    fila.enqueue(new JoaoNetoTAD());
	    
	    JoaoNetoTAD excluido = (JoaoNetoTAD) fila.dequeue();
	    System.out.println("Elemento excluido: " + excluido.print());
	    
	    System.out.println(fila.getQuantidade());
	    
	    System.out.println(fila.print());
	    
        jntad = new JoaoNetoTAD();
        System.out.println("Elemento adicionado: " + jntad.print());
        fila.enqueue(jntad);
        
        System.out.println(fila.print());
        
        excluido = (JoaoNetoTAD) fila.dequeue();
        System.out.println("Elemento excluido: " + excluido.print());
        
        System.out.println(fila.print());
	    
        excluido = (JoaoNetoTAD) fila.dequeue();
        excluido = (JoaoNetoTAD) fila.dequeue();
        excluido = (JoaoNetoTAD) fila.dequeue();
        
        System.out.println(fila.print());
        
        jntad = new JoaoNetoTAD();
        System.out.println("Elemento adicionado: " + jntad.print());
        fila.enqueue(jntad);
        
        System.out.println(fila.print());
        
        excluido = (JoaoNetoTAD) fila.dequeue();
        excluido = (JoaoNetoTAD) fila.dequeue();
        
        System.out.println(fila.print());
        
        jntad = new JoaoNetoTAD();
        System.out.println("Elemento adicionado: " + jntad.print());
        fila.enqueue(jntad);
        
        System.out.println(fila.print());
        System.out.println(fila.getQuantidade());
        
        excluido = (JoaoNetoTAD) fila.dequeue();
        excluido = (JoaoNetoTAD) fila.dequeue();
        
        System.out.println(fila.print());
        System.out.println(fila.getQuantidade());
        
	}

}
