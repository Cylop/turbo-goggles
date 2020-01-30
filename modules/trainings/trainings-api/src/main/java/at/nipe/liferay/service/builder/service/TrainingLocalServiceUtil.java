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

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * Provides the local service utility for Training. This utility wraps
 * <code>at.nipe.liferay.service.builder.service.impl.TrainingLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TrainingLocalService
 * @generated
 */
@ProviderType
public class TrainingLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>at.nipe.liferay.service.builder.service.impl.TrainingLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static at.nipe.liferay.service.builder.model.Training addTraining(
			String name, String trainer, java.time.LocalDateTime date,
			double hours)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addTraining(name, trainer, date, hours);
	}

	/**
	 * Adds the training to the database. Also notifies the appropriate model listeners.
	 *
	 * @param training the training
	 * @return the training that was added
	 */
	public static at.nipe.liferay.service.builder.model.Training addTraining(
		at.nipe.liferay.service.builder.model.Training training) {

		return getService().addTraining(training);
	}

	/**
	 * Creates a new training with the primary key. Does not add the training to the database.
	 *
	 * @param trainingId the primary key for the new training
	 * @return the new training
	 */
	public static at.nipe.liferay.service.builder.model.Training createTraining(
		long trainingId) {

		return getService().createTraining(trainingId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the training with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param trainingId the primary key of the training
	 * @return the training that was removed
	 * @throws PortalException if a training with the primary key could not be found
	 */
	public static at.nipe.liferay.service.builder.model.Training deleteTraining(
			long trainingId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteTraining(trainingId);
	}

	/**
	 * Deletes the training from the database. Also notifies the appropriate model listeners.
	 *
	 * @param training the training
	 * @return the training that was removed
	 */
	public static at.nipe.liferay.service.builder.model.Training deleteTraining(
		at.nipe.liferay.service.builder.model.Training training) {

		return getService().deleteTraining(training);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static at.nipe.liferay.service.builder.model.Training fetchTraining(
		long trainingId) {

		return getService().fetchTraining(trainingId);
	}

	/**
	 * Returns the training matching the UUID and group.
	 *
	 * @param uuid the training's UUID
	 * @param groupId the primary key of the group
	 * @return the matching training, or <code>null</code> if a matching training could not be found
	 */
	public static at.nipe.liferay.service.builder.model.Training
		fetchTrainingByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchTrainingByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the training with the primary key.
	 *
	 * @param trainingId the primary key of the training
	 * @return the training
	 * @throws PortalException if a training with the primary key could not be found
	 */
	public static at.nipe.liferay.service.builder.model.Training getTraining(
			long trainingId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getTraining(trainingId);
	}

	/**
	 * Returns the training matching the UUID and group.
	 *
	 * @param uuid the training's UUID
	 * @param groupId the primary key of the group
	 * @return the matching training
	 * @throws PortalException if a matching training could not be found
	 */
	public static at.nipe.liferay.service.builder.model.Training
			getTrainingByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getTrainingByUuidAndGroupId(uuid, groupId);
	}

	public static int getTrainingCountByTrainer(String trainer) {
		return getService().getTrainingCountByTrainer(trainer);
	}

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
	public static java.util.List<at.nipe.liferay.service.builder.model.Training>
		getTrainings(int start, int end) {

		return getService().getTrainings(start, end);
	}

	public static java.util.List<at.nipe.liferay.service.builder.model.Training>
		getTrainingsByName(String name) {

		return getService().getTrainingsByName(name);
	}

	public static java.util.List<at.nipe.liferay.service.builder.model.Training>
		getTrainingsByNameAndTrainer(String name, String trainer) {

		return getService().getTrainingsByNameAndTrainer(name, trainer);
	}

	public static java.util.List<at.nipe.liferay.service.builder.model.Training>
		getTrainingsByTrainer(String trainer) {

		return getService().getTrainingsByTrainer(trainer);
	}

	/**
	 * Returns all the trainings matching the UUID and company.
	 *
	 * @param uuid the UUID of the trainings
	 * @param companyId the primary key of the company
	 * @return the matching trainings, or an empty list if no matches were found
	 */
	public static java.util.List<at.nipe.liferay.service.builder.model.Training>
		getTrainingsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getTrainingsByUuidAndCompanyId(uuid, companyId);
	}

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
	public static java.util.List<at.nipe.liferay.service.builder.model.Training>
		getTrainingsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<at.nipe.liferay.service.builder.model.Training>
					orderByComparator) {

		return getService().getTrainingsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of trainings.
	 *
	 * @return the number of trainings
	 */
	public static int getTrainingsCount() {
		return getService().getTrainingsCount();
	}

	/**
	 * Updates the training in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param training the training
	 * @return the training that was updated
	 */
	public static at.nipe.liferay.service.builder.model.Training updateTraining(
		at.nipe.liferay.service.builder.model.Training training) {

		return getService().updateTraining(training);
	}

	public static TrainingLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TrainingLocalService, TrainingLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(TrainingLocalService.class);

		ServiceTracker<TrainingLocalService, TrainingLocalService>
			serviceTracker =
				new ServiceTracker<TrainingLocalService, TrainingLocalService>(
					bundle.getBundleContext(), TrainingLocalService.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}