package es.urjc.ssii.Practica2;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Intento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Date fecha;
	private String ip;
	private Usuario usuario;
	private boolean resultado;
	
	public Intento(Date fecha, String ip, Usuario usuario, boolean resultado) {
		super();
		this.fecha = fecha;
		this.ip = ip;
		this.usuario = usuario;
		this.resultado = resultado;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public boolean isResultado() {
		return resultado;
	}
	
	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		return "Intento [fecha=" + fecha + ", ip=" + ip + ", usuario=" + usuario + ", resultado=" + resultado + "]";
	}
	
	
}
