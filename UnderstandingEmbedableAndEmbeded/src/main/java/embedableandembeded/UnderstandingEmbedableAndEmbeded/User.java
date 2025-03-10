package embedableandembeded.UnderstandingEmbedableAndEmbeded;

public class User {
	 String name;
	 String job;
	 int age =24;
	 
	public User(String name, String job, int age) {
		this.name = name;
		this.job = job;
		this.age = age;
	}

	public static void main(String[] args) {
		User user = new User("", "Accountant", 24);
		System.out.println(user.name.isEmpty());
		 
	}

}
