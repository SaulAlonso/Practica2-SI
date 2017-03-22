package es.urjc.ssii.Practica2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PeliculaRestController {

	@Autowired
	private PeliculaService peliculaService;

	@RequestMapping(value = "/pelicula", method = RequestMethod.GET)
	public List<Pelicula> getPeliculas() {
		return peliculaService.getPeliculas();
	}

	@RequestMapping(value = "/pelicula/{index}", method = RequestMethod.GET)
	public Pelicula getPelicula(@PathVariable("index") int index) {
		return peliculaService.getPelicula(index);
	}
}
