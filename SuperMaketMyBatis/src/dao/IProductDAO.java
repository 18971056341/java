package dao;

import java.util.List;

import vo.Product;

public interface IProductDAO {
	public Product getById(String id);
	public int insert(Product product);
	public List<Product> query(Product product);
}
