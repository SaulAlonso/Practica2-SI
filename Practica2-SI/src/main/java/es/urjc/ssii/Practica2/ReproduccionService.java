package es.urjc.ssii.Practica2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReproduccionService {

	@Autowired
	private ReproduccionRepository repositorio;
	
	public List<Reproduccion> getReproduccion(){
		return (List<Reproduccion>) repositorio.findAll();
	}
	
	public Reproduccion getReproduccion(long id){
		return repositorio.findOne(id);
	}
}
