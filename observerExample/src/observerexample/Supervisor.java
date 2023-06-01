package observerexample;

public class Supervisor {
    
    public void EvaluaCredito(Credito c){
        if (c.getEstadoCredito().equals("Rechazado")){
            
            AlarmaEstadoCredito alarma = new AlarmaEstadoCredito();
            alarma.notificacionObservadores();
        }
    }
    
}
