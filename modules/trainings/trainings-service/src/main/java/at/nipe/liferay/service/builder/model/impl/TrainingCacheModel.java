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

package at.nipe.liferay.service.builder.model.impl;

import at.nipe.liferay.service.builder.model.Training;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing Training in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class TrainingCacheModel
	implements CacheModel<Training>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TrainingCacheModel)) {
			return false;
		}

		TrainingCacheModel trainingCacheModel = (TrainingCacheModel)obj;

		if (trainingId == trainingCacheModel.trainingId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, trainingId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", trainingId=");
		sb.append(trainingId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", trainer=");
		sb.append(trainer);
		sb.append(", name=");
		sb.append(name);
		sb.append(", date=");
		sb.append(date);
		sb.append(", hours=");
		sb.append(hours);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Training toEntityModel() {
		TrainingImpl trainingImpl = new TrainingImpl();

		if (uuid == null) {
			trainingImpl.setUuid("");
		}
		else {
			trainingImpl.setUuid(uuid);
		}

		trainingImpl.setTrainingId(trainingId);
		trainingImpl.setGroupId(groupId);
		trainingImpl.setCompanyId(companyId);
		trainingImpl.setUserId(userId);

		if (userName == null) {
			trainingImpl.setUserName("");
		}
		else {
			trainingImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			trainingImpl.setCreateDate(null);
		}
		else {
			trainingImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			trainingImpl.setModifiedDate(null);
		}
		else {
			trainingImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (trainer == null) {
			trainingImpl.setTrainer("");
		}
		else {
			trainingImpl.setTrainer(trainer);
		}

		if (name == null) {
			trainingImpl.setName("");
		}
		else {
			trainingImpl.setName(name);
		}

		if (date == Long.MIN_VALUE) {
			trainingImpl.setDate(null);
		}
		else {
			trainingImpl.setDate(new Date(date));
		}

		trainingImpl.setHours(hours);

		trainingImpl.resetOriginalValues();

		return trainingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		trainingId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		trainer = objectInput.readUTF();
		name = objectInput.readUTF();
		date = objectInput.readLong();

		hours = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(trainingId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (trainer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(trainer);
		}

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeLong(date);

		objectOutput.writeDouble(hours);
	}

	public String uuid;
	public long trainingId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String trainer;
	public String name;
	public long date;
	public double hours;

}