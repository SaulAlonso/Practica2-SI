package es.urjc.ssii.Practica2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IntentoService {
	@Autowired
	private IntentoRepository repositorio;
	
	// Getters y setters ...
	public List<Intento> getIntento() {
		return (List<Intento>) repositorio.findAll();
	}

	public Intento getIntento(long id) {
		return repositorio.findOne(id);
	}
}
