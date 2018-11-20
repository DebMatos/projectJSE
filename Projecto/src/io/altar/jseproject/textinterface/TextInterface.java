package io.altar.jseproject.textinterface;

import java.util.Iterator;

import java.util.Scanner;

import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repositories.ShelfRepository;

public class TextInterface {

	ShelfRepository shelfRepository = ShelfRepository.getInstance();

	// **********************************Menu
	// Principal**************************** Done
	public void ecraPrincipal() {
		System.out.println("Por favor selecione uma das seguintes opcoes:");
		System.out.println("1) Listar produtos");
		System.out.println("2) Listar prateleiras");
		System.out.println("3) Sair");

		Scanner sc = new Scanner(System.in);
		String inputTemp = sc.nextLine();
		if (verificaInput(inputTemp, "int") == true) {
			int inInt = Integer.parseInt(inputTemp);
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

		} else if (verificaInput(inputTemp, "int") == false) {

			System.out.println("Input invalido");
			ecraPrincipal();
		}

		sc.close();

	}
	// ********************************** Fim Menu
	// Principal****************************

	// **********************************Menu
	// produtos************************************ Done

	public void ecraProducts() {
		System.out.println("Por favor selecione uma das seguintes opcoes:");
		System.out.println("1) Criar novo produto");
		System.out.println("2) Editar produto existente");
		System.out.println("3) Consultar detalhe de um produto");
		System.out.println("4) Remover um produto");
		System.out.println("5) Voltar ao ecra anterior");

		Scanner sc = new Scanner(System.in);
		String inputTemp = sc.nextLine();
		if (verificaInput(inputTemp, "int") == true) {
			int inInt = Integer.parseInt(inputTemp);

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

		} else if (verificaInput(inputTemp, "int") == false) {

			System.out.println("Input invalido");
			ecraProducts();
		}

		sc.close();

	}
	// **********************************Menu
	// Prateleiras************************************ Done

	public void ecraShelves() {
		System.out.println("Por favor selecione uma das seguintes opcoes:");
		System.out.println("1) Criar nova prateleira");
		System.out.println("2) Editar prateleira existente");
		System.out.println("3) Consultar detalhe de uma prateleira");
		System.out.println("4) Remover uma prateleira");
		System.out.println("5) Voltar ao ecra anterior");

		Scanner sc = new Scanner(System.in);

		String inputTemp = sc.nextLine();
		// verificaInputInt(input);

		if (verificaInput(inputTemp, "int") == true) {
			int inInt = Integer.parseInt(inputTemp);

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
		} else if (verificaInput(inputTemp, "int") == false) {

			System.out.println("Input invalido");
			ecraProducts();
		}

		sc.close();
	}

	// **********************************New Product
	// ************************************
	public void ecraNewProduct() {
		System.out.println(" Novo produto:");
		System.out.println(" PVP");
		System.out.println(" IVA");
		System.out.println(" Discount value:");
		System.out.println(" Escolha uma prateleira");

	}
	// **********************************Edit Product
	// ************************************

	public void ecraEditProduct() {
		System.out.println(" Editar produto:");
		System.out.println(" Insira o id do produto");
	}
	// **********************************Delete Product
	// ************************************

	public void ecraDeleteProduct() {

	}
	// ********************************** Product details
	// ************************************

	public void ecraDetailProduct() {
		System.out.println(" Detalhes do produto:");
		System.out.println(" Id");
		System.out.println(" PVP");
		System.out.println(" IVA");
		System.out.println(" Discount value:");
		System.out.println(" Prateleiras");
	}

	// **********************************New Shelf
	// ************************************

	public void ecraNewShelf() {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Nova prateleira:");
		System.out.println(" Capacidade:");
		String inCap = sc.nextLine();
		// System.out.println(" Id do produto");
		System.out.println(" Preco de aluguer/dia:");
		String inRent = sc.nextLine();
		double rentDouble = 0.0;
		if (verificaInput(inRent, "double") == true) {
			rentDouble = Double.parseDouble(inRent);

		} else if (verificaInput(inRent, "double") == false) {
			System.out.println("Input invalido");
			System.out.println(" Preco de aluguer/dia:");
			inRent = sc.nextLine();

		}
		Shelf shelf1 = new Shelf(inCap, rentDouble);
		shelfRepository.save(shelf1);

		Iterator<Shelf> it = shelfRepository.getAll();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}

		ecraShelves();
	}

	// **********************************Edit Product
	// ************************************

	public void ecraEditShelf() {
		Scanner sc = new Scanner(System.in);

		Iterator<Shelf> it = shelfRepository.getAll();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}

		System.out.println(" Editar prateleira:");
		System.out.println(" Insira o id da prateleira");
		String inId = sc.nextLine();
		Long id=null;
		String inCap;
		String inRent;
		if (verificaInput(inId, "long") == true) {
			id = Long.parseLong(inId);

			
		    
		} while (verificaInput(inId, "long") == false){
			System.out.println("Input invalido");
			System.out.println(" Insira o id da prateleira");
			inId = sc.nextLine();
		}
		Shelf shelfAEditar = shelfRepository.findById(id);
		System.out.println(shelfRepository.findById(id).toString());
		System.out.println(" Capacidade:" + shelfRepository.findById(id).getCapacity());
	    inCap = sc.nextLine();
		System.out.println(" Preco de aluguer/dia:" + shelfRepository.findById(id).getRentPrice());
	    inRent = sc.nextLine();
	    
		if (!inCap.equals("")) {
			shelfAEditar.setCapacity(inCap);
			shelfRepository.updateById(shelfAEditar);
		} else {

		
	}
		

		if (!inRent.equals("")) {

			while (verificaInput(inRent, "double") == false) {
				System.out.println("Input invalido");
				System.out.println(" Preco de aluguer/dia:");
				inRent = sc.nextLine();
			}

			double rentDouble = Double.parseDouble(inRent);
			shelfAEditar.setRentPrice(rentDouble);
			shelfRepository.updateById(shelfAEditar);
		} else {

			

		}

		System.out.println(shelfRepository.findById(id).toString());

	}

	// **********************************Delete Shelf
	// ************************************
	public void ecraDeleteShelf() {

	}

	// **********************************Shelf details
	// ************************************
	public void ecraDetailShelf() {
		System.out.println(" Detalhes da prateleira:");
		System.out.println(" Id");
		System.out.println(" Capacidade");
		System.out.println(" Id do produto");
		System.out.println(" Preco de aluguer diario");

	}

	// **********************************Geral
	// ************************************
	public void sair() {

	}

	public boolean verificaInput(String input, String type) {

		try {

			switch (type) {

			case "int":
				int inInt = Integer.parseInt(input);
				break;
			case "double":
				double inD = Double.parseDouble(input);
				break;
			case "long":
				long inLong = Long.parseLong(input);
				break;

			}
			return true;
		}

		catch (Exception e) {

			return false;
		}

	}

}
