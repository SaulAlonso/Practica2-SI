package es.urjc.ssii.Practica2;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Reproduccion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idReproduccion;
	
	private Date fecha;
	
	@OneToOne
	private Users users;
	
	@OneToOne
	private Pelicula pelicula;
	
	public Reproduccion() {
	}

	public Reproduccion(Date fecha, Users users, Pelicula pelicula) {
		this.fecha = fecha;
		this.users = users;
		this.pelicula = pelicula;
	}

	public Long getIdReproduccion() {
		return idReproduccion;
	}

	public void setIdReproduccion(Long idReproduccion) {
		this.idReproduccion = idReproduccion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Users getUsuario() {
		return users;
	}

	public void setUsuario(Users users) {
		this.users = users;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "Reproduccion [fecha=" + fecha + ", usuario=" + users + ", pelicula=" + pelicula + "]";
	}
	
	
}
