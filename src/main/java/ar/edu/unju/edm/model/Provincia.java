package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component

public class Provincia {
	private int codigo; 
	private String nombre;
	
	
	public Provincia() {
		// TODO Auto-generated constructor stub
	}
	
	public Provincia(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Provincia other = (Provincia) obj;
		if (codigo != other.codigo)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Provincia [codigo=" + codigo + ", nombre=" + nombre + ", getCodigo()=" + getCodigo() + ", getNombre()="
				+ getNombre() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
	
}

