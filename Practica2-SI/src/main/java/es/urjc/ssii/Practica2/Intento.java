package es.urjc.ssii.Practica2;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Intento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idIntento;
	
	private Date fecha;
	private String ip;
	@OneToOne
	private Users users;
	private boolean resultado;
	
	public Intento(){
		
	}
	
	public Intento(Date fecha, String ip, Users users, boolean resultado) {
		this.fecha = fecha;
		this.ip = ip;
		this.users = users;
		this.resultado = resultado;
	}
	
	public Long getIdIntento() {
		return idIntento;
	}

	public void setIdIntento(Long idIntento) {
		this.idIntento = idIntento;
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
	
	public Users getUsuario() {
		return users;
	}
	
	public void setUsuario(Users users) {
		this.users = users;
	}
	
	public boolean isResultado() {
		return resultado;
	}
	
	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		return "Intento [fecha=" + fecha + ", ip=" + ip + ", usuario=" + users + ", resultado=" + resultado + "]";
	}
	
	
}
