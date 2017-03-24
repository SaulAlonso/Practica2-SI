package es.urjc.ssii.Practica2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PeliculaService {
	@Autowired
	private PeliculaRepository repositorio;
	// Getters y setters ...
	public List<Pelicula> getPeliculas() {
		return (List<Pelicula>) repositorio.findAll();
	}

	public Pelicula getPelicula(long id) {
		return repositorio.findOne(id);
	}
}
