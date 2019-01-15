package hssService;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hss.Person;
import com.hssDAO.PersonDAO;

@Path("/hackathon")
public class PersonService {

	PersonDAO personDAO = new PersonDAO();

	@GET
	@Path("/persons")
	@Produces(MediaType.APPLICATION_XML)
	public List<Person> getAllPersons() {
		return personDAO.getAllPersons();
	}

	@GET
	@Path("/persons/{personid}")
	@Produces(MediaType.APPLICATION_XML)
	public Person getUser(@PathParam("personid") int personid) {
		return personDAO.getPerson(personid);
	}
	
}
