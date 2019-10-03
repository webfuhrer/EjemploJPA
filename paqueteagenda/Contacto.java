package paqueteagenda;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Contacto.todos", query="SELECT c from Contacto  c") 
public class Contacto {
@Id
@GeneratedValue(strategy = GenerationType.AUTO) 	
private int id;
private String nombre, apellido, email;

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Contacto(String nombre, String apellido, String email) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.email = email;
}
public Contacto() {
	
}

@Override
public String toString() {
	return "Contacto [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + "]";
}

}
