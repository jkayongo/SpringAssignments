package relationships.Relationships;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Learners", schema = "kayongosdb")
public class Learner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", length = 255, nullable = false, unique = false)
	private int id;
	@Column(name = "Name", length = 255, nullable = false, unique = false)
	private String learnerName;
	@Column(name = "Course", length = 255, nullable = false, unique = false)
	private String course;
	@OneToOne(mappedBy = "learner", cascade = CascadeType.ALL)
	private Transcript transcript;
	
	

	public Learner(String learnerName, String course, Transcript transcript) {
		
		
		this.learnerName = learnerName;
		this.course = course;
		this.transcript = transcript;
	}
	
	public Learner() {
		
	}


	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getLearnerName() {
		return learnerName;
	}




	public void setLearnerName(String learnerName) {
		this.learnerName = learnerName;
	}




	public String getCourse() {
		return course;
	}




	public void setCourse(String course) {
		this.course = course;
	}




	public Transcript getTranscript() {
		return transcript;
	}




	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}




	public static void main(String[] args) {
		

	}

}
