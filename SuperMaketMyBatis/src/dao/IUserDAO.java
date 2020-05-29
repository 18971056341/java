package dao;

import vo.User;

public interface IUserDAO {
	public User getById(String userName);
	public int update(User user);
}
