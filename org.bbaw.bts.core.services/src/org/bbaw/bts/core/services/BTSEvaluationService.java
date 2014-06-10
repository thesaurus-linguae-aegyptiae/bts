package org.bbaw.bts.core.services;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;

public interface BTSEvaluationService
{

	/** Returns list of all objects from the given list that are visible to user and thus filtered in.
	 * @param objects objects to filter.
	 * @return list of visible objects
	 */
	<T extends BTSDBBaseObject> List<T> filter(List<T> objects);

	/** Returns true if given object is to be filtered in, false if filtered out.
	 * @param object object to filter.
	 * @return true if filtered in.
	 */
	boolean filter(Object object);

	void computeSelection(Object selection);

	/** Returns true if given object is currently not locked by database backend.
	 * It starts a background process to acquire a lock for this object.
	 * @param object requested object.
	 * @return true if locked, false if not.
	 */
	boolean acquireLockOptimistic(Object object);
	
	/** Tries to acquire a lock for the given object. If this is not successful
	 * it returns false.
	 * Pessimistic locking.
	 * @param object object to be locked.
	 * @return true if locking successful
	 */
	boolean acquireLockStrict(Object object);
	
	/** Removes all previously acquired locks on this object.
	 * @param object object to be released.
	 */
	void unlock(Object object);

	/** returns highest user role the authenticated user holds in the given projectDBCollection.
	 * @param projectDBCollection requested dbCollection.
	 * @return highest userrole in given context.
	 */
	String highestRoleOfAuthenticatedUserInDBCollection(BTSProjectDBCollection projectDBCollection);
	
	/** Returns true if authenticated user is member of given list or if a user group is a member in which
	 * the user itself is a member.
	 * @param readerORUpdatersList list of readers or updaters containing usernames or group ids.
	 * @return if user is member.
	 */
	boolean authenticatedUserIsMember(List<String> readerORUpdatersList);

	boolean authenticatedUserHasLock(Object object);

	/** returns true if authenticated user is technically admin of database.
	 * @param remoteDBAdmin true to request if user is admin of remote database.
	 * @return true if authenticated user is admin of database.
	 */
	boolean authenticatedUserIsDBAdmin(boolean remoteDBAdmin);

	boolean authenticatedUserMaySyncDBColl(String dbCollectionName);
}
