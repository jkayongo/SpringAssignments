package autowiredresourceandinject;

import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;
@Component
public class FertilizerUsageApp {
	@Resource
	FertilizerUsage teaFarmer1;
	public void fertilizerStatus() {
		System.out.println("Type of fertilizer: " + teaFarmer1.typeOfFertilizer() + "Amount: " + teaFarmer1.amountToUse());
	}

}
