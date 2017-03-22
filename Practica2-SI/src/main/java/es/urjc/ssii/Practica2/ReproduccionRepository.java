package es.urjc.ssii.Practica2;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface ReproduccionRepository extends CrudRepository<Reproduccion,Long>{

	List<Reproduccion> findByFecha(Date fecha);
}
