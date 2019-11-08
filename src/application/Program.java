package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
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

	}

}
