
package logica;

import java.util.Date;
import javax.persistence.Entity;


/**
 *
 * @author Martin
 */
@Entity
public class Responsable extends Persona{
    private String parentesco;

    public Responsable() {
    }

    public Responsable(String parentesco, int id, String dni, String nombre, String apellido, Date fechaNac, String telefono, String direccion) {
        super(id, dni, nombre, apellido, fechaNac, telefono, direccion);
        this.parentesco = parentesco;
    }


    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
    
    
}
