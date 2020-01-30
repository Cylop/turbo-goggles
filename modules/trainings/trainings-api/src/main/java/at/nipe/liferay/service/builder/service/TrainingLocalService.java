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

package at.nipe.liferay.service.builder.service;

import at.nipe.liferay.service.builder.model.Training;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.time.LocalDateTime;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for Training. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see TrainingLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface TrainingLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TrainingLocalServiceUtil} to access the training local service. Add custom service methods to <code>at.nipe.liferay.service.builder.service.impl.TrainingLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public Training addTraining(
			String name, String trainer, LocalDateTime date, double hours)
		throws PortalException;

	/**
	 * Adds the training to the database. Also notifies the appropriate model listeners.
	 *
	 * @param training the training
	 * @return the training that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Training addTraining(Training training);

	/**
	 * Creates a new training with the primary key. Does not add the training to the database.
	 *
	 * @param trainingId the primary key for the new training
	 * @return the new training
	 */
	@Transactional(enabled = false)
	public Training createTraining(long trainingId);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	 * Deletes the training with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param trainingId the primary key of the training
	 * @return the training that was removed
	 * @throws PortalException if a training with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public Training deleteTraining(long trainingId) throws PortalException;

	/**
	 * Deletes the training from the database. Also notifies the appropriate model listeners.
	 *
	 * @param training the training
	 * @return the training that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public Training deleteTraining(Training training);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>at.nipe.liferay.service.builder.model.impl.TrainingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>at.nipe.liferay.service.builder.model.impl.TrainingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Training fetchTraining(long trainingId);

	/**
	 * Returns the training matching the UUID and group.
	 *
	 * @param uuid the training's UUID
	 * @param groupId the primary key of the group
	 * @return the matching training, or <code>null</code> if a matching training could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Training fetchTrainingByUuidAndGroupId(String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Returns the training with the primary key.
	 *
	 * @param trainingId the primary key of the training
	 * @return the training
	 * @throws PortalException if a training with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Training getTraining(long trainingId) throws PortalException;

	/**
	 * Returns the training matching the UUID and group.
	 *
	 * @param uuid the training's UUID
	 * @param groupId the primary key of the group
	 * @return the matching training
	 * @throws PortalException if a matching training could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Training getTrainingByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getTrainingCountByTrainer(String trainer);

	/**
	 * Returns a range of all the trainings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>at.nipe.liferay.service.builder.model.impl.TrainingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of trainings
	 * @param end the upper bound of the range of trainings (not inclusive)
	 * @return the range of trainings
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Training> getTrainings(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Training> getTrainingsByName(String name);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Training> getTrainingsByNameAndTrainer(
		String name, String trainer);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Training> getTrainingsByTrainer(String trainer);

	/**
	 * Returns all the trainings matching the UUID and company.
	 *
	 * @param uuid the UUID of the trainings
	 * @param companyId the primary key of the company
	 * @return the matching trainings, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Training> getTrainingsByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	 * Returns a range of trainings matching the UUID and company.
	 *
	 * @param uuid the UUID of the trainings
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of trainings
	 * @param end the upper bound of the range of trainings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching trainings, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Training> getTrainingsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Training> orderByComparator);

	/**
	 * Returns the number of trainings.
	 *
	 * @return the number of trainings
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getTrainingsCount();

	/**
	 * Updates the training in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param training the training
	 * @return the training that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Training updateTraining(Training training);

}