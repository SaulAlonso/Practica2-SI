package es.urjc.ssii.Practica2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ReproduccionRestController {

	@Autowired
	private ReproduccionService reproduccionService;
	
	@RequestMapping(value="/reproduccion", method = RequestMethod.GET)
	public List<Reproduccion> getReproduccion(){
		return reproduccionService.getReproduccion();
	}
	
	@RequestMapping(value = "/reproduccion/{index}", method = RequestMethod.GET)
	public Reproduccion getReproduccion(@PathVariable("index") int index) {
		return reproduccionService.getReproduccion(index);
	}
}
