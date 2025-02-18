package auctionmgtsystemworkspace.AuctionMgtSystem.service;


import java.util.List;

import auctionmgtsystemworkspace.AuctionMgtSystem.model.UserModel;
public interface UserService {
	public void saveUser(UserModel userModel);
	public List<UserModel> getAllUsers();
	public void deleteUser(int id);
	//getting a user to update by id
	public UserModel getUserById(int id);
	public void updateUser(UserModel userModel);

}
