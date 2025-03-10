package learningjpiattributeconverter.JpiAttributeConverter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
@Converter
//@Converter-tells jpa that this class is responsible for converting attributes
public class ContactConverter implements AttributeConverter<Contact, String> {
	private static final String SEPARATOR = ", ";

    @Override
    public String convertToDatabaseColumn(Contact contact) {
        //handling null cases
    	if (contact == null) {
            return null;
        }
    	//building database string
        StringBuilder sb = new StringBuilder();
        if(contact.getPhoneNumber() != null && !contact.getPhoneNumber().isEmpty()) {
        	sb.append(contact.getPhoneNumber());
        	sb.append(SEPARATOR);
        }

        if(contact.getEmail() != null && !contact.getEmail().isEmpty()) {
        	sb.append(contact.getEmail());
        }

        return sb.toString();
    }

    @Override
    //converting back to entity attribute.This method converts a database string back into a Contact object.
    public Contact convertToEntityAttribute(String dbContact) {
        //handling null or empty strings
    	if (dbContact == null || dbContact.isEmpty()) {
    		return null;
    	}
    	//split the String
    	String[] contacts = dbContact.split(SEPARATOR);
    	//handle empty contacts array.why do this?
    	if(contacts == null || contacts.length == 0) {
    		return null;
    	}
    	//reconstruct the contact object
    	Contact contact = new Contact();
    	//now set the phone number
    	String individualPhoneNumber = !contacts[0].isEmpty() ? contacts[0] : null;
    	contact.setPhoneNumber(individualPhoneNumber);
    	if(contacts.length >= 2 && contacts[1] != null && !contacts[1].isEmpty()) {
    		contact.setEmail(contacts[1]);
    	}
    	return contact;
    	
    	
    		
    	}


	public static void main(String[] args) {
		

	}
 
}
