/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.app.core.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.Serializable;
import java.util.List;

/**
 * How to User this BaseDao Extend Dao Classes from BaseDao class.
 * <p/>
 * Please Read the method doc.
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class BaseDao {

    protected static SessionFactory sessionFactory;
    protected Session session;
    protected Transaction transaction;

    /**
     * Get Session Factory object.
     *
     * @return SessionFactory
     */
    public SessionFactory getSessionFactory() {
        if (BaseDao.sessionFactory == null) {
            this.setSessionFactory(new Configuration().configure().buildSessionFactory());
        }
        return BaseDao.sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        BaseDao.sessionFactory = sessionFactory;
    }

    /**
     * Get Session Object.
     *
     * @return Session
     */
    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    /**
     * Run this method before you begin any transaction.
     */
    protected void beginTransaction() {
        this.setSession(this.getSessionFactory().openSession());
        this.setTransaction(this.getSession().beginTransaction());
    }

    /**
     * Run this method after you complete any transaction successfully.
     */
    protected void commitTransaction() {
        this.getTransaction().commit();
        this.closeSession();
    }

    /**
     * Run this method if there are errors during the transaction.
     */
    protected void rollbackTransaction() {
        this.getTransaction().rollback();
        this.closeSession();
    }

    protected void closeSession() {
        this.getSession().close();
    }

    /**
     * saveEntity will save a hibernate Object
     *
     * @param o Object
     * @return Object
     */
    public Object saveEntity(Object o) {
        try {
            this.beginTransaction();
            Object ob = this.getSession().save(o);
            this.commitTransaction();
            o = this.getEntityByPrimaryKey(o.getClass(), ob);
        } catch (Exception e) {
            this.rollbackTransaction();
        } finally {
            return o;
        }
    }

    /**
     * Get hibernate entity by primary key.
     *
     * @param cls Class class name
     * @param key Object primary key
     * @return Object
     */
    public Object getEntityByPrimaryKey(Class cls, Object key, boolean closeTx) {
        Object o = new Object();
        try {
            this.beginTransaction();
            o = this.getSession().get(cls, (Serializable) key);
            if (closeTx) {
                this.commitTransaction();
            }
        } catch (Exception e) {
            this.rollbackTransaction();
        } finally {
            return o;
        }
    }

    public Object getEntityByPrimaryKey(Class cls, Object key) {
        return this.getEntityByPrimaryKey(cls, key, false);
    }

    /**
     * Get hibernate entity by primary key.
     *
     * @param cls Class class name
     * @param key Serializable primary key
     * @return Object
     */
    public Object getEntityByPrimaryKey(Class cls, Serializable key, boolean closeTx) {
        Object o = new Object();
        try {
            this.beginTransaction();
            o = this.getSession().get(cls, key);
            if (closeTx) {
                this.commitTransaction();
            }
        } catch (Exception e) {
            this.rollbackTransaction();
        } finally {
            return o;
        }
    }

    public Object getEntityByPrimaryKey(Class cls, Serializable key) {
        return this.getEntityByPrimaryKey(cls, key, false);
    }

    /**
     * Delete entity by primary key
     *
     * @param cls Class
     * @param key Object
     * @return int number of record deleted.
     */
    public int deletEntityByPrimaryKey(Class cls, Object key) {
        int count = 0;
        try {
            this.beginTransaction();
            Object o = this.getEntityByPrimaryKey(cls, key);
            count = this.deleteEntity(o);
            this.commitTransaction();
        } catch (Exception e) {
            this.rollbackTransaction();
        } finally {
            return count;
        }
    }

    /**
     * Delete entity by object
     *
     * @param o Object Object for delete.
     * @return int number of records deleted.
     */
    protected int deleteEntity(Object o) {
        int count = 0;
        try {
            this.getSession().delete(o);
            count = 1;

        } catch (Exception e) {
            this.rollbackTransaction();
        } finally {
            return count;
        }
    }

    /**
     * Update changed object.
     *
     * @param o Object
     * @return Object
     */
    public Object updateEntity(Object o) {
        return this.updateEntity(o, true);
    }

    public Object updateEntity(Object o, boolean closeTx) {
        try {
            if (!this.getSession().isConnected()) {
                this.beginTransaction();
            }
            this.getSession().update(o);
            if (closeTx) {
                this.commitTransaction();
            }
//            Serializable key = this.getSessionFactory().getClassMetadata(o.getClass()).getIdentifier(o);
//            o = this.getEntityByPrimaryKey(o.getClass(), key);
        } catch (Exception e) {
            this.rollbackTransaction();
        } finally {
            return o;
        }
    }

    /**
     * @param sql String HQL
     * @return List
     */
    public List executeQuery(String sql, boolean claseTx) {
        this.beginTransaction();
        Query query = this.getSession().createQuery(sql);
        List l = query.list();
        if (claseTx) {
            this.commitTransaction();
        }
        return l;
    }

    public List executeQuery(String sql) {
        return this.executeQuery(sql, false);
    }
}
