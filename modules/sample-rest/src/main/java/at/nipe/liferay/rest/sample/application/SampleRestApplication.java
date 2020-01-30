package at.nipe.liferay.rest.sample.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

@Component(
		property = {
			JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE + "=/trainings",
			JaxrsWhiteboardConstants.JAX_RS_NAME + "=Trainings.Rest",
			"jaxrs.application=true",
			"auth.verifier.guest.allowed=true",
	        "oauth2.scopechecker.type=none",
	        "liferay.access.control.disable=true"
		},
		service = Application.class
	)
public class SampleRestApplication extends Application {

	@Reference
	private TrainingsResource restUserResource;
	
	@Override
	public Set<Object> getSingletons() {		
		Set<Object> singles = new HashSet<>();
		
		singles.add(new JacksonJsonProvider());
		singles.add(restUserResource);
		
		return singles;
	}

}