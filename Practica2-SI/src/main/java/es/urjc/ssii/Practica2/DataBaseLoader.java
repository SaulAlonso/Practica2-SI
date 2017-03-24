package es.urjc.ssii.Practica2;

import java.net.InetAddress;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DataBaseLoader {

	@Autowired
	private PeliculaRepository repositorioPelicula;
	
	@Autowired
	private IntentoRepository repositorioIntento;
	
	@Autowired
	private ReproduccionRepository repositorioReproduccion;
	
	@Autowired
	private UsersRepository repositorioUsuario;
	
	@PostConstruct
	public void initDatabase() {
		Pelicula pelicula1 = new Pelicula("Matrix", "EEUU", 1998, "Unknown", "Ganan las personas a las maquinas", "http://www.imdb.com/title/tt0133093/", "accion");
		Pelicula pelicula2 = new Pelicula("Matrix2", "EEUU", 2000, "Unknown", "Ganan las personas a las maquinas", "http://www.imdb.com/title/tt0133093/", "accion");
		repositorioPelicula.save(pelicula1);
		repositorioPelicula.save(pelicula2);
		
		Date fecha = new Date();
        fecha = new Date(82,4,1,10,30,15);
        Users users = new Users("saul", "alonso", "correo@correo.com", fecha, "españa", "madrid");
        repositorioUsuario.save(users);
		repositorioIntento.save(new Intento(fecha, "128.0.0.1", users, true));
		
		repositorioReproduccion.save(new Reproduccion(fecha, users, pelicula1));
	}
}
