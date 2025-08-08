
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
    private Date fechaTurno;
    private String horaTurno;
    
    @ManyToOne
    @JoinColumn(name="id_odonto")
    private Odontologo odonto;
    
    @ManyToOne
    @JoinColumn(name="id_pacien")
    private Paciente pacien;

    public Turno() {
    }

    public Turno(int idTurno, Date fechaTurno, String horaTurno) {
        this.idTurno = idTurno;
        this.fechaTurno = fechaTurno;
        this.horaTurno = horaTurno;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public Date getFechaTutno() {
        return fechaTurno;
    }

    public void setFechaTutno(Date fechaTutno) {
        this.fechaTurno = fechaTutno;
    }

    public String getHoraTurno() {
        return horaTurno;
    }

    public void setHoraTurno(String horaTurno) {
        this.horaTurno = horaTurno;
    }
    
}
