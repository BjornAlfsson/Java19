package se.alten.java19project.transaction;

import se.alten.java19project.entity.Java;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
@Default
public class JavaTransaction implements JavaTransactionAccess{

    @PersistenceContext(unitName="java19")
    private EntityManager entityManager;

    @Override
    public List getAllNames() {
        System.out.println("In TRANSACTION&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        Query query = entityManager.createQuery("SELECT j FROM Java j");
        return query.getResultList();
    }

    @Override
    public void addName(Java name) {
        entityManager.persist(name);
        entityManager.flush();
    }
}
