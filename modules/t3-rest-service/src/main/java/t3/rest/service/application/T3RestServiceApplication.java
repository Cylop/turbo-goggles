package t3.rest.service.application;

import java.util.Collections;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

/**
 * @author nicholas.petrasek
 */
@Component(
	property = {
		JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE + "=/t3",
		JaxrsWhiteboardConstants.JAX_RS_NAME + "=T3.Rest"
	},
	service = Application.class
)
@Produces("application/json")
public class T3RestServiceApplication extends Application {

	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}

	@GET
	public Message working() {
		return new Message("It works!");
	}

	@GET
	@Path("/morning")
	public Message hello() {
		return new Message("Good morning!");
	}

	@GET
	@Path("/morning/{name}")
	public Message morning(
		@PathParam("name") String name,
		@QueryParam("drink") String drink) {

		String greeting = "Good Morning " + name;

		if (drink != null) {
			greeting += ". Would you like some " + drink + "?";
		}

		return new Message(greeting);
	}

}