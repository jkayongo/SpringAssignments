package autowiredresourceandinject;

import org.springframework.stereotype.Component;

@Component
public class TeaFarmer1 implements FertilizerUsage {
	public String typeOfFertilizer() {
		return "Potassium phosphates.";
	}
	public int amountToUse() {
		return 200;
	}
}
