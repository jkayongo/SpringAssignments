package auctionmgtsystemworkspace.AuctionMgtSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Users", schema = "jkayongodb")
@Entity
public class UserModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id",  nullable = false, unique = false)
	int id;
	String userName;
	@Column(name = "Email",  nullable = false, unique = false)
	String email;
	@Column(name = "Place_of_residence",  nullable = false, unique = false)
	String placeOfResidence;
	public UserModel() {
		
	}
	public UserModel(String userName, String email, String placeOfResidence) {
		this.userName = userName;
		this.email = email;
		this.placeOfResidence = placeOfResidence;
	}
	
	public int getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPlaceOfResidence() {
		return placeOfResidence;
	}
	public void setPlaceOfResidence(String placeOfResidence) {
		this.placeOfResidence = placeOfResidence;
	}
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", userName=" + userName + ", email=" + email + ", placeOfResidence="
				+ placeOfResidence + "]";
	}
	
	

}
