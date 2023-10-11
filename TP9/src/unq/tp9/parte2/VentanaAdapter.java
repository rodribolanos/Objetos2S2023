package unq.tp9.parte2;

import javax.swing.DefaultListModel;

public class VentanaAdapter {
	Ventana adaptee;
	
	public VentanaAdapter(Ventana adaptee) {
		this.adaptee = adaptee;
	}
	public void Ventana(ListaDePalabrasOrdenadas lista) {
		int cantidadDePalabras = lista.cantidadDePalabras();
		DefaultListModel<String> listaDefault = new DefaultListModel<String>();
		while (cantidadDePalabras != 0) { 
			String palabraAAgregar = lista.getPalabraDePosicion(cantidadDePalabras);
			listaDefault.addElement(palabraAAgregar);
			cantidadDePalabras =- 1;
		}
		unq.tp9.parte2.Ventana.main(listaDefault);
		
	}
}
