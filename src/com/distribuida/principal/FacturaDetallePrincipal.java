package com.distribuida.principal;

import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Libro;

public class FacturaDetallePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear instancias de Factura y Libro para usar en FacturaDetalle
        Factura factura = new Factura(1, "FAC-0001", new java.util.Date(), 100.25, 15.25, 116.25, null);
        Libro libro = new Libro(1, "El abismo", "Editorial 1234", 400, "3ra edición", "Español", 1850, "Un libro famoso", "Tapa dura", "448-5-16-14810-0", 5, "portada.jpg", "Paperback", 35.90, 1, 1, null);
        // Crear una instancia de FacturaDetalle con la Factura y Libro creados
        FacturaDetalle facturaDetalle = new FacturaDetalle(1, 3, 75.50, libro, factura);
 
        // Imprimir la información del FacturaDetalle usando el método toString
        System.out.println(facturaDetalle.toString());
		

	}

}
