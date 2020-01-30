/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package at.nipe.liferay.service.builder.service.impl;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;

import at.nipe.liferay.service.builder.model.Training;
import at.nipe.liferay.service.builder.service.base.TrainingLocalServiceBaseImpl;

/**
 * The implementation of the training local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>at.nipe.liferay.service.builder.service.TrainingLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TrainingLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=at.nipe.liferay.service.builder.model.Training",
	service = AopService.class
)
public class TrainingLocalServiceImpl extends TrainingLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>at.nipe.liferay.service.builder.service.TrainingLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>at.nipe.liferay.service.builder.service.TrainingLocalServiceUtil</code>.
	 */
	
	public Training addTraining(String name, String trainer, LocalDateTime date, double hours) throws PortalException{
		long trainingId = counterLocalService.increment();
		Training training = trainingPersistence.create(trainingId);
		training.setName(name);
		training.setTrainer(trainer);
		training.setHours(hours);
		
		training.setModifiedDate(new Date());
		
		ZoneId zoneId = ZoneId.systemDefault();
		
		training.setDate(Date.from(date.atZone(zoneId).toInstant()));
		
		return trainingPersistence.update(training);
	}
	
	public Training deleteTraining(long trainingId) throws PortalException{
		return deleteTraining(getTraining(trainingId));
	}
	
	public List<Training> getTrainingsByName(String name) {
		return trainingPersistence.findByN(name);
	}
	
	public List<Training> getTrainingsByTrainer(String trainer) {
		return trainingPersistence.findByT(trainer);
	}
	
	public List<Training> getTrainingsByNameAndTrainer(String name, String trainer) {
		return trainingPersistence.findByN_T(name, trainer);
	}
	
	public int getTrainingCountByTrainer(String trainer) {
		return trainingPersistence.countByT(trainer);
	}
}