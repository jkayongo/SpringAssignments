package persistingenums;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
@Converter
//@Converter tells jpa that this class is for converting attributes
public class DaysOfTheWeekConverter implements AttributeConverter<DaysOfTheWeek, String> {
	@Override
	//method converting an enum to a string that can be stored in the database
	public String convertToDatabaseColumn(DaysOfTheWeek daysOfTheWeek) {
		//handling null values
		if(daysOfTheWeek == null) {
			return null;
		}
		switch(daysOfTheWeek) {
			case MONDAY:
				return "Mon";
			case TUESDAY:
				return "Tue";
			case WEDNESDAY:
				return "Wed";
			case THURSDAY:
				return "Thurs";	
			case FRIDAY:
				return "Fri";
			case SATURDAY:
				return "Sat";
			default:
				return "input correct day of the week";
		}
		
	}
	@Override
	public DaysOfTheWeek convertToEntityAttribute(String databaseValue) {
		//handling null cases
		if(databaseValue == null) {
			return null;
		}
		switch(databaseValue) {
			case "Mon":
				return  DaysOfTheWeek.MONDAY;
			case "Tue":
				return  DaysOfTheWeek.TUESDAY;
			case "Wed":
				return  DaysOfTheWeek.WEDNESDAY;
			case "Thurs":
				return  DaysOfTheWeek.THURSDAY;
			case "Fri":
				return  DaysOfTheWeek.FRIDAY;
			case "Sat":
				return  DaysOfTheWeek.SATURDAY;
			default:
				return null;
		}
		
	}

	public static void main(String[] args) {
		

	}

}
