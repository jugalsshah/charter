package com.learnlogic.system.rental.databaseConfig;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.transform.DistinctRootEntityResultTransformer;
import org.hibernate.type.EntityType;
//import org.hibernate.type.EntityType;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;


@SuppressWarnings("hiding")
public abstract class GenericDaoImpl<EntityType, IDType extends Serializable> extends HibernateDaoSupport implements GenericDao<EntityType, IDType> {

    private final Class<EntityType> persistentClass;

    
    @SuppressWarnings("unchecked")
	public GenericDaoImpl() {
		// TODO Auto-generated constructor stub
	persistentClass= (Class<EntityType>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
    
//    @Autowired
//    private SessionFactory factory;
//    protected Session getSession() {
//        return factory.getCurrentSession();
//    }
    @Autowired
    public void init(SessionFactory sessionFactory) {
        setSessionFactory(sessionFactory);
        
       // currentSession();
    }
//    
    /**  
     * get the persistent class
     *
     * @return
     */
    public Class<EntityType> getPersistentClass() {
        return persistentClass;
    }
    
    
    
//    @Override
//    protected HibernateTemplate createHibernateTemplate(SessionFactory sessionFactory) {
//        return super.createHibernateTemplate(sessionFactory); //To change body of generated methods, choose Tools | Templates.
//    }
    
    /**
     * Retrive entity by id
     *
     * @param id of type IDType
     * @return Object of type EntityType
     */
    @SuppressWarnings("unchecked")
    public EntityType retrieveById(IDType id) {
        return (EntityType) getHibernateTemplate().get(getPersistentClass(), id);
//	        return (EntityType) getHibernateTemplate().get(getPersistentClass(), id);
    }

    /**
     * save the created entity
     *
     * @param entity of type EntityType
     * @return Object of type IDType
     */
    @SuppressWarnings("unchecked")
	public IDType create(EntityType entity) {
        //System.out.println("\n\t---> " + getSessionFactory().getCurrentSession().save(entity));
//return  (IDType) getSessionFactory().getCurrentSession().save(entity);
    	getHibernateTemplate().setCheckWriteOperations(false);
    	
    return (IDType) getHibernateTemplate().save(entity);
        
    }

    /**
     * Update entity
     *
     * @param entity of type EntityType
     */
   // @Override
    public void update(EntityType entity) {
        getHibernateTemplate().saveOrUpdate(entity);
    }

    /**
     * Delete created Entity
     *
     * @param entity of type EntityType
     */
    //@Override
    public void delete(EntityType entity) {
        getHibernateTemplate().delete(entity);
    }

    /**
     * Delete created Entity by a particular Id
     *
     * @param id of type IDType
     */
    //@Override
    public void deleteById(IDType id) {
        delete(retrieveById(id));
    }

    /**
     * Retrive all data
     *
     * @return List of type EntityType
     */
    @SuppressWarnings("unchecked")
    //@Override
    public List<EntityType> retrieveAll() {

//	    	 return getHibernateTemplate().createQuery("from " + persistentClass.getName()).list();
        List<EntityType> list = (List<EntityType>) getHibernateTemplate().loadAll(getPersistentClass());
        DistinctRootEntityResultTransformer transformer = DistinctRootEntityResultTransformer.INSTANCE;
        list = transformer.transformList(list);
        return list;
    }

    /**
     * Retrive data in a particular order@p
     *
     * @param orderBy of type String
     * @return List of type EntityType
     */
    @SuppressWarnings("unchecked")
    //@Override
    public List<EntityType> findAll(String orderBy) {

        List<EntityType> list = (List<EntityType>) getHibernateTemplate().findByCriteria(
                DetachedCriteria.forClass(getPersistentClass()).addOrder(Order.asc(orderBy)));
        DistinctRootEntityResultTransformer transformer = DistinctRootEntityResultTransformer.INSTANCE;
        list = transformer.transformList(list);
        return list;
    }
//
//
//	private final Class<T> persistentClass;
//    
//    @SuppressWarnings("unchecked")
//    public GenericDaoImpl(){
//        this.persistentClass =(Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
//    }
//     
//    @Autowired
//    private SessionFactory sessionFactory;
// 
//    protected Session getSession(){
//        return sessionFactory.getCurrentSession();
//    }
// 
//    @SuppressWarnings("unchecked")
//    public T getByKey(PK key) {
//        return (T) getSession().get(persistentClass, key);
//    }
// 
//    public void persist(T entity) {
//        getSession().persist(entity);
//    }
// 
//    public void delete(T entity) {
//        getSession().delete(entity);
//    }
//     
//    protected Criteria createEntityCriteria(){
//        return getSession().createCriteria(persistentClass);
//    }
}
