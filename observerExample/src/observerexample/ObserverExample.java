package observerexample;

public class ObserverExample {

    public static void main(String[] args) {
        
        AlarmaEstadoCredito alarma = new AlarmaEstadoCredito();
        
        alarma.attach(new ObservadorCliente());
        
        alarma.attach(new ObservadorEjecutivo());
        
        Supervisor sup = new Supervisor();
        
        Credito c = new Credito();
        
        c.setEstadoCredito("Rechazado");
        
        sup.EvaluaCredito(c);
        
    }
    
}
