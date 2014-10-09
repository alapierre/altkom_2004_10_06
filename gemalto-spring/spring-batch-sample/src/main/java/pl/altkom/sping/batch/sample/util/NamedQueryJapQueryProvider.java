/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.sping.batch.sample.util;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.batch.item.database.orm.JpaQueryProvider;

/**
 *
 * @author admin
 */
public class NamedQueryJapQueryProvider implements JpaQueryProvider {

    @PersistenceContext
    private EntityManager entityManager;
    
    private String queryName;
    
    @Override
    public Query createQuery() {
        return entityManager.createNamedQuery(queryName);
    }

    @Override
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
        
    }

    public void setQueryName(String queryName) {
        this.queryName = queryName;
    }
    
    
    
}
