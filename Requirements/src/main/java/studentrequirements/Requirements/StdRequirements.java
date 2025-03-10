package studentrequirements.Requirements;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StdRequirements {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Student_id", length = 50, nullable = false, unique = false)
	int studentId;
	@Column(name = "Uniform", length = 50, nullable = false, unique = false)
	String uniform;
	@Column(name = "Fees", length = 50, nullable = false, unique = false)
	int fees;
	@Column(name = "Suit_case", length = 50, nullable = false, unique = false)
	String suitCase;
	@Column(name = "Books", length = 50, nullable = false, unique = false)
	int books;
	

	public StdRequirements(String uniform, int fees, String suitCase, int books) {
		super();
		this.uniform = uniform;
		this.fees = fees;
		this.suitCase = suitCase;
		this.books = books;
	}
	
	public StdRequirements() {
		
	}
	
	


	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getUniform() {
		return uniform;
	}

	public void setUniform(String uniform) {
		this.uniform = uniform;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public String getSuitCase() {
		return suitCase;
	}

	public void setSuitCase(String suitCase) {
		this.suitCase = suitCase;
	}

	public int getBooks() {
		return books;
	}

	public void setBooks(int books) {
		this.books = books;
	}

	public static void main(String[] args) {
		

	}

}
