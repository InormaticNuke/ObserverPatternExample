package observerexample;

public class ObservadorEjecutivo implements IEstadoCredito {
    
    @Override
    public void update(){
        System.out.println("Updated example, shouted Executive");
    }
    
}
