package com.distribuida.principal;

import com.distribuida.entities.Cliente;

public class ClientePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente  = new Cliente(1,"170123456","Juan","Taipe","Tumbaco","09876564321","jtaipe@gmail.com");
		
		Cliente cliente2 = new Cliente(2,"1478523695","Pablo","Moran","Tumbaco","0932156784","pablomo@gmail.com");
		
		
		System.out.println(cliente.toString());
		System.out.println(cliente2.toString());
		
		}

}
