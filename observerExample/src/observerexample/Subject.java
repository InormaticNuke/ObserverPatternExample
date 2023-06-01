package observerexample;

public interface Subject {
    
    public void attach(IEstadoCredito observador);
    public void dettach(IEstadoCredito observador);
    public void notificacionObservadores();
    
}
