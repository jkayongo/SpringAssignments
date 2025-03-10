package relationships.Relationships;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "Transcripts", schema = "kayongosdb")
public class Transcript {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", length = 50, nullable = false, unique = false)
	private int id;
	@Column(name = "University", length = 50, nullable = false, unique = false)
	private String university;
	@Column(name = "Year Finished", length = 50, nullable = false, unique = false)
	private int year;
	//Learners_id will be a new column that is going to store the foreign key, it will appear in the transcript table only.
	@OneToOne
	@JoinColumn(name = "Learners_id", referencedColumnName = "id")
	private Learner learner;
	

	public Transcript(String university, int year, Learner learner) {
		this.university = university;
		this.year = year;
		this.learner = learner;
	}
	public Transcript() {
		
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getUniversity() {
		return university;
	}



	public void setUniversity(String university) {
		this.university = university;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public Learner getLearner() {
		return learner;
	}



	public void setLearner(Learner learner) {
		this.learner = learner;
	}



	public static void main(String[] args) {
		

	}

}
