package model.dao;

import db.DB;
import model.dao.Impl.DepartmentDaoJDBC;
import model.dao.Impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDAO createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}

	public static DepartmentDAO createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());

	}
}
