package fieldbaseddependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class MukonoFarmer implements Crop {
	public String typeOfCrop() {
		return "Maize";
	}
	public String typeOfSeason() {
		return "dry season";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
