package observerexample;
import java.util.ArrayList;

public class AlarmaEstadoCredito implements Subject{
    
    private static ArrayList<IEstadoCredito> observadores = new ArrayList<IEstadoCredito>;

    @Override
    public void attach(IEstadoCredito observador) {
        
        observadores.add(observador);
        
    }

    @Override
    public void dettach(IEstadoCredito observador) {
        
        observadores.remove(observador);
    }

    @Override
    public void notificacionObservadores() {
        for (int i=0; i <observadores.size(); i++){
            observadores
        }
    }
    
    
    
}
