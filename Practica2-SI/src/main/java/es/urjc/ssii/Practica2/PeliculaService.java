package es.urjc.ssii.Practica2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PeliculaService {
	@Autowired
	private PeliculaRepository repositorio;
	private List<Pelicula> peliculas;

	public PeliculaService() {
		// Creación de la lista de películas.
		peliculas = new ArrayList<Pelicula>();
		// Actores de la primera película.
		// Creación de la película y adición de los actores.
		ArrayList<String> etiquetas = new ArrayList<String>();
		etiquetas.add("accion");
		Pelicula matrix = new Pelicula("Matrix","eeuu",1999,"desconocido","el bueno es el friki","http://www.imdb.com/title/tt0133093/",etiquetas);
		// Se añade la película a la lista.
		peliculas.add(matrix);
		
		// Se repite el proceso para otra película.
		etiquetas.add("mafia");
		Pelicula elpadrino = new Pelicula("El Padrino","eeuu",1972,"desconocido","el malo es el bueno","http://www.imdb.com/title/tt0068646/",etiquetas);
		peliculas.add(elpadrino);
	}
	// Getters y setters ...
	public List<Pelicula> getPeliculas() {
		return (List<Pelicula>) repositorio.findAll();
	}

	public Pelicula getPelicula(long id) {
		return repositorio.findOne(id);
	}
}
