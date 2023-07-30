import br.mendonca.trabalho03.ITAD;

public class PilhaDinamica {

  private ElementoPilha topo;
  private int quantidade = 0;
  
  public String getAluno() {
    return "João de Barros e Silva Neto";
  }

  public int getQuantidade() {
    return quantidade;
  }
  
  public void push(ITAD tad) {
    ElementoPilha elemento = new ElementoPilha(tad);
    
    elemento.setNext(topo);
    topo = elemento;

    quantidade++;
  }
  
  public void pop() {
    if(topo == null) return;
    
    topo = topo.getNext();
    quantidade--;
  }
  
  public ITAD get() {
    return topo.getItad();
  }
  
  public String print() {
    StringBuilder texto = new StringBuilder();
    
    ElementoPilha atual = topo;
    
    for(int i = 1; i <= quantidade; i++) {
      texto.append("\n" + i + ". " + atual.getItad().print());
      atual = atual.getNext();
    }
    
    return texto.toString();
  }
  
}
