package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearVehiculo(Vehiculo veh) {
        controlPersis.crearVehiculo(veh);
    }
    
    public List<Vehiculo> traerVehiculos(){
        return controlPersis.traerVehiculos();
    }

    public void borrarVehiculo(int id) {
        controlPersis.borrarVehiculo(id);
    }
}
