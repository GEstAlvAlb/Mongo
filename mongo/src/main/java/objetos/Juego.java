package objetos;

import java.util.List;
import java.util.Set;

import org.bson.types.ObjectId;

public class Juego implements Comparable {

	ObjectId id;
	String nombre;
	String genero;
	Set<Autor> autores;

	public Juego() {

	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Set<Autor> getAutores() {
		return autores;
	}

	public void setAutores(Set<Autor> autores) {
		this.autores = autores;
	}

	public int compareTo(Object o) {

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Juego))
			return false;

		Juego juego = (Juego) obj;
		if (nombre.equals(juego.getNombre()))
			return true;

		return false;
	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	@Override
	public String toString() {
		return nombre;
	}
}