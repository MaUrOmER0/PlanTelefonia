package plantelefonia;
import javax.sound.midi.MidiSystem;

import modelo.*;




public class PlanTelefonia {

  
  public static void main(String[] args) {
    
  Modelo miplan = new Modelo();
  miplan.setNumeroCel(312565);
  miplan.setMinutos(3);
  miplan.setOperador("Movil-lujo");
  

  System.out.println("El numero de celular es " + miplan.getNumeroCelular() + "El saldo total es de : " + miplan.calcularPago());






    
  }
  
}
