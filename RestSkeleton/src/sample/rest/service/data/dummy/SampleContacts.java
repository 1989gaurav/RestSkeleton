package sample.rest.service.data.dummy;

import java.util.HashMap;

import sample.rest.service.model.Contact;


public class SampleContacts {
	public static HashMap<Integer, Contact> myContacts ;
	
	static {
		myContacts = new HashMap<Integer,Contact>();
		Contact a = new Contact("A", "addressA", "contactNumberA", "emailIdA");
		Contact b = new Contact("B", "addressB", "contactNumberB", "emailIdB");
		Contact c = new Contact("C", "addressC", "contactNumberC", "emailIdC");
		Contact d = new Contact("D", "addressD", "contactNumberD", "emailIdD");
		Contact e = new Contact("E", "addressE", "contactNumberE", "emailIdE");
		myContacts.put(1, a);
		myContacts.put(2, b);
		myContacts.put(3, c);
		myContacts.put(4, d);
		myContacts.put(5, e);
	}
	
	public static HashMap<Integer, Contact> getAllContacts() {
		return myContacts;
	}
	
	public static Contact getContact(int id) {
		return myContacts.get(id);
	}
}
