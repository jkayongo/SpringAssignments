package guidetospringautowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ExtensionOfficer {
	@Autowired
	Regulator regulator;
	public void licenseStatus() {
		System.out.println("License status: "+ regulator.grantLicence());
	}
	

}
