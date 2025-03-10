package autowiredresourceandinject;

import org.springframework.stereotype.Component;

@Component
public class VeterinaryDoctor {
	public String notification() {
		return "Time for checkup.";
	}

}
