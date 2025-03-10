package hajjiwifeanalogyforonetomanyrelationship;

import java.util.HashSet;

public class CheckingForEquality {
	private int id;
	private String firstName;
	private String lastName;
	
	

	public CheckingForEquality(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	



	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
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

	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Reference equality check
        if (!(obj instanceof CheckingForEquality)) return false; // Type check
        
        
        CheckingForEquality other = (CheckingForEquality) obj;
        //these two are equal if their last names are the same
        return this.lastName == other.lastName; // Comparing values
    }
	// Overriding hashCode() method is also recommended
    @Override
    public int hashCode() {
    	
        return lastName.hashCode(); //if hashcode is the same,they're the same objects
    }


	public static void main(String[] args) {
		CheckingForEquality student = new CheckingForEquality(1, "Phillipe", "Mateta");
		CheckingForEquality student2 = new CheckingForEquality(1, "Joshua", "Mateta");
		HashSet<CheckingForEquality> students = new HashSet<CheckingForEquality>();
		students.add(student);
		students.add(student2);
		System.out.println("the number of students is: " + students.size());
		System.out.println(student.equals(student2));
		System.out.println(student.hashCode());
		System.out.println(student2.hashCode());
		
		
		
		
		
		
		
	}

}
