package es.urjc.ssii.Practica2;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario,Long> {

	List<Usuario> findByNombre(String Nombre);

}
