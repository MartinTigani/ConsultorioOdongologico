
package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Martin
 */
@Entity
public class Turno implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idTurno;
    
    @Temporal(TemporalType.DATE)
    private Date fechaTutno;
    private String horaTurno;
    
    @ManyToOne
    @JoinColumn(name="id_turno")
    private Odontologo odonto;
    
    @ManyToOne
    @JoinColumn(name="id_Turno2")
    private Paciente pacien;

    public Turno() {
    }

    public Turno(int idTurno, Date fechaTutno, String horaTurno) {
        this.idTurno = idTurno;
        this.fechaTutno = fechaTutno;
        this.horaTurno = horaTurno;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public Date getFechaTutno() {
        return fechaTutno;
    }

    public void setFechaTutno(Date fechaTutno) {
        this.fechaTutno = fechaTutno;
    }

    public String getHoraTurno() {
        return horaTurno;
    }

    public void setHoraTurno(String horaTurno) {
        this.horaTurno = horaTurno;
    }
    
}
