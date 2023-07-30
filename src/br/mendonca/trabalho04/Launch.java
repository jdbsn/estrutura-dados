package br.mendonca.trabalho04;

import br.mendonca.trabalho04.elementos.JoaoNetoElemento;
import br.mendonca.trabalho04.estruturas.JoaoNetoEstrutura;
import br.mendonca.trabalho04.tads.JoaoNetoTAD;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  	    JoaoNetoEstrutura fila = new JoaoNetoEstrutura();
        JoaoNetoTAD jntad;
        
        for(int i = 0; i < 10; i++) {
          jntad = new JoaoNetoTAD();
          System.out.println("Elemento adicionado: " + jntad.print());
          fila.enqueue(jntad);
        }
        
        System.out.println(fila.print());
        
        JoaoNetoElemento tad = (JoaoNetoElemento) fila.getLista();
        
        System.out.println("Primeiro: " + tad.getItad().print());
        
        fila.dequeue();
        tad = (JoaoNetoElemento) fila.getLista();
        
        System.out.println("Primeiro: " + tad.getItad().print());
        System.out.println(fila.print());
        
        System.out.println(fila.getQuantidade());
        
        System.out.println("Elemento 6: " + fila.get(11).print());
        
//        
//        System.out.println("Elemento 3: " + fila.get(2).print());
//      
//        fila.enqueue(new JoaoNetoTAD());
//        
//        System.out.println(fila.print());
//        
//        JoaoNetoTAD excluido = (JoaoNetoTAD) fila.dequeue();
//        System.out.println("Elemento excluido: " + excluido.print());
//        
//        System.out.println(fila.getQuantidade());
//        
//        System.out.println(fila.print());
//        
//        jntad = new JoaoNetoTAD();
//        System.out.println("Elemento adicionado: " + jntad.print());
//        fila.enqueue(jntad);
//        
//        System.out.println(fila.print());
//        
//        excluido = (JoaoNetoTAD) fila.dequeue();
//        System.out.println("Elemento excluido: " + excluido.print());
//        
//        System.out.println(fila.print());
//        
//        excluido = (JoaoNetoTAD) fila.dequeue();
//        excluido = (JoaoNetoTAD) fila.dequeue();
//        excluido = (JoaoNetoTAD) fila.dequeue();
//        
//        System.out.println(fila.print());
//        
//        jntad = new JoaoNetoTAD();
//        System.out.println("Elemento adicionado: " + jntad.print());
//        fila.enqueue(jntad);
//        
//        System.out.println(fila.print());
//        
//        excluido = (JoaoNetoTAD) fila.dequeue();
//        excluido = (JoaoNetoTAD) fila.dequeue();
//        
//        System.out.println(fila.print());
//        
//        jntad = new JoaoNetoTAD();
//        System.out.println("Elemento adicionado: " + jntad.print());
//        fila.enqueue(jntad);
//        
//        System.out.println(fila.print());
//        
//        excluido = (JoaoNetoTAD) fila.dequeue();
//        excluido = (JoaoNetoTAD) fila.dequeue();
//        
//        System.out.println(fila.print());
//	  
	}

}
