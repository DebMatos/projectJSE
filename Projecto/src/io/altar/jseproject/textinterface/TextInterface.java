package io.altar.jseproject.textinterface;

import java.util.Scanner;

public class TextInterface {
	static int inInt;
	// Menu inicial
	public static void ecraPrincipal() {
		System.out.println("Por favor selecione uma das seguintes opções:");
		System.out.println("1) Listar produtos");
		System.out.println("2) Listar prateleiras");
		System.out.println("3) Sair");
		
		Scanner sc=new Scanner(System.in);
		  String input = sc.nextLine();
		  verificaInputInt(input);
		  switch(inInt) {
		  
		  case 1: ecraProducts();
			  break;
		  case 2: ecraShelves();
			  break;
		  case 3: sair();
			  break;
		  default: System.out.println("Opção invalida. Insira 1, 2 ou 3");
		  ecraPrincipal();
		  }
		  
		  sc.close();
		  
	}

	// Menu produtos
	public static void ecraProducts() {
		System.out.println("Por favor selecione uma das seguintes opções:");
		System.out.println("1) Criar novo produto");
		System.out.println("2) Editar produto existente");
		System.out.println("3) Consultar detalhe de um produto");
		System.out.println("4) Remover um produto");
		System.out.println("5) Voltar ao ecrã anterior");

	}

	// Menu prateleiras
	public static void ecraShelves() {
		System.out.println("Por favor selecione uma das seguintes opções:");
		System.out.println("1) Criar nova prateleira");
		System.out.println("2) Editar prateleira existente");
		System.out.println("3) Consultar detalhe de uma prateleira");
		System.out.println("4) Remover uma prateleira");
		System.out.println("5) Voltar ao ecrã anterior");
	}

	public static void sair() {

	}

	public static int verificaInputInt(String input) {
		
		try {
			 inInt = Integer.parseInt(input);

			 
		}

		catch (Exception e) {

			System.out.println("Por favor introduza um numero presente no menu");
		}
		 return inInt;
	}

}
