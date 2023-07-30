import br.mendonca.trabalho03.ITAD;
import br.mendonca.trabalho03.tads.JoaoNetoTAD;

public class ElementoPilha {

  ElementoPilha proximo;
  JoaoNetoTAD tad;
  
  public ElementoPilha(ITAD itad) {
    super();
    this.tad = (JoaoNetoTAD) itad;
  }

  public ITAD getItad() {
    return (ITAD) tad;
  }

  public void setItad(ITAD itad) {
    this.tad = (JoaoNetoTAD) itad;
  }

  public ElementoPilha getNext() {
    return proximo;
  }

  public void setNext(ElementoPilha next) {
    this.proximo = next;
  }
  
}
