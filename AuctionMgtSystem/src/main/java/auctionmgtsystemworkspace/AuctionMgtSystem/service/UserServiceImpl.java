package auctionmgtsystemworkspace.AuctionMgtSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import auctionmgtsystemworkspace.AuctionMgtSystem.DAO.UserDao;
import auctionmgtsystemworkspace.AuctionMgtSystem.model.UserModel;

@Service //marks this class as a service in spring

public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Transactional //ensures that hibernates session is wrapped in a transaction.
	public void saveUser(UserModel userModel) {
		userDao.saveUser(userModel);
		System.out.println("user saved in the db");
		
	}
	@Transactional
	public List<UserModel> getAllUsers(){
		return userDao.getAllUsers();
	}
	@Transactional
	public void deleteUser(int id) {
		userDao.deleteUser(id);
	}
	@Transactional
	public UserModel getUserById(int id) {
		return userDao.getUserById(id);
	}
	@Transactional
	public void updateUser(UserModel userModel) {
		userDao.updateUser(userModel);
	}
}
