package autowiredresourceandinject;

import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;
@Component
public class DogFarmer {
	@Resource
	VeterinaryDoctor veterinaryDoctor;
	public void checkUpStatus() {
		System.out.println("Status: " + veterinaryDoctor.notification());
	}

}
