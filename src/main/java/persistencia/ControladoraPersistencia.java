package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Vehiculo;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
     VehiculoJpaController vehJpa = new VehiculoJpaController();
     
     public void crearVehiculo(Vehiculo veh){
         vehJpa.create(veh);
     }
     
     public List<Vehiculo> traerVehiculos() {
         return vehJpa.findVehiculoEntities();
     }

    public void borrarVehiculo(int id) {
         try {
             vehJpa.destroy(id);
         } catch (NonexistentEntityException ex) {
             Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
}
