package observerexample;

public class ObservadorCliente implements IEstadoCredito {
    
    @Override
    public void update(){
        System.out.println("Updated example, shouted Client");
    }
    
}
