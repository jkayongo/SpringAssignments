package fieldbaseddependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class GuluFarmer implements Crop {
	public String typeOfCrop() {
		return "soya peas";
	}
	public String typeOfSeason() {
		return "wet season";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
