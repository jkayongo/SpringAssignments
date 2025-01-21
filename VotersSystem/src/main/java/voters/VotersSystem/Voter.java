package voters.VotersSystem;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class Voter {
	@Profile("dev")
	public void voterStatus() {
		System.out.println("You are a registered voter");
	}
	@Profile("test")
	public void checkNationality() {
		System.out.println("Ugandan");
	}

}
