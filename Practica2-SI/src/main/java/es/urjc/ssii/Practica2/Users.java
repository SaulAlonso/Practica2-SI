package es.urjc.ssii.Practica2;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idUsuario;
	
	private String nombre;
	private String password;
	private String apellidos;
	private String correo;
	private Date fNacimiento;
	private String pais;
	private String ciudad;
	
	public Users() {
	}

	public Users(String nombre, String apellidos, String correo, Date fNacimiento, String pais,
			String ciudad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.fNacimiento = fNacimiento;
		this.pais = pais;
		this.ciudad = ciudad;
	}

	public Users(String nombre, String password, String apellidos, String correo, Date fNacimiento, String pais,
			String ciudad) {
		this.nombre = nombre;
		this.password = password;
		this.apellidos = apellidos;
		this.correo = correo;
		this.fNacimiento = fNacimiento;
		this.pais = pais;
		this.ciudad = ciudad;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
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
	
	public Date getfNacimiento() {
		return fNacimiento;
	}
	
	public void setfNacimiento(Date fNacimiento) {
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
