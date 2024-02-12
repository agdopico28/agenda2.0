package agenda.servicios;

import agenda.entidades.Contacto;

import java.util.List;

public interface ContactoService {
    List<Contacto> obtenerTodos();
    Contacto obtenerPorId(Long id);
    Contacto guardar(Contacto contacto);
    void eliminar(Long id);
    Contacto modificarContacto(Long id, Contacto contacto);
}
