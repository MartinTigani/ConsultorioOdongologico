
package logica;

import Persistencia.ControladoraPersistencia;

/**
 *
 * @author Martin
 */
public class ControladoraLogica {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearUsuario(String nombre, String contrasenia, String rol) {
        Usuario usu = new Usuario();
        usu.setNombreUsuario(nombre);
        usu.setContrasenia(contrasenia);
        usu.setRol(rol);
        controlPersis.crearUsuario(usu);
    }
}
