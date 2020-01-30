package at.nipe.liferay.training.portlet.portlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import at.nipe.liferay.service.builder.service.TrainingLocalService;
import at.nipe.liferay.training.portlet.constants.TrainingPortletKeys;

/**
 * @author nicholas.petrasek
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=Education",
		"com.liferay.portlet.header-portlet-css=/css/main.css", "com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Training", "javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/web/view.jsp", "javax.portlet.name=" + TrainingPortletKeys.TRAINING,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class TrainingPortlet extends MVCPortlet {

	@Reference
	private TrainingLocalService trainingService;
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		renderRequest.setAttribute("trainingService", trainingService);	
		
		super.render(renderRequest, renderResponse);
	}
}