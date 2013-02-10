package sample.rest.service.resource;

import java.util.HashMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import sample.rest.service.data.dummy.SampleContacts;
import sample.rest.service.model.Contact;

@Path("/contacts")
public class ContactsResource {
	
	
	@GET
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	public HashMap<Integer, Contact> getAllContacts() {
		return SampleContacts.getAllContacts();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Contact getContact(@PathParam("id") int id) {
		return SampleContacts.getContact(id);
	}
}
