
package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author Martin
 */

@Entity
public class Horario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idHorario;
    private String horarioIni;
    private String horarioFin;

    public Horario() {
    }

    public Horario(int idHorario, String horarioIni, String horarioFin) {
        this.idHorario = idHorario;
        this.horarioIni = horarioIni;
        this.horarioFin = horarioFin;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public String getHorarioIni() {
        return horarioIni;
    }

    public void setHorarioIni(String horarioIni) {
        this.horarioIni = horarioIni;
    }

    public String getHorarioFin() {
        return horarioFin;
    }

    public void setHorarioFin(String horarioFin) {
        this.horarioFin = horarioFin;
    }
    
    
}
