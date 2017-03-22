package es.urjc.ssii.Practica2;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pelicula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String titulo;
	private String pais;
	private int año;
	private String director;
	private String resumen;
	private String url;
	private ArrayList<String> etiquetas;
	
	public Pelicula() {
	}

	public Pelicula(String titulo, String pais, int año, String director, String resumen, String url,
			ArrayList<String> etiquetas) {
		super();
		this.titulo = titulo;
		this.pais = pais;
		this.año = año;
		this.director = director;
		this.resumen = resumen;
		this.url = url;
		this.etiquetas = etiquetas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public ArrayList<String> getEtiquetas() {
		return etiquetas;
	}

	public void setEtiquetas(ArrayList<String> etiquetas) {
		this.etiquetas = etiquetas;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", pais=" + pais + ", año=" + año + ", director=" + director
				+ ", resumen=" + resumen + ", url=" + url + ", etiquetas=" + etiquetas + "]";
	}
	
	

}
