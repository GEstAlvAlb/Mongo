package alberto.mongo;

public class Aplicacion {
	public static void main(String args[]) {
		Vista vista = new Vista();
		Modelo modelo = new Modelo();
		Controlador controlador = new Controlador(modelo, vista);
	}
}