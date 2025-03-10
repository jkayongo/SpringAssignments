package guidetospringautowired;

import org.springframework.stereotype.Component;

@Component
public class Regulator {
	public String grantLicence() {
		return "Hey,your licence has been renewed.";
	}

}
