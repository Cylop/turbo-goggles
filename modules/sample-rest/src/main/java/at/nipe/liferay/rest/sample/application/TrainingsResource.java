package at.nipe.liferay.rest.sample.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import at.nipe.liferay.service.builder.model.Training;
import at.nipe.liferay.service.builder.service.TrainingLocalService;

@Produces("application/json")
@Component(immediate = true, service = TrainingsResource.class)
public class TrainingsResource {
	
	@Reference
	private TrainingLocalService trainingService;
	
	@GET
	public List<TrainingDto> getAllTrainings(@QueryParam("training") String training) {
		List<TrainingDto> trainings = new ArrayList<>();
		if(null != training && !training.isEmpty()) {
			trainings = mapTrainingToDto(trainingService.getTrainingsByName(training));
		}else {
			trainings =  mapTrainingToDto(trainingService.getTrainings(-1, -1));
		}
		
		return trainings;
	}
	
	@POST
	public TrainingDto createNewTraining(TrainingDto training) {
		Training statement = null;
		try {
			statement = trainingService.addTraining(training.getName(), training.getTrainer(), training.getDate(), training.getHours());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new TrainingDto(statement);
	}
	
	@DELETE
	public List<TrainingDto> dropTrainings() { //Only for testing..
		List<Training> trainings = this.trainingService.getTrainings(-1, -1);
		
		trainings.forEach(this.trainingService::deleteTraining);
		
		return mapTrainingToDto(trainings);
	}
	
	private List<TrainingDto> mapTrainingToDto(List<Training> trainings) {
		return trainings.stream().map(TrainingDto::new).collect(Collectors.toList());
	}
} 
