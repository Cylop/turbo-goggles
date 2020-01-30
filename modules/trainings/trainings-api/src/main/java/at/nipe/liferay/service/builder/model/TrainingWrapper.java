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

package at.nipe.liferay.service.builder.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link Training}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Training
 * @generated
 */
@ProviderType
public class TrainingWrapper
	extends BaseModelWrapper<Training>
	implements Training, ModelWrapper<Training> {

	public TrainingWrapper(Training training) {
		super(training);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("trainingId", getTrainingId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("trainer", getTrainer());
		attributes.put("name", getName());
		attributes.put("date", getDate());
		attributes.put("hours", getHours());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long trainingId = (Long)attributes.get("trainingId");

		if (trainingId != null) {
			setTrainingId(trainingId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String trainer = (String)attributes.get("trainer");

		if (trainer != null) {
			setTrainer(trainer);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Date date = (Date)attributes.get("date");

		if (date != null) {
			setDate(date);
		}

		Double hours = (Double)attributes.get("hours");

		if (hours != null) {
			setHours(hours);
		}
	}

	/**
	 * Returns the company ID of this training.
	 *
	 * @return the company ID of this training
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this training.
	 *
	 * @return the create date of this training
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of this training.
	 *
	 * @return the date of this training
	 */
	@Override
	public Date getDate() {
		return model.getDate();
	}

	/**
	 * Returns the group ID of this training.
	 *
	 * @return the group ID of this training
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hours of this training.
	 *
	 * @return the hours of this training
	 */
	@Override
	public Double getHours() {
		return model.getHours();
	}

	/**
	 * Returns the modified date of this training.
	 *
	 * @return the modified date of this training
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this training.
	 *
	 * @return the name of this training
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this training.
	 *
	 * @return the primary key of this training
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the trainer of this training.
	 *
	 * @return the trainer of this training
	 */
	@Override
	public String getTrainer() {
		return model.getTrainer();
	}

	/**
	 * Returns the training ID of this training.
	 *
	 * @return the training ID of this training
	 */
	@Override
	public long getTrainingId() {
		return model.getTrainingId();
	}

	/**
	 * Returns the user ID of this training.
	 *
	 * @return the user ID of this training
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this training.
	 *
	 * @return the user name of this training
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this training.
	 *
	 * @return the user uuid of this training
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this training.
	 *
	 * @return the uuid of this training
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this training.
	 *
	 * @param companyId the company ID of this training
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this training.
	 *
	 * @param createDate the create date of this training
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of this training.
	 *
	 * @param date the date of this training
	 */
	@Override
	public void setDate(Date date) {
		model.setDate(date);
	}

	/**
	 * Sets the group ID of this training.
	 *
	 * @param groupId the group ID of this training
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hours of this training.
	 *
	 * @param hours the hours of this training
	 */
	@Override
	public void setHours(Double hours) {
		model.setHours(hours);
	}

	/**
	 * Sets the modified date of this training.
	 *
	 * @param modifiedDate the modified date of this training
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this training.
	 *
	 * @param name the name of this training
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this training.
	 *
	 * @param primaryKey the primary key of this training
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the trainer of this training.
	 *
	 * @param trainer the trainer of this training
	 */
	@Override
	public void setTrainer(String trainer) {
		model.setTrainer(trainer);
	}

	/**
	 * Sets the training ID of this training.
	 *
	 * @param trainingId the training ID of this training
	 */
	@Override
	public void setTrainingId(long trainingId) {
		model.setTrainingId(trainingId);
	}

	/**
	 * Sets the user ID of this training.
	 *
	 * @param userId the user ID of this training
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this training.
	 *
	 * @param userName the user name of this training
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this training.
	 *
	 * @param userUuid the user uuid of this training
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this training.
	 *
	 * @param uuid the uuid of this training
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected TrainingWrapper wrap(Training training) {
		return new TrainingWrapper(training);
	}

}