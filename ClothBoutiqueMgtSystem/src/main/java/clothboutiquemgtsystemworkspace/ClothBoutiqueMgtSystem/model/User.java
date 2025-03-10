package clothboutiquemgtsystemworkspace.ClothBoutiqueMgtSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "cloth_boutique_users", schema = "jkayongodb")
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	int id;
	@Column(name = "Email", nullable = false, unique = false)
	String email;
	@Column(name = "First_name", nullable = false, unique = false)
	String firstName;
	@Column(name = "Last_name", nullable = false, unique = false)
	String lastName;
	@Column(name = "Password", nullable = false, unique = false)
	String password;
	@Column(name = "Role", nullable = false, unique = false)
	String role;
	
	public User() {
		
	}

	public User(String email, String firstName, String lastName, String password, String role) {
		
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
