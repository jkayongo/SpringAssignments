package auctionmgtsystemworkspace.AuctionMgtSystem.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import auctionmgtsystemworkspace.AuctionMgtSystem.model.UserModel;

@Repository //marks this class a dao in Spring
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;
	public void saveUser(UserModel userModel) {
		//getting the current session
		Session session = sessionFactory.getCurrentSession();
		session.persist(userModel);
		System.out.println("You have successfully saved a user");
		
	}
	// implementation for getting all users
		public List<UserModel> getAllUsers(){
			Session session = sessionFactory.getCurrentSession();
			List<UserModel> users = session.createQuery("FROM UserModel", UserModel.class).getResultList();
			return users;
		}
		//getting a user to update by id
		public UserModel getUserById(int id) {
			Session session = sessionFactory.getCurrentSession();
			UserModel userModel = (UserModel) session.get(UserModel.class, new Integer(id));
			return userModel;
			
		}
		//implementation for updating users
		public void updateUser(UserModel userModel) {
			Session session = sessionFactory.getCurrentSession();
			session.update(userModel);			
	}
//		//implementation for deleting users
		public void deleteUser(int id) {
			Session session = sessionFactory.getCurrentSession();
			UserModel userToDelete = (UserModel) session.get(UserModel.class, new Integer(id));
			if(userToDelete != null) {
				session.delete(userToDelete);
			}else {
				System.out.println("User does not exist");
			}
			
		}

}
