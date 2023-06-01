package observerexample;

public class Supervisor {
    
    public void EvaluaCredito(Credito c){
        if (c.getEstado_Credito().equals("Rechazado")){
            
            AlarmaEstadoCredito alarma = new AlarmaEstadoCredito();
            alarma.notificacionObservadores();
        }
    }
    
}
