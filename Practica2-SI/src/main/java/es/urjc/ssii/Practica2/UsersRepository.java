package es.urjc.ssii.Practica2;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users,Long> {

	List<Users> findByNombre(String Nombre);

}
