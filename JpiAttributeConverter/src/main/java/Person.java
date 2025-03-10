import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Person {

	public static void main(String[] args) {
		try {
            FileInputStream fileIn = new FileInputStream("user.xml");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            User user = (User) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Deserialized Employee:");
            System.out.println("Userid: " + user.getUserId());
            System.out.println("Username: " + user.getUserName());
            System.out.println("Useremail: " + user.getUserEmail());
            
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
