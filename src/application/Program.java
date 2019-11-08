package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		SellerDAO sellerDAO = DaoFactory.createSellerDao();
		System.out.println("== Teste 1 : findById Vendedor ==");
		Seller seller = sellerDAO.findById(3);
		System.out.println(seller);
		
		System.out.println("\n == Teste 2 : findByDepartment Vendedor ==");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDAO.findByDepartment(dep);
		
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n == Teste 3 : findAll Vendedor ==");
		list = sellerDAO.findAll();
		
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n == Teste 4 : Insert Vendedor ==");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.99, dep);
		sellerDAO.insert(newSeller);
		System.out.println("Inserido! novo seller id =  " + newSeller.getId());
		
		System.out.println("\n == Teste 5 : Update Vendedor ==");
		seller = sellerDAO.findById(1);
		seller.setName("Fernando Torres");
		sellerDAO.update(seller);
		System.out.println("Update Completo");
		
		System.out.println("\n == Teste 6 : DeleteById Vendedor ==");
		System.out.print("Digite um ID para deleção: ");
		int id = input.nextInt();
		sellerDAO.deleteById(id);
		System.out.println("Delete concluido.");

		input.close();
	}

}
