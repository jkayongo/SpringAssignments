package autowiringbyprimaryannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainAppForFarmersSeasonActivities {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigForFarmersSeasons.class);
		SeasonActivities seasonActivityForFarmer2 = context.getBean(SeasonActivities.class);
		seasonActivityForFarmer2.activity();

	}

}
