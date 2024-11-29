package com.distribuida.principal;

import java.util.Date;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Libro;

public class LibroPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  // Crear una instancia de Factura 
       
		Factura factura = new Factura(1, "FAC-00001", new java.util.Date(), 100.25, 15.25, 116.25, null);
       
		// Crear una instancia de FacturaDetalle (instancia de Factura y Libro)
        
		FacturaDetalle facturaDetalle = new FacturaDetalle(1, 2, 50.50, null, factura);  
       
		// Crear una instancia de Libro
       
		Libro libro = new Libro(1, "El abismo", "Editorial 1234", 400, "3ra edición", "Español", 1850, 
               
				"Un libro muy famoso de Gabriel García Márquez", "Tapa dura", "978-3-16-148410-0", 5, "portada.jpg", 
                
				"Paperback", 25.50, 1, 1, facturaDetalle);  // Enlazamos la facturaDetalle creada
       
		// Enlazar el libro a la facturaDetalle 
       
		facturaDetalle.setLibro(libro);  
        
		// Imprimir la información del libro usando el método toString
        
		System.out.println(libro.toString());
	
		
	}

}
