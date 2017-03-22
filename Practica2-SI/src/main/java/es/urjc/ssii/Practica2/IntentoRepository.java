package es.urjc.ssii.Practica2;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IntentoRepository extends CrudRepository<Intento, Long> {

	List<Intento> findByFecha(Date fecha);
	
}

