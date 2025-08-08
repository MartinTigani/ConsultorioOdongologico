package logica;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Odontologo;
import logica.Paciente;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2025-08-07T01:13:36")
@StaticMetamodel(Turno.class)
public class Turno_ { 

    public static volatile SingularAttribute<Turno, Odontologo> odonto;
    public static volatile SingularAttribute<Turno, Paciente> pacien;
    public static volatile SingularAttribute<Turno, Date> fechaTutno;
    public static volatile SingularAttribute<Turno, Integer> idTurno;
    public static volatile SingularAttribute<Turno, String> horaTurno;

}