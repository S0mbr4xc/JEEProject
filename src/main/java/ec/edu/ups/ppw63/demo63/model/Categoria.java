package ec.edu.ups.ppw63.demo63.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Categoria {
	@Id
	private int codigo;
	private String nombre;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Categoria: [codigo: " + codigo + ", nombre: " + nombre + "]";
	}
	
	
}
