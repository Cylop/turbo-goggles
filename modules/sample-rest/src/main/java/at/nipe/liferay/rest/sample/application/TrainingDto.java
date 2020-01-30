package at.nipe.liferay.rest.sample.application;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import at.nipe.liferay.service.builder.model.Training;

@XmlRootElement
public class TrainingDto {

	private long trainingId;
	private String name, trainer;
	
	@JsonDeserialize(using = DateDeserializer.class)
	private LocalDateTime date;
	
	private double hours;
	
	public TrainingDto(Training training) {
		this(training.getTrainingId(), training.getName(), training.getTrainer(), convertDateToLocalDateTime(training.getDate()), training.getHours());
	}
	
	public TrainingDto(long trainingId, String name, String trainer, LocalDateTime date, double hours) {
		this.setTrainingId(trainingId);
		this.name = name;
		this.trainer = trainer;
		this.date = date;
		this.hours = hours;
	}
	
	public TrainingDto() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
	
	private static LocalDateTime convertDateToLocalDateTime(Date date) {
		return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
	}

	public long getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(long trainingId) {
		this.trainingId = trainingId;
	}
}
