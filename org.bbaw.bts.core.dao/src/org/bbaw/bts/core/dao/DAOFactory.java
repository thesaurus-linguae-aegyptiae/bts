package org.bbaw.bts.core.dao;

public abstract class DAOFactory {
	
    /**
     * Factory method for instantiation of concrete factories.
     */

	public static DAOFactory instance(Class<?> factory) {
        try {
            return (DAOFactory)factory.getConstructor().newInstance();
        } catch (Exception ex) {
            throw new RuntimeException("Couldn't create DAOFactory: " + factory);
        }
    }

    // Add your DAO interfaces here
    public abstract BTSAnnotationDao getBTSAnnotationDao();
    public abstract BTSConfigurationDao getBTSConfigurationDao();
    public abstract BTSImageDao getBTSImageDao();
    public abstract BTSListEntryDao getBTSListEntryDao();
    public abstract BTSTCObjectDao getBTSTCObjectDao();
    public abstract BTSTextCorpusDao getBTSTextCorpusDao();
    public abstract BTSTextDao getBTSTextDao();
    public abstract BTSUserDao getBTSUserDao();
    public abstract BTSUserGroupDao getBTSUserGroupDao();


}
