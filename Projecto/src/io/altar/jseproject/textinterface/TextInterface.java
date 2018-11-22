package io.altar.jseproject.textinterface;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.Scanner;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.ShelfRepository;

public class TextInterface {

	ShelfRepository shelfRepository = ShelfRepository.getInstance();
	ProductRepository productRepository = ProductRepository.getInstance();

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
		allProducts();
		Scanner sc = new Scanner(System.in);
		if (productRepository.isEmpty()) {

			System.out.println("1) Criar novo produto");
			System.out.println("2) Voltar ao ecra anterior");
			String inputTemp = sc.nextLine();
			if (verificaInput(inputTemp, "int") == true) {
				int inInt = Integer.parseInt(inputTemp);
				switch (inInt) {

				case 1:
					ecraNewProduct();
					break;
				case 2:
					ecraPrincipal();
					break;
				default:
					System.out.println(" Insira 1 ou 2");
					ecraShelves();
				}
			} else if (verificaInput(inputTemp, "int") == false) {

				System.out.println("Input invalido");
				ecraShelves();
			}

		} else {
			System.out.println("Por favor selecione uma das seguintes opcoes:");
			System.out.println("1) Criar novo produto");
			System.out.println("2) Editar produto existente");
			System.out.println("3) Consultar detalhe de um produto");
			System.out.println("4) Remover um produto");
			System.out.println("5) Voltar ao ecra anterior");

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

		}
		sc.close();
	}
	// **********************************Menu
	// Prateleiras************************************ Done

	public void ecraShelves() {
		Scanner sc = new Scanner(System.in);
		allShelves();
		if (shelfRepository.isEmpty()) {

			System.out.println("1) Criar nova prateleira");
			System.out.println("2) Voltar ao ecra anterior");
			String inputTemp = sc.nextLine();
			if (verificaInput(inputTemp, "int") == true) {
				int inInt = Integer.parseInt(inputTemp);
				switch (inInt) {

				case 1:
					ecraNewShelf();
					break;
				case 2:
					ecraPrincipal();
					break;
				default:
					System.out.println(" Insira 1 ou 2");
					ecraShelves();
				}
			} else if (verificaInput(inputTemp, "int") == false) {

				System.out.println("Input invalido");
				ecraShelves();
			}

		} else {

			System.out.println("Por favor selecione uma das seguintes opcoes:");
			System.out.println("1) Criar nova prateleira");
			System.out.println("2) Editar prateleira existente");
			System.out.println("3) Consultar detalhe de uma prateleira");
			System.out.println("4) Remover uma prateleira");
			System.out.println("5) Voltar ao ecra anterior");

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
				ecraShelves();
			}

			sc.close();
		}
	}

	// **********************************New Product
	// ************************************
	public void ecraNewProduct() {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Novo produto:");
		System.out.println(" PVP");
		String inPvp = sc.nextLine();
		double pvp = 0.0;
		if (verificaInput(inPvp, "double") == true) {
			pvp = Double.parseDouble(inPvp);

		}
		while (verificaInput(inPvp, "double") == false) {
			System.out.println("Input invalido");
			System.out.println(" PVP:");
			inPvp = sc.nextLine();

		}
		System.out.println(" IVA");
		String inIva = sc.nextLine();
		double iva = 0.0;
		if (verificaInput(inIva, "double") == true) {
			iva = Double.parseDouble(inIva);

		}
		while (verificaInput(inIva, "double") == false) {
			System.out.println("Input invalido");
			System.out.println(" IVA");
			inIva = sc.nextLine();

		}
		System.out.println(" Desconto:");
		String inD = sc.nextLine();
		double desc = 0.0;
		if (verificaInput(inD, "double") == true) {
			desc = Double.parseDouble(inD);

		} while (verificaInput(inD, "double") == false) {
			System.out.println("Input invalido");
			System.out.println(" Desconto:");
			inD = sc.nextLine();

		}
		System.out.println("Escolha uma prateleira ou clique ENTER para criar produto sem prateleira");
		allShelvesIds();
	
		
		long id;
		ArrayList<Long> shelvesId = new ArrayList<Long>();

		String inId= sc.nextLine();
		if(inId.equals("")){
			Product prod = new Product(shelvesId, desc, iva, pvp);
			productRepository.save(prod);
			ecraProducts();
		}
		else{
		
		if (verificaInput(inId, "long") == true) {
			id = Long.parseLong(inId);	
			
			while (hasId(id) == false) {
				System.out.println("Nao existe esse id");
				System.out.println(" Insira o id da prateleira");
				inId = sc.nextLine();	
				id = Long.parseLong(inId);

			}
			if (hasId(id) == true) {
				shelvesId.add(id);
				Product prod = new Product(shelvesId, desc, iva, pvp);
				productRepository.save(prod);
				ecraProducts();
			}
		}
		while (verificaInput(inId, "long") == false) {
			System.out.println("Input invalido");
			System.out.println(" Escolha uma prateleira");
			allShelvesIds();
			inId= sc.nextLine();

		}
		}
		sc.close();
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

		}
		while (verificaInput(inRent, "double") == false) {
			System.out.println("Input invalido");
			System.out.println(" Preco de aluguer/dia:");
			inRent = sc.nextLine();

		}
		Shelf shelf1 = new Shelf(inCap, rentDouble);
		shelfRepository.save(shelf1);

		ecraShelves();
		sc.close();
	}

	// **********************************Edit Shelves
	// ************************************

	public void ecraEditShelf() {
		Scanner sc = new Scanner(System.in);
		if (shelfRepository.isEmpty()) {

		} else {
			allShelves();
			System.out.println(" Editar prateleira:");
			System.out.println(" Insira o id da prateleira");
			String inId = sc.nextLine();
			Long id = null;
			String inCap;
			String inRent;
			if (verificaInput(inId, "long") == true) {
				id = Long.parseLong(inId);

			}
			while (verificaInput(inId, "long") == false) {
				System.out.println("Input invalido");
				System.out.println(" Insira o id da prateleira");
				inId = sc.nextLine();
			}
			while (hasId(id) == false) {
				System.out.println("Nao existe esse id");
				System.out.println(" Insira o id da prateleira");
				inId = sc.nextLine();
				if (verificaInput(inId, "long") == true) {
					id = Long.parseLong(inId);

				}

			}
			if (hasId(id) == true) {
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
				System.out.println("Prateleira editada");
				System.out.println(shelfRepository.findById(id).toString());

				ecraShelves();
				sc.close();
			}
		}
	}

	// **********************************Delete Shelf
	// ************************************
	public void ecraDeleteShelf() {
		Scanner sc = new Scanner(System.in);

		Iterator<Shelf> it = shelfRepository.getAll();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}

		System.out.println(" Apagar prateleira:");
		System.out.println(" Insira o id da prateleira");
		String inId = sc.nextLine();
		Long id = null;

		if (verificaInput(inId, "long") == true) {
			id = Long.parseLong(inId);

		}
		while (verificaInput(inId, "long") == false) {
			System.out.println("Input invalido");
			System.out.println(" Insira o id da prateleira");
			inId = sc.nextLine();
		}
		while (hasId(id) == false) {
			System.out.println("Nao existe esse id");
			System.out.println(" Insira o id da prateleira");
			inId = sc.nextLine();
			if (verificaInput(inId, "long") == true) {
				id = Long.parseLong(inId);

			}

		}
		if (hasId(id) == true) {
			Shelf shelfAVer = shelfRepository.findById(id);
			System.out.println(shelfAVer.toString());
			System.out.println("Tem a certeza que quer apagar esta prateleira? ");
			System.out.println("Precione s para apagar");
			System.out.println("Precione n caso queira manter");
			String conf = sc.nextLine();
			if (conf.equals("s")) {
				shelfRepository.removeById(id);
				ecraShelves();

			} else if (conf.equals("n")) {
				ecraShelves();
			}
			while (conf.equals("n") == false && conf.equals("s") == false) {
				System.out.println(shelfRepository.findById(id).toString());
				System.out.println("Tem a certeza que quer apagar esta prateleira? ");
				System.out.println("Precione s para apagar");
				System.out.println("Precione n caso queira manter");
			}
		}
		sc.close();
	}

	// **********************************Shelf details
	// ************************************
	public void ecraDetailShelf() {
		if (shelfRepository.isEmpty()) {

		} else {

			Scanner sc = new Scanner(System.in);

			Iterator<Shelf> it = shelfRepository.getAll();
			while (it.hasNext()) {
				System.out.println(it.next().toString());
			}

			System.out.println(" Detalhes prateleira:");
			System.out.println(" Insira o id da prateleira");
			String inId = sc.nextLine();
			Long id = null;

			if (verificaInput(inId, "long") == true) {
				id = Long.parseLong(inId);
			}
			while (verificaInput(inId, "long") == false) {
				System.out.println("Input invalido");
				System.out.println(" Insira o id da prateleira");
				inId = sc.nextLine();
			}
			while (hasId(id) == false) {
				System.out.println("Nao existe esse id");
				System.out.println(" Insira o id da prateleira");
				inId = sc.nextLine();
				if (verificaInput(inId, "long") == true) {
					id = Long.parseLong(inId);

				}

			}
			if (hasId(id) == true) {
				Shelf shelfAVer = shelfRepository.findById(id);

				System.out.println(" Detalhes da prateleira:");
				System.out.println(" Id: " + shelfAVer.getId());
				System.out.println(" Capacidade: " + shelfAVer.getCapacity());
				System.out.println(" Produto:");
				System.out.println(" Preco de aluguer/dia " + shelfAVer.getRentPrice());

				String input = sc.nextLine();
				if (input.equals("")) {
					ecraShelves();
				}
				while (hasId(id) == false) {
					System.out.println(" Nao existe essa prateleira");
					System.out.println(" Insira o id da prateleira");
					inId = sc.nextLine();
				}
			}
			sc.close();
		}

	}

	// **********************************Geral
	// ************************************
	public void sair() {

	}

	public boolean hasId(Long id) {
		if (shelfRepository.findById(id) == null) {
			return false;
		} else
			return true;
	}

	public void allShelves() {
		if (shelfRepository.isEmpty()) {
			System.out.println("Nao existem prateleiras");
			System.out.println("");
		} else {
			System.out.println("Prateleiras:");

			Iterator<Shelf> it = shelfRepository.getAll();
			while (it.hasNext()) {
				System.out.println(it.next().toString());
			}
		}
		System.out.println("");
	}

	public void allProducts() {
		if (productRepository.isEmpty()) {
			System.out.println("Nao existem produtos");

		} else {
			System.out.println("Produtos:");

			Iterator<Product> it = productRepository.getAll();
			while (it.hasNext()) {
				System.out.println(it.next().toString());
			}
		}
		System.out.println("");
	}

	public void allShelvesIds() {
		if (shelfRepository.isEmpty()) {
			System.out.println("Nao existem prateleiras");

		} else {
			System.out.println("Prateleiras disponiveis:");

			ArrayList<String> array = new ArrayList<String>();
			Iterator<Shelf> it = shelfRepository.getAll();
			while (it.hasNext()) {
				String ids = it.next().getId().toString();
				array.add(ids);
			}
			System.out.println(array);
		}
		System.out.println("");
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
