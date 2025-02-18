package auctionmgtsystemworkspace.AuctionMgtSystem.DAO;


import java.util.List;

import auctionmgtsystemworkspace.AuctionMgtSystem.model.UserModel;
public interface UserDao {
	//saving the user to the db
	public void saveUser(UserModel userModel);
	//getting all users
	public List<UserModel> getAllUsers();
	//getting a user to update by id.This method will help us get the actual user to update
	public UserModel getUserById(int id);
	//actual updating will happen hear
	public void updateUser(UserModel userModel);
	//deleting users
	public void deleteUser(int id);

}
