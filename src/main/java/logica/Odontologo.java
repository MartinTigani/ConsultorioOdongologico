
package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


/**
 *
 * @author Martin
 */
@Entity
public class Odontologo extends Persona implements Serializable{
    private String especialidad;
    @OneToOne
    private Horario unHorario;
    @OneToMany(mappedBy="odonto")
    private List<Turno>listaTurnos;
    @OneToOne
    private Usuario unUsuario;

    public Odontologo() {
    }

    public Odontologo(String especialidad, Horario unHorario, List<Turno> listaTurnos, Usuario unUsuario, int id, String dni, String nombre, String apellido, Date fechaNac, String telefono, String direccion) {
        super(id, dni, nombre, apellido, fechaNac, telefono, direccion);
        this.especialidad = especialidad;
        this.unHorario = unHorario;
        this.listaTurnos = listaTurnos;
        this.unUsuario = unUsuario;
    }

    

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Horario getUnHorario() {
        return unHorario;
    }

    public void setUnHorario(Horario unHorario) {
        this.unHorario = unHorario;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }
    
    
    
}
