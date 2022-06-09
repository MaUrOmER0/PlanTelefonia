package modelo;
public class Modelo {
    
    
    public static final int COSTO_MINUTOS = 200 ;
    private int minutos;
    private long numeroCelular;
    private String operador;
    

    //-------
    //Metodos
    //--------
    public Modelo(){
        
    }
    public Modelo(int numeroCelular,int minutos,String operador) {
        
        this.numeroCelular = numeroCelular;
        this.minutos = minutos;
        this.operador = operador;
    }
    public Modelo(Modelo f) {
        minutos = f.getMinutos();
        numeroCelular = f.getNumeroCelular();
        operador = f.getOperador();

    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public long getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCel(long numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
    
    

    public double calcularPago() {

        double pagoTotal = COSTO_MINUTOS * minutos;
       
        
        if(operador.equals("Movil-lujo")) {
            
            pagoTotal = pagoTotal * 0.5;
            
        }
       
        return pagoTotal;

       
        //public String toString() {
            //return "El pago total seria de: " + pagoTotal;
        //}


        
    }
}

