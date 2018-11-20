package io.altar.jseproject.textinterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import io.altar.jseproject.model.Shelf;

public class TextInterface {
	
	static int inInt;
	//static Long ShelfId;
	//static Map<Long, Shelf> shelvesMap=new HashMap<Long, Shelf>();
	
	
	// Menu inicial
	public static void ecraPrincipal() {
		System.out.println("Por favor selecione uma das seguintes opcoes:");
		System.out.println("1) Listar produtos");
		System.out.println("2) Listar prateleiras");
		System.out.println("3) Sair");

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		verificaInputInt(input);
		switch (inInt) {

		case 1:
			ecraProducts();
			break;
		case 2:
			ecraShelves();
			break;
		case 3:
			sair();
			break;
		default:
			System.out.println(" Insira 1, 2 ou 3");
			ecraPrincipal();
		}

		sc.close();

	}

	// Menu produtos
	public static void ecraProducts() {
		System.out.println("Por favor selecione uma das seguintes opcoes:");
		System.out.println("1) Criar novo produto");
		System.out.println("2) Editar produto existente");
		System.out.println("3) Consultar detalhe de um produto");
		System.out.println("4) Remover um produto");
		System.out.println("5) Voltar ao ecra anterior");

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		verificaInputInt(input);
		switch (inInt) {

		case 1:
			ecraNewProduct();
			break;
		case 2:
			ecraEditProduct();
			break;
		case 3:
			ecraDetailProduct();
			break;
		case 4:
			ecraDeleteProduct();
			break;
		case 5:
			ecraPrincipal();
			break;
		default:
			System.out.println(" Insira 1, 2, 3, 4 ou 5");
			ecraProducts();
		}

		sc.close();

	}

	// Menu prateleiras
	public static void ecraShelves() {
		System.out.println("Por favor selecione uma das seguintes opcoes:");
		System.out.println("1) Criar nova prateleira");
		System.out.println("2) Editar prateleira existente");
		System.out.println("3) Consultar detalhe de uma prateleira");
		System.out.println("4) Remover uma prateleira");
		System.out.println("5) Voltar ao ecra anterior");

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		verificaInputInt(input);
		switch (inInt) {

		case 1:
			ecraNewShelf();
			break;
		case 2:
			ecraEditShelf();
			break;
		case 3:
			ecraDetailShelf();
			break;
		case 4:
			ecraDeleteShelf();
			break;
		case 5:
			ecraPrincipal();
			break;
		default:
			System.out.println(" Insira 1, 2, 3, 4 ou 5");
			ecraShelves();
		}

		sc.close();
	}

	public static void ecraNewProduct() {
		System.out.println(" Novo produto:");
		System.out.println(" PVP");
		System.out.println(" IVA");
		System.out.println(" Discount value:");
		System.out.println(" Escolha uma prateleira");

	}

	public static void ecraEditProduct() {
		System.out.println(" Editar produto:");
		System.out.println(" Insira o id do produto");
	}

	public static void ecraDeleteProduct() {

	}

	public static void ecraDetailProduct() {
		System.out.println(" Detalhes do produto:");
		System.out.println(" Id");
		System.out.println(" PVP");
		System.out.println(" IVA");
		System.out.println(" Discount value:");
		System.out.println(" Prateleiras");
	}

	public static void ecraNewShelf() {
Scanner sc =new Scanner(System.in);

		System.out.println(" Nova prateleira:");
		System.out.println(" Capacidade:");
		String inCap = sc.nextLine();
		//System.out.println(" Id do produto");
		System.out.println(" Preco de aluguer/dia:");
		String inRent = sc.nextLine();
		double rentD = Double.parseDouble(inRent);
	    // ShelfId++;
	
		//shelvesMap.put(ShelfId, shelf1);
	
	//	for (Long id : shelvesMap.keySet()) {
			// print the student id and age
		//	System.out.println( "Id:"
		//			+ shelvesMap.get(id).getShelfId() + "|  Capacidade: "+ shelvesMap.get(id).getCapacity()
		//			+"|  Preco de aluguer/dia: " +shelvesMap.get(id).getRentPrice()+ "|  Produtos: "+
			//		shelvesMap.get(id).getProductId());
	//	}
		
		ecraShelves();
	}

	public static void ecraEditShelf() {
		System.out.println(" Editar prateleira:");
		System.out.println(" Insira o id da prateleira");
	}

	public static void ecraDeleteShelf() {

	}

	public static void ecraDetailShelf() {
		System.out.println(" Detalhes da prateleira:");
		System.out.println(" Id");
		System.out.println(" Capacidade");
		System.out.println(" Id do produto");
		System.out.println(" Preco de aluguer diario");

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
