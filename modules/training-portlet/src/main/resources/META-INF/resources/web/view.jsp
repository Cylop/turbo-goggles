<%@ include file="../init.jsp" %>

<%
	TrainingLocalService trainingService = (TrainingLocalService) request.getAttribute("trainingService");
%>

<aui:button-row cssClass="trainings-buttons">

	<portlet:renderURL var="addEntryURL">
		<portlet:param name="mvcPath"
			value="/web/edit_entry.jsp" />
	</portlet:renderURL>

	<aui:button onClick="<%=addEntryURL.toString()%>" value="Add Training"></aui:button>

</aui:button-row>

<liferay-ui:search-container
	total="<%=trainingService.getTrainingsCount()%>">
	<liferay-ui:search-container-results
		results="<%=trainingService.getTrainings(searchContainer.getStart(), searchContainer.getEnd())%>" />

	<liferay-ui:search-container-row
		className="at.nipe.liferay.service.builder.model.Training" modelVar="training">

		<liferay-ui:search-container-column-text property="name" />
		<liferay-ui:search-container-column-text property="trainer" />
		<liferay-ui:search-container-column-date property="date" />
		<liferay-ui:search-container-column-text property="hours" />
		

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>
