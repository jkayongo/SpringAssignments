package fieldbaseddependencyinjection;

import org.springframework.stereotype.Service;

@Service
public interface Crop {
	public String typeOfCrop();
	public String typeOfSeason();

}
