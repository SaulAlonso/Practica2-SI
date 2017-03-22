package es.urjc.ssii.Practica2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nombre;
	private String password;
	private String apellidos;
	private String correo;
	private String fNacimiento;
	private String pais;
	private String ciudad;
	
	public Usuario() {
	}

	public Usuario(String nombre, String password, String apellidos, String correo, String fNacimiento, String pais,
			String ciudad) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.apellidos = apellidos;
		this.correo = correo;
		this.fNacimiento = fNacimiento;
		this.pais = pais;
		this.ciudad = ciudad;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getfNacimiento() {
		return fNacimiento;
	}
	
	public void setfNacimiento(String fNacimiento) {
		this.fNacimiento = fNacimiento;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", password=" + password + ", apellidos=" + apellidos + ", correo="
				+ correo + ", fNacimiento=" + fNacimiento + ", pais=" + pais + ", ciudad=" + ciudad + "]";
	}
	
	

}
