package es.tion.ua.biblioteca.client;

import java.util.Arrays;
import java.util.List;

import com.google.gwt.user.client.ui.FlexTable;

public class TablaLibros extends FlexTable{
	
	/**
	  * La lista de libros.
	  */
	private static final List<String> LIBROS = Arrays.asList(
			"El ingenioso hidalgo Don Quijote de la Mancha - Miguel de Cervantes Saavedra - 1605", 
	        "Lazarillo de Tormes - anonimo - 1554", 
	        "La Celestina o Tragicomedia de Calisto y Melibea - Fernando de Rojas - 1514", 
	        "Fuenteovejuna - Lope de Vega - 1619", 
	        "La vida es sueño - Lope de Vega - 1635");
	
	public TablaLibros() {
	    for(int i=0;i< LIBROS.size();i++) {
	    	this.setText(i, 0, LIBROS.get(i));
	    }
	}	
}
