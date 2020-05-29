package dao;

import java.util.List;

import vo.SaleDetail;

public interface ISaleDetailDAO {
	public String getLastLsh(String day);
	public int insert(SaleDetail saleDetail);
	public List<SaleDetail> query(SaleDetail saleDetail);
}
