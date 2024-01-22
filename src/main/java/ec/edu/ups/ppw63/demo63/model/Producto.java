package ec.edu.ups.ppw63.demo63.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.List;

@Entity
public class Producto {
	
	@Id
	private int codigo;
	private String nombre;
	private String descrpicion;
	private List<String> caracteristicas;
	private List<String> fotos;
	private double precio;
}
