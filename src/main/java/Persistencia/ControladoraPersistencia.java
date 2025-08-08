
package Persistencia;

import logica.Usuario;

/**
 *
 * @author Martin
 */
public class ControladoraPersistencia {
    HorarioJpaController horarioJpa = new HorarioJpaController();
    OdontologoJpaController odongologoJpa = new OdontologoJpaController();
    PacienteJpaController pacienteJpa = new PacienteJpaController();
    PersonaJpaController personaJpa = new PersonaJpaController();
    ResponsableJpaController responasableJpa = new ResponsableJpaController();
    SecretarioJpaController secretarioJpa = new SecretarioJpaController();
    TurnoJpaController turnoJpa = new TurnoJpaController();
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();

    public void crearUsuario(Usuario usu) {
        usuarioJpa.create(usu);
    }
}
