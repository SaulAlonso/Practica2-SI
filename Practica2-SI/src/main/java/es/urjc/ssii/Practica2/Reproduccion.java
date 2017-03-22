package es.urjc.ssii.Practica2;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Reproduccion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Date fecha;
	private Usuario usuario;
	private Pelicula pelicula;
	
	public Reproduccion(Date fecha, Usuario usuario, Pelicula pelicula) {
		super();
		this.fecha = fecha;
		this.usuario = usuario;
		this.pelicula = pelicula;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "Reproduccion [fecha=" + fecha + ", usuario=" + usuario + ", pelicula=" + pelicula + "]";
	}
	
	
}
