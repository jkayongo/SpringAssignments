package ugandanfarmers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CentralFarmer {
	@Value("${userNames}")
	String userName;
	@Value("${password}")
	String password;
	public void printUserNameAndPassword() {
		System.out.println("Username: " + userName + "Password: " + password);
	}

}
