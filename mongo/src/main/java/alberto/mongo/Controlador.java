package alberto.mongo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import objetos.Autor;
import objetos.Juego;

public class Controlador implements ActionListener {

	Modelo modelo;
	Vista vista;

	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;

		inicializar();
	}

	private void inicializar() {
		vista.botonesCrud.addListeners(this);
		vista.panelBusqueda.listar(modelo.getJuegos());

		for (Autor autor : modelo.getAutor()) {
			vista.cbAutor.addItem(autor);
			System.out.println(autor.getId());
		}

	}

	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();

		switch (comando) {
		case "nuevo":

			break;
		case "guardar":
			try {
				Juego juego = new Juego();
				juego.setNombre(vista.tfNombre.getText());
				juego.setGenero(vista.tfGenero.getText());
				juego.setAutores((Autor) vista.cbAutor.getSelectedItem());
				modelo.anadir(juego);
				vista.panelBusqueda.anadir(juego);
			} catch (ParseException e2) {
				e2.printStackTrace();
			}
			break;
		case "calcelar":
			break;
		case "modificar":
			break;
		case "eliminar":
			break;
		default:
			break;
		}

	}
}
