package br.mendonca.trabalho03.estruturas;

import br.mendonca.trabalho03.ITAD;
import br.mendonca.trabalho03.ITrabalho03;
import br.mendonca.trabalho03.tads.JoaoNetoTAD;

public class JoaoNetoEstrutura implements ITrabalho03 {

  private JoaoNetoTAD[] fila;
  private int quantidade = 0;
  private int inicio = 0;
  private int fim = 0;
  
  public JoaoNetoEstrutura(int tamanho) {
    this.fila = new JoaoNetoTAD[tamanho];
  }

  @Override
  public String getAluno() {
    return "João de Barros e Silva Neto";
  }

  @Override
  public int getQuantidade() {
    return quantidade;
  }

  @Override
  public Object[] getLista() {
    return fila;
  }

  @Override
  public void enqueue(ITAD tad) {
    if (quantidade == fila.length) return;
    
    fim = fim % fila.length;
    fila[fim] = (JoaoNetoTAD) tad;
    fim++;
    quantidade++;
  }

  @Override
  public ITAD dequeue() {
    if (quantidade == 0) return null;
    
    inicio = inicio % fila.length;
    JoaoNetoTAD item = fila[inicio];
    fila[inicio] = null;
    inicio++;
    quantidade--;
    
    return (ITAD) item;
  }

  @Override
  public ITAD get(int posicao) {
    if (posicao < 0 || posicao >= fila.length) return null;
    
    return (ITAD) fila[posicao];
  }

  @Override
  public String print() {
    StringBuilder texto = new StringBuilder();
    
    for (int i = 0; i < fila.length; i++) {
      if (fila[i] == null ) {
        texto.append("\n[" + (i + 1) + "] " + "NULL");
      } else {
        texto.append("\n[" + (i + 1) + "] " + fila[i].print());        
      }
    }
    
    return texto.toString();
  }

}
