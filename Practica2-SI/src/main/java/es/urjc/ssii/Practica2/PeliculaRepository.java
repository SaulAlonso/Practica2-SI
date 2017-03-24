package es.urjc.ssii.Practica2;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PeliculaRepository extends CrudRepository<Pelicula, Long> {

	List<Pelicula> findByTitulo(String titulo);
	
}
