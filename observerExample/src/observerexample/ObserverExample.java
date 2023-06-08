package observerexample;

public class ObserverExample {

    public static void main(String[] args) {
        
        AlarmaEstadoCredito alarma = new AlarmaEstadoCredito();
        
        alarma.attach(new ObservadorCliente());
        
        alarma.attach(new ObservadorEjecutivo());
        
        alarma.attach(new ObservadorExtra1());
        
        alarma.attach(new ObservadorExtra2());
        
        alarma.attach(new ObservadorExtra3());
        
        alarma.attach(new ObservadorExtra4());
        
        Supervisor sup = new Supervisor();
        
        Credito c = new Credito();
        
        c.setEstadoCredito("Rechazado");
        
        sup.EvaluaCredito(c);
        
    }
    
}
